import java.io.File

// next phase: McCabe complexity: count if, while, ||, &&, for (as long as they are tokens)
// then: analyze [], for, if, foreach, ArrayLists, &&, ||
// SHIT! Dit wordt complex.
// Wat zijn mijn doelen?
// 1. Bibliotheek van opgaven
// 2. zorgen dat je kan zoeken op complexiteit en construct
// 3. Zeg 4x opgaven maken, 1x display
// // Swing app: gesorteerd op complexiteit.
// Bovenaan: dropdown waar je constructie in kan selecteren
// Kolommen: complexiteit/grootte, naam, constructies, opgave, oplossing
// 1x meta
// meta: wil hebben: soort megafile met
    // grootte

fun main(args: Array<String>) {
    println("Hello World!")
    val rootdir = "D:\\Development\\ITvitae\\JavaExercises\\src\\main\\java\\exercises"
    val files = File(rootdir).listFiles()!!
    for (file in files) {
        analyze(file)
    }

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}


data class Report(val total: Int, val blank: Int, val opening: Int, val comments: Int, val code: Int) {
    operator fun plus(other: Report): Report {
        return Report(
            total + other.total,
            blank + other.blank,
            opening + other.opening,
            comments + other.comments,
            code + other.code
        )
    }

    override fun toString() = "total: $total, blank: $blank, opening: $opening, comments: $comments, code: $code"
}

fun analyze(file: File): Report {
    val lines = file.readLines().map { it.trim() }
    print(file.name + ": ")
    val (blankLines, nonBlankLines) = lines.partition { it.isEmpty() }
    val numBlankLines = blankLines.size
    val (openingLines, otherLines) = nonBlankLines.span { it.isStartingLine() }
    val numOpeningLines = openingLines.size
    val (commentLines, codeReport) = countCommentLines(otherLines)
    println(codeReport)
    codeReport.showInteresting()
    val codeLines = otherLines.size - commentLines
    val report = Report(lines.size, numBlankLines, numOpeningLines, commentLines, codeLines)
    println(report)
    return report
}

class CodeReport {
    private val contents = mutableMapOf<String, Int>()
    fun addLine(line: String) {
        val tokens = line.split(" ", "(", ")", "{", "}", ";", ".")
        tokens.forEach { token ->
            if (token.any { it.isLetter() }) contents.merge(token, 1) { p, _ -> p + 1 }
        }
    }

    override fun toString() = contents.toString()

    val interesting = listOf("ArrayList", "boolean", "do", "if", "int", "for", "return", "Scanner", "String", "switch",
        "System.out.print", "System.out.printf", "System.out.println",
        "toUpperCase", "while")

    fun showInteresting() {
        contents.keys.filter { it in interesting }.forEach { println("$it: ${contents[it]}") }
    }
}


private fun countCommentLines(otherLines: List<String>): Pair<Int, CodeReport> {
    var commentMode = false
    var commentLines = 0
    val codeReport = CodeReport()
    for (line in otherLines) {
        if (line.startsWith("//")) commentLines++
        else if (line.startsWith("/*")) {
            commentLines++
            commentMode = true
        } else if (commentMode) commentLines++
        if (!commentMode && !line.startsWith("//")) codeReport.addLine(line)
        if (line.endsWith("*/")) commentMode = false
    }
    return commentLines to codeReport
}

private fun String.isStartingLine() = startsWith("import") || startsWith("package")

private fun <E> List<E>.span(predicate: (E) -> Boolean): Pair<List<E>, List<E>> {
    val first = takeWhile(predicate)
    val second = dropWhile(predicate)
    return first to second
}
