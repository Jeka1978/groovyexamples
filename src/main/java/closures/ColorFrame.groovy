package closures

import javax.swing.JButton
import javax.swing.JFrame
import java.awt.BorderLayout
import java.awt.Color

/**
 * @author Evgeny Borisov
 */
class ColorFrame extends JFrame {
    ColorFrame() {
        def button = new JButton('Click to ChangeColor')
        getContentPane().add(button, BorderLayout.NORTH)
        setSize(500,500)
        setVisible(true)
        setDefaultCloseOperation(EXIT_ON_CLOSE)
        button.addActionListener{println(it)}
    }

    public static void main(String[] args) {
        new ColorFrame()
    }
}
