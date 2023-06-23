package VersuchsVersionen.Other.JFrameTests;
import javax.swing.*;
import java.awt.*;
public class Test extends JFrame {
    JLabel test1;
    int testInt1;
    public Test(){
        testInt1 = 1;
        test1 = new JLabel(String.valueOf(testInt1));
        add(test1);

        testInt1 = 2;
        test1 = new JLabel(String.valueOf(testInt1));
        test1.setText(String.valueOf(testInt1));

        testInt1 = 3;
        test1 = new JLabel(String.valueOf(testInt1));
        test1.setText(String.valueOf(testInt1));

        setSize(100, 100);
        setVisible(true);
        setResizable(false);
    }
}
