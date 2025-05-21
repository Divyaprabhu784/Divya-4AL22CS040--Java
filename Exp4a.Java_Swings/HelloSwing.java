package adjlab345;

import javax.swing.*; // For JFrame, JLabel, SwingUtilities
import java.awt.*;    // For Font, Color

public class lab4a {
    lab4a() {
        // Create a new JFrame container
        JFrame jfrm = new JFrame("A Simple Swing Application");

        // Set the initial size of the frame
        jfrm.setSize(600, 200);

        // Terminate the program when the user closes the application
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a label
        JLabel jlab = new JLabel("Hello! VI A, Welcome to Swing Programming!");

        // Customize the label
        jlab.setFont(new Font("Verdana", Font.PLAIN, 24));
        jlab.setForeground(new Color(0, 0, 255));
        jlab.setHorizontalAlignment(SwingConstants.CENTER); // Center the label

        // Add the label to the content pane
        jfrm.add(jlab);

        // Make the frame visible
        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        // Create the frame on the event dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new lab4a(); // Corrected the class name
            }
        });
    }
}
