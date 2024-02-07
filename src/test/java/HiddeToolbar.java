import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class HiddeToolbar {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Full Screen Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JButton toggleButton = new JButton("Toggle Full Screen");
            toggleButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    toggleFullScreen(frame);
                }
            });

            JPanel panel = new JPanel();
            panel.add(toggleButton);

            frame.setLayout(new BorderLayout());
            frame.add(panel, BorderLayout.CENTER);

            frame.setSize(400, 300);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }

    private static void toggleFullScreen(JFrame frame) {
        if (frame.isUndecorated()) {
            // If currently in full-screen mode, restore to normal mode
            frame.setExtendedState(JFrame.NORMAL);
        } else {
            // If currently in normal mode, switch to full-screen mode
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setUndecorated(true);
        }
    }
}
