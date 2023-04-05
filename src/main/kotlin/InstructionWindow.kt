import java.awt.*
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JTextArea

class InstructionWindow(fileSummary: FileSummary) : JFrame() {
    private val instructions = JTextArea(fileSummary.instruction().lineLengthLimited(80)).apply {
        font = Font("Consolas", Font.PLAIN, 14)
    }

    private val solutionButton = JButton("Show a Solution").apply {
        addActionListener { SolutionWindow(fileSummary) }
    }

    private val instructionConstraints = GridBagConstraints().apply {
        gridx = 0
        gridy = 0
        weightx = 1.0
        weighty = 1000.0
        insets = Insets(0, 0, 0, 0)
        fill = GridBagConstraints.BOTH
    }

    private val solutionButtonConstraints = GridBagConstraints().apply {
        gridx = 0
        gridy = 1
        weightx = 1.0
        weighty = 1.0
        insets = Insets(0, 0, 0, 0)
        fill = GridBagConstraints.BOTH
    }

    init {
        layout = GridBagLayout()
        add(instructions, instructionConstraints)
        add(solutionButton, solutionButtonConstraints)
        size = Dimension(700, 500)
        isVisible = true
    }
}