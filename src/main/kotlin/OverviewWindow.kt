import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.*
import javax.swing.table.DefaultTableModel
import javax.swing.table.TableCellRenderer

import Status.*
import javax.swing.event.DocumentEvent
import javax.swing.event.DocumentListener

class DelegatingDocumentListener(private val handler: () -> Unit) : DocumentListener {

    private fun processUpdate() = handler()

    override fun changedUpdate(arg0: DocumentEvent) = processUpdate()

    override fun insertUpdate(arg0: DocumentEvent) = processUpdate()

    override fun removeUpdate(arg0: DocumentEvent) = processUpdate()
}

class OverviewWindow(fileSummaries: MutableList<FileSummary>) : JFrame() {
    private val exercises = mutableMapOf<Int, FileSummary>()
    private val frameReference = this

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
    private val lightYellow = Color(maxBrightness, maxBrightness, tint)
    private val lightBlue = Color(tint, tint, maxBrightness)

    private fun getStatusColor(row: Int): Color = when (exercises[row]?.completionStatus()) {
        null, NOT_YET_TRIED -> Color.WHITE
        INCUBATING -> lightBlue
        RETRY -> lightYellow
        SUCCEEDED -> lightGreen
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

    private fun updateTitle() {
        val statusCounts = sortedFileSummaries.groupingBy { it.completionStatus() }.eachCount()
        fun counts(status: Status) = statusCounts[status] ?: 0

        title = "CodingExerciser 1.02:" +
                "${sortedFileSummaries.size} exercises in total, ${counts(SUCCEEDED)} completed, " +
                "${counts(INCUBATING)} incubating, and ${counts(RETRY)} being trained on"
    }

    fun updateTable(tagName: String) {
        val tableModel = UnchangeableTableModel()
        tableModel.addColumn("size")
        tableModel.addColumn("name")
        tableModel.addColumn("techniques")
        tableModel.addColumn("instructions")
        var row = 0
        sortedFileSummaries.filter {
            it.filename.contains(
                searchBox.text,
                true
            ) && (tagName == "ANY" || tagName in it.tagNames())
        }.forEach {
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
        updateTitle()
    }

    class UnchangeableTableModel : DefaultTableModel() {
        override fun isCellEditable(row: Int, column: Int): Boolean {
            // all cells are false (uneditable)
            return false
        }
    }

    private val scrollPane = JScrollPane(table)

    private val searchText = JLabel("Search for name that includes:")

    private val searchTextConstraints = GridBagConstraints().apply {
        gridx = 0
        gridy = 0
        weightx = 1.0
        weighty = 1.0
        insets = Insets(0, 0, 0, 0)
        fill = GridBagConstraints.BOTH
    }

    private val searchFieldListener = DelegatingDocumentListener { updateTable(dropDown.selectedItem!!.toString()) }

    private val searchBox = JTextField().apply {
        document.addDocumentListener(searchFieldListener)
    }

    private val searchBoxConstraints = GridBagConstraints().apply {
        gridx = 1
        gridy = 0
        weightx = 1.0
        weighty = 1.0
        insets = Insets(0, 0, 0, 0)
        fill = GridBagConstraints.BOTH
    }

    private val dropdownConstraints = GridBagConstraints().apply {
        gridx = 0
        gridy = 1
        gridwidth = 2
        weightx = 1.0
        weighty = 1.0
        insets = Insets(0, 0, 0, 0)
        fill = GridBagConstraints.BOTH
    }

    private val tableConstraints = GridBagConstraints().apply {
        gridx = 0
        gridy = 2
        gridwidth = 2
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
                    val fileSummary = sortedFileSummaries.find { it.filename == key }!!
                    if (fileSummary.completionStatus() == INCUBATING) JOptionPane.showMessageDialog(
                        frameReference,
                        "Please allow this problem to incubate in your brain and try again tomorrow :)"
                    )
                    else InstructionWindow(fileSummary)
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
        add(searchText, searchTextConstraints)
        add(searchBox, searchBoxConstraints)
        add(dropDown, dropdownConstraints)
        add(scrollPane, tableConstraints)
        size = Dimension(1000, 800)
        updateTable("ANY")
        initializeEntriesList()
        defaultCloseOperation = EXIT_ON_CLOSE
        this.isVisible = true
    }
}
