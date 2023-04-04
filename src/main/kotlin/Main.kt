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
    //val rootdir = "D:\\Development\\ITvitae\\JavaExercises\\src\\main\\java\\exercises"
    val rootdir2 = "C:\\development\\ITvitae\\Java\\JavaExercises\\src\\main\\java\\exercises"
    val files = File(rootdir2).listFiles()!!
    for (file in files) {
        analyze(file)
    }

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
}

enum class Tag {
    ARRAY_INDEX, ARRAY_LENGTH, ARRAYLIST, ARRAYLIST_ADD, ARRAYS, ASCII, ASSIGNMENT, BOOLEAN,
    CHAR, CHARACTER_ISDIGIT, CHARACTER_ISLETTER, CHARACTER_ISSPACECHAR, CHARACTER_TOUPPERCASE,
    CHARSET, CHARSET_AVAILABLECHARSETS, COLLECTION_STREAM, COLLECTIONS_REVERSEORDER,
    DATETIMEFORMATTER, DATETIMEFORMATTER_FORMAT, DATETIMEFORMATTER_OFPATTERN,
    DOUBLE, EXCEPTIONS, FILES, FILES_SIZE, FOR_LOOPS,
    FOREACH_LOOPS, IF, INT,
    INTEGER, INTEGER_PARSEINT, INTEGER_TOBINARYSTRING, INTEGER_TOHEXSTRING, INTEGER_TOOCTALSTRING,
    HASHSET, LAMBDAS, LIST, LIST_ADD, LIST_STREAM, LOCALDATETIME_NOW, MAP, MAP_OF, MAP_KEYSET,
    MATH_ABS, MATH_ACOS, MATH_COS, MATH_MAX, MATH_MIN, MATH_PI, MATH_SIN, MATH_TAN, MATH_TORADIANS, METHODS,
    OPERATORS_ARITHMETIC, OPERATORS_LOGICAL, OPERATORS_RELATIONAL, OPTIONAL, OPTIONAL_ORELSE, PARAMETERS,
    PATHS, PATHS_GET, RECORDS,
    REMAINDER_OPERATOR, RETURN, SCANNER,
    SCANNER_HASNEXT, SCANNER_NEXT, SCANNER_NEXTBOOLEAN, SCANNER_NEXTDOUBLE,
    SCANNER_NEXTINT, SCANNER_NEXTLINE, SET, SET_ADD, SET_CONTAINS, SET_ISEMPTY, SET_REMOVE,
    STREAM_FILTER, STREAM_FINDFIRST, STREAM_MAP, STREAM_MAPTOINT, STREAM_SORTED, STREAM_TOARRAY,
    STRING, STRING_CHARAT,
    STRING_CONCATENATION, STRING_EQUALS, STRING_INDEXOF, STRING_LENGTH, STRING_STARTSWITH, STRING_SUBSTRING, STRING_TOUPPERCASE, STRING_TRIM,
    STRINGBUILDER, STRINGBUILDER_INSERT, STRINGBUILDER_REVERSE, SYSTEM_GETPROPERTY,
    SYSTEM, SYSTEM_CURRENTTIMEMILLIS, SYSTEM_OUT_PRINT, SYSTEM_OUT_PRINTF, SYSTEM_OUT_PRINTLN,
    TEXT_BLOCKS, TRY_CATCH, VARARGS, WHILE_LOOPS
}

data class Report(
    val filename: String,
    val total: Int,
    val blank: Int,
    val opening: Int,
    val comments: Int,
    val code: Int
) {
    private val tags = mutableListOf<Tag>()
    private var description = "";

    operator fun plus(other: Report): Report {
        return Report(
            other.filename + "; " + filename,
            total + other.total,
            blank + other.blank,
            opening + other.opening,
            comments + other.comments,
            code + other.code
        )
    }

    fun addTag(tag: String) {
        val normalizedTag = tag.uppercase().replace(".", "_").replace("-", "_").removeSuffix("()")
        val officialTag = Tag.values().find { it.name == normalizedTag }
        if (officialTag != null) {
            tags += officialTag
        } else {
            println("Not found in $filename: $normalizedTag")
        }
    }

    fun addDescriptionLine(descriptionLine: String) {
        description += descriptionLine
    }

    override fun toString() = "total: $total, blank: $blank, opening: $opening, comments: $comments, code: $code"
}

fun analyze(file: File): Report {

    val lines = file.readLines().map { it.trim() }
    //print(file.name + ": ")

    val (blankLines, nonBlankLines) = lines.partition { it.isEmpty() }
    val numBlankLines = blankLines.size
    val (openingLines, otherLines) = nonBlankLines.span { it.isStartingLine() }
    val numOpeningLines = openingLines.size
    val (commentLines, codeReport) = countCommentLines(otherLines)
    //println(codeReport)
    codeReport.showInteresting()
    val codeLines = otherLines.size - commentLines
    val report = Report(file.name, lines.size, numBlankLines, numOpeningLines, commentLines, codeLines)
    processTagsAndDescription(lines, report)
    //println(report)
    return report
}

fun processTagsAndDescription(lines: List<String>, report: Report) {
    var inTag = false
    var inDescription = false
    for (line in lines) {
        if (line.startsWith("// TAGS")) {
            inTag = true
        } else if (line.startsWith("import") || line.startsWith("/* DESCRIPTION")) {
            inTag = false
            if (line.startsWith("/* DESCRIPTION")) {
                inDescription = true;
            }
        } else if (inDescription && line.startsWith("*/")) {
            inDescription = false
        }
        if (inTag) {
            line.removePrefix("// TAGS").split(" ", ",").filter { it.isNotBlank() && it.trim() != "//" }
                .map(report::addTag)
        } else if (inDescription) {
            report.addDescriptionLine(line)
        }
    }
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

    val interesting = listOf(
        "ArrayList", "boolean", "do", "if", "int", "for", "return", "Scanner", "String", "switch",
        "System.out.print", "System.out.printf", "System.out.println",
        "toUpperCase", "while"
    )

    fun showInteresting() {
        //contents.keys.filter { it in interesting }.forEach { println("$it: ${contents[it]}") }
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
