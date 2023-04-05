// Note: if this program gets bigger, an extra builder class may help for maintainability.

enum class Status { NOT_YET_TRIED, RETRY, SUCCEEDED }

data class FileSummary(
    val filename: String,
    val total: Int,
    val blank: Int,
    val opening: Int,
    val comments: Int,
    val codeLines: Int
) {
    private val tags = mutableListOf<Tag>()
    private var description = ""
    private var code = ""

    fun tags(): List<Tag> = tags

    fun tagNames(): List<String> = tags.map { it.name }

    fun instruction() = description

    fun code() = code

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
        description += descriptionLine + "\n"
    }

    fun addCodeLine(codeLine: String) {
        if (codeLine.isEmpty() && code.endsWith("\n\n")) return // avoid 2 subsequent blank lines
        code += codeLine + "\n"
    }

    override fun toString() = "filename: $filename, total: $total, blank: $blank, opening: $opening, " +
            "comments: $comments, code: $codeLines; $tags\n\n$description\n\n$code"

    private var completionStatus = Status.NOT_YET_TRIED
    
    fun setCompletionStatus(completed: Boolean) {
        completionStatus = if (completed) Status.SUCCEEDED else Status.RETRY
    }

    fun completionStatus() = completionStatus
}