import java.io.File
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class StatusManager {
    companion object {
        private const val statusFilename = "status.txt"

        fun updateDone(filename: String) {
            updateFileStatus(filename, "DONE")
        }

        private fun updateFileStatus(filename: String, status: String) {
            val lines = if (File(statusFilename).exists()) File(statusFilename).readLines() else listOf()
            val restOfLines = lines.filter { !it.startsWith(filename) }
            val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")
            val formatted = LocalDateTime.now().format(formatter)
            val lineStart = lines.find { it.startsWith(filename) } ?: filename
            val finish = if (status == "DONE") "!" else ","
            val doneLine = "$lineStart $status: $formatted$finish"
            File(statusFilename).writeText((restOfLines + doneLine).joinToString("\n"))
            updateOverview()
        }

        fun updateTryAgainLater(filename: String) {
            updateFileStatus(filename, "NOT_YET_SUCCESSFUL")
        }
    }
}
