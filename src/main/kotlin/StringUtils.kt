fun String.lineLengthLimited(maxLineWidth: Int): String {
    fun toLines(text: String): List<String> {
        if (text.length <= maxLineWidth) return listOf(text)
        val (firstLine, remainder) = splitBeforeIndex(text, maxLineWidth)
        return listOf(firstLine) + toLines(remainder)
    }
    return split("\n").flatMap { toLines(it.trimEnd()) }.joinToString("\n")
}

fun splitBeforeIndex(text: String, width: Int): Pair<String, String> {
    val candidateFirstPart = text.take(width).dropLastWhile { it !in " ,./-:();-_|" }.trim()
    val firstPart = if (candidateFirstPart == "") {
        // AsNoTrackingWithIdentityResolu : so also break at camelcase break
        val camelCaseBreak = text.take(width).dropLastWhile { it.isLowerCase() }.dropLast(1)
        if (camelCaseBreak == "") throw IllegalArgumentException("Cannot split '$text'!")
        camelCaseBreak
    } else candidateFirstPart
    val secondPart = text.removePrefix(firstPart).trimStart()
    return firstPart to secondPart
}