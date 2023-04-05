import java.io.File

const val statusFilename = "status.txt"
val fileSummaries = mutableListOf<FileSummary>()

var overview: OverviewWindow? = null

fun main() {
    val rootDirectory = "exercises"
    val files = File(rootDirectory).listFiles()!!
    for (file in files) {
        fileSummaries += analyze(file)
    }
    updateExerciseStatus()
    overview = OverviewWindow(fileSummaries)
}

private fun updateExerciseStatus() {
    getExerciseStatuses().forEach { line ->
        fileSummaries.find { line.startsWith(it.filename) }?.setCompletionStatus(line)
    }
}

fun getExerciseStatuses(): List<String> {
    val statusFile = File(statusFilename)
    return if (statusFile.exists()) statusFile.readLines() else listOf()
}

fun updateOverview() {
    updateExerciseStatus()
    overview!!.updateTable("ANY")
}

fun analyze(file: File): FileSummary {

    val originalLines = file.readLines()
    val trimmedLines = originalLines.map { it.trim() }

    val (blankLines, nonBlankLines) = trimmedLines.partition { it.isEmpty() }
    val numBlankLines = blankLines.size
    val (openingLines, otherLines) = nonBlankLines.span { it.isStartingLine() }
    val numOpeningLines = openingLines.size
    val commentLines = countCommentLines(otherLines)
    val codeLines = otherLines.size - commentLines
    val report = FileSummary(file.name, originalLines.size, numBlankLines, numOpeningLines, commentLines, codeLines)
    processTagsAndDescription(originalLines, report)
    return report
}

enum class ParseStatus { REGULAR_PROGRAM_OPENING, IN_TAGS, IN_DESCRIPTION, AFTER_DESCRIPTION }

fun processTagsAndDescription(lines: List<String>, report: FileSummary) {

    var parseStatus = ParseStatus.REGULAR_PROGRAM_OPENING
    for (line in lines) {
        parseStatus = updateParseStatus(line, parseStatus)
        addLineToReport(parseStatus, line, report)
    }
}

private fun updateParseStatus(line: String, currentParseStatus: ParseStatus): ParseStatus = when {
    line.startsWith("// TAGS") -> ParseStatus.IN_TAGS
    line.startsWith("import") -> ParseStatus.REGULAR_PROGRAM_OPENING
    line.startsWith("/* DESCRIPTION") -> ParseStatus.IN_DESCRIPTION
    line.trim().startsWith("*/") && currentParseStatus == ParseStatus.IN_DESCRIPTION -> ParseStatus.AFTER_DESCRIPTION

    else -> currentParseStatus
}

private fun addLineToReport(parseStatus: ParseStatus, line: String, report: FileSummary) {
    if (parseStatus == ParseStatus.IN_TAGS) {
        line.removePrefix("// TAGS").split(" ", ",").filter { it.isNotBlank() && it.trim() != "//" }.map(report::addTag)
    } else if (parseStatus == ParseStatus.IN_DESCRIPTION) {
        if (!line.startsWith("/* DESCRIPTION")) {
            report.addDescriptionLine(line)
        }
    } else if (line.trim() != "*/") report.addCodeLine(line)
}

private fun countCommentLines(otherLines: List<String>): Int {
    var commentMode = false
    var commentLines = 0
    for (line in otherLines) {
        if (line.startsWith("//")) commentLines++
        else if (line.startsWith("/*")) {
            commentLines++
            commentMode = true
        } else if (commentMode) commentLines++
        if (line.endsWith("*/")) commentMode = false
    }
    return commentLines
}

private fun String.isStartingLine() = startsWith("import") || startsWith("package")

private fun <E> List<E>.span(predicate: (E) -> Boolean): Pair<List<E>, List<E>> {
    val first = takeWhile(predicate)
    val second = dropWhile(predicate)
    return first to second
}
