fun String.lineLengthLimited(maxLineWidth: Int): String {
    fun toLines(text: String): List<String> {
        if (text.length <= maxLineWidth) return listOf(text.trim())
        val (firstLine, remainder) = splitBeforeIndex(text, maxLineWidth)
        return listOf(firstLine) + toLines(remainder)
    }
    return split("\n").flatMap { toLines(it.trimEnd()) }.joinToString("\n")
}

fun splitBeforeIndex(text: String, width: Int): Pair<String, String> {
    val candidateFirstPart = text.take(width).dropLastWhile { it !in " ,./-:();-_|" }
    val firstPart = candidateFirstPart.ifBlank {
        // AsNoTrackingWithIdentityResolu : so also break at camelcase break
        val camelCaseBreak = text.take(width).dropLastWhile { it.isLowerCase() }.dropLast(1)
        if (camelCaseBreak == "") throw IllegalArgumentException("Cannot split '$text'!")
        camelCaseBreak
    }
    val secondPart = text.removePrefix(firstPart)
    return firstPart.trim() to secondPart.trim()
}