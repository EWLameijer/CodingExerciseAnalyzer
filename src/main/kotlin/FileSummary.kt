import java.time.Duration
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

// Note: if this program gets bigger, an extra builder class may help for maintainability.

enum class Status { NOT_YET_TRIED, INCUBATING, RETRY, SUCCEEDED }

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

    fun setCompletionStatus(line: String) {
        completionStatus = if (line.endsWith("!")) Status.SUCCEEDED
        else {
            val dateTimePattern = "yyyy-MM-dd HH:mm"
            val lastPractice = line.removeSuffix(",").takeLast(dateTimePattern.length)
            val pattern = DateTimeFormatter.ofPattern(dateTimePattern)
            val timeOfLastPractice = LocalDateTime.parse(lastPractice, pattern)
            if (Duration.between(timeOfLastPractice, LocalDateTime.now()) > Duration.ofDays(1)) Status.RETRY
            else Status.INCUBATING
        }
    }

    fun completionStatus() = completionStatus
}