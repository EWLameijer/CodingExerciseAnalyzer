import java.awt.Dimension
import java.awt.Font
import java.awt.GridBagConstraints
import java.awt.GridBagLayout
import java.awt.Insets
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JTextArea

class SolutionWindow(fileSummary: FileSummary) : JFrame() {
    private val solution = JTextArea(fileSummary.code()).apply {
        font = Font("Consolas", Font.PLAIN, 14)
    }
    
    private val iDidItButton = JButton("I did it!").apply {
        addActionListener { StatusManager.updateDone(fileSummary.filename) }
    }

    private val iShouldTryAgainLater = JButton("I should try again later...").apply {
        addActionListener { StatusManager.updateTryAgainLater(fileSummary.filename) }
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
    }
}
