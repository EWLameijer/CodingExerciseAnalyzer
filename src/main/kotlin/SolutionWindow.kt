import java.awt.Dimension
import java.awt.Font
import java.awt.GridBagConstraints
import java.awt.GridBagLayout
import java.awt.Insets
import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JOptionPane
import javax.swing.JTextArea

class SolutionWindow(private val fileSummary: FileSummary, private val parent: InstructionWindow) : JFrame() {
    private val solution = JTextArea(fileSummary.code()).apply {
        font = Font("Consolas", Font.PLAIN, 14)
    }

    private val iDidItButton = JButton("I did it!").apply {
        addActionListener { buttonAction(StatusManager::updateDone) }
    }

    private val iShouldTryAgainLater = JButton("I should try again later...").apply {
        addActionListener { buttonAction(StatusManager::updateTryAgainLater) }
    }

    private fun buttonAction(action: (String) -> Unit) {
        action(fileSummary.filename)
        parent.dispose()
        dispose()
    }

    private val solutionConstraints = GridBagConstraints().apply {
        gridx = 0
        gridy = 0
        gridwidth = 2
        weightx = 1.0
        weighty = 1000.0
        insets = Insets(0, 0, 0, 0)
        fill = GridBagConstraints.BOTH
    }

    private val iDidItButtonConstraints = GridBagConstraints().apply {
        gridx = 0
        gridy = 1
        weightx = 1.0
        weighty = 1.0
        insets = Insets(0, 0, 0, 0)
        fill = GridBagConstraints.BOTH
    }
    private val iShouldTryAgainLaterButtonConstraints = GridBagConstraints().apply {
        gridx = 1
        gridy = 1
        weightx = 1.0
        weighty = 1.0
        insets = Insets(0, 0, 0, 0)
        fill = GridBagConstraints.BOTH
    }

    init {
        layout = GridBagLayout()
        add(solution, solutionConstraints)
        add(iDidItButton, iDidItButtonConstraints)
        add(iShouldTryAgainLater, iShouldTryAgainLaterButtonConstraints)
        size = Dimension(500, 500)
        isVisible = true

        addWindowListener(object : WindowAdapter() {
            override fun windowClosing(windowEvent : WindowEvent) {
                buttonAction(StatusManager::updateTryAgainLater)
            }
        })
    }
}
