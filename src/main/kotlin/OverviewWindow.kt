import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.JComboBox
import javax.swing.JFrame
import javax.swing.JScrollPane
import javax.swing.JTable
import javax.swing.table.DefaultTableModel
import javax.swing.table.TableCellRenderer

class OverviewWindow(fileSummaries: MutableList<FileSummary>) : JFrame() {
    private val exercises = mutableMapOf<Int, FileSummary>()

    private val sortedFileSummaries = fileSummaries.sortedBy { it.codeLines }

    private val table = object : JTable() {
        override fun getToolTipText(e: MouseEvent): String? {
            var tip: String? = null
            val p = e.point
            val rowIndex = rowAtPoint(p)
            val colIndex = columnAtPoint(p)
            try {
                tip = getValueAt(rowIndex, colIndex).toString().htmlOfMaxLineLength(100)
            } catch (_: RuntimeException) {
                // catch null pointer exception if mouse is over an empty line
                // it is fine to ignore this exception; the method will just return null, which will yield the appropriate result
            }
            return tip
        }

        override fun prepareRenderer(tcr: TableCellRenderer, row: Int, column: Int): Component {
            val component = super.prepareRenderer(tcr, row, column)
            component.background = getStatusColor(row)
            return component
        }
    }

    private val tint = 200 // for soft background colors that enable reading the text easily
    private val maxBrightness = 255
    private val lightGreen = Color(tint, maxBrightness, tint)
    private val lightRed = Color(maxBrightness, tint, tint)

    private fun getStatusColor(row: Int): Color = when (exercises[row]?.completionStatus()) {
        null, Status.NOT_YET_TRIED -> Color.WHITE
        Status.SUCCEEDED -> lightGreen
        Status.RETRY -> lightRed
    }

    fun String.htmlOfMaxLineLength(maxLineLength: Int): String {
        val words = split(' ')
        val currentLine = StringBuilder()
        val allLines = StringBuilder()
        for (wordIndex in words.indices) {
            if (currentLine.isNotEmpty()) currentLine.append(' ')
            currentLine.append(words[wordIndex])
            if (wordIndex == words.lastIndex || currentLine.length + words[wordIndex + 1].length + 1 > maxLineLength) {
                if (allLines.isNotEmpty()) allLines.append("<br>")
                allLines.append(currentLine)
                currentLine.clear()
            }
        }
        return "<html>$allLines</html>"
    }

    fun updateTable(tagName: String) {
        val tableModel = UnchangeableTableModel()
        tableModel.addColumn("size")
        tableModel.addColumn("name")
        tableModel.addColumn("techniques")
        tableModel.addColumn("instructions")
        var row = 0
        sortedFileSummaries.filter { tagName == "ANY" || tagName in it.tagNames() }.forEach {
            tableModel.addRow(
                arrayOf(
                    it.codeLines,
                    it.filename,
                    it.tags(),
                    it.instruction()
                )
            )
            exercises[row] = it
            row++
        }
        table.model = tableModel
    }

    class UnchangeableTableModel : DefaultTableModel() {
        override fun isCellEditable(row: Int, column: Int): Boolean {
            // all cells are false (uneditable)
            return false
        }
    }

    private val scrollPane = JScrollPane(table)

    private val dropdownConstraints = GridBagConstraints().apply {
        gridx = 0
        gridy = 0
        weightx = 1.0
        weighty = 1.0
        insets = Insets(0, 0, 0, 0)
        fill = GridBagConstraints.BOTH
    }

    private val tableConstraints = GridBagConstraints().apply {
        gridx = 0
        gridy = 1
        weightx = 1.0
        weighty = 1000.0
        insets = Insets(0, 0, 0, 0)
        fill = GridBagConstraints.BOTH
    }

    private fun initializeEntriesList() {
        table.fillsViewportHeight = true
        table.addMouseListener(object : MouseAdapter() {
            override fun mousePressed(mouseEvent: MouseEvent) {
                val table = mouseEvent.source as JTable
                val point = mouseEvent.point
                val row = table.rowAtPoint(point)
                if (mouseEvent.clickCount == 2 && table.selectedRow != -1) {
                    val key = table.getValueAt(row, 1) as String
                    InstructionWindow(sortedFileSummaries.find { it.filename == key }!!)
                }
            }
        })
    }

    private val tagNames = arrayOf("ANY") + Tag.values().map { it.name }

    private val dropDown = JComboBox(tagNames).apply {
        addActionListener { displayChoice(it) }
    }

    private fun displayChoice(event: ActionEvent?) {
        val chosenValue = (event!!.source as JComboBox<*>).selectedItem as String
        updateTable(chosenValue)
    }

    init {
        layout = GridBagLayout()
        add(dropDown, dropdownConstraints)
        add(scrollPane, tableConstraints)
        size = Dimension(1000, 800)
        updateTable("ANY")
        initializeEntriesList()
        defaultCloseOperation = EXIT_ON_CLOSE
        this.isVisible = true
    }
}