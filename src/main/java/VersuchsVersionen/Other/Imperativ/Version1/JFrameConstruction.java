package VersuchsVersionen.Other.Imperativ.Version1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;

public class JFrameConstruction extends JFrame implements AWTEventListener {
    private int inputContainer = 0;
    private JPanel b1X1Panel;
    private JPanel b2X1Panel;
    private JPanel b3X1Panel;
    private JPanel b4X1Panel;
    private JPanel b1X2Panel;
    private JPanel b2X2Panel;
    private JPanel b3X2Panel;
    private JPanel b4X2Panel;
    private JPanel b1X3Panel;
    private JPanel b2X3Panel;
    private JPanel b3X3Panel;
    private JPanel b4X3Panel;
    private JPanel b1X4Panel;
    private JPanel b2X4Panel;
    private JPanel b3X4Panel;
    private JPanel b4X4Panel;
    private JPanel background;


    private JLabel b1X1Label;
    private JLabel b2X1Label;
    private JLabel b3X1Label;
    private JLabel b4X1Label;
    private JLabel b1X2Label;
    private JLabel b2X2Label;
    private JLabel b3X2Label;
    private JLabel b4X2Label;
    private JLabel b1X3Label;
    private JLabel b2X3Label;
    private JLabel b3X3Label;
    private JLabel b4X3Label;
    private JLabel b1X4Label;
    private JLabel b2X4Label;
    private JLabel b3X4Label;
    private JLabel b4X4Label;


    private int intB1x1 = 1;
    private int intB2x1 = 2;
    private int intB3x1 = 3;
    private int intB4x1 = 4;
    private int intB1x2 = 5;
    private int intB2x2 = 6;
    private int intB3x2 = 7;
    private int intB4x2 = 8;
    private int intB1x3 = 9;
    private int intB2x3 = 10;
    private int intB3x3 = 11;
    private int intB4x3 = 12;
    private int intB1x4 = 13;
    private int intB2x4 = 14;
    private int intB3x4 = 15;
    private int intB4x4 = 16;

    public JFrameConstruction(int intB1x1, int intB1x2, int intB1x3, int intB1x4, int intB2x1, int intB2x2, int intB2x3, int intB2x4, int intB3x1, int intB3x2, int intB3x3, int intB3x4, int intB4x1, int intB4x2, int intB4x3, int intB4x4) {
        this.intB1x1 = intB1x1;
        this.intB1x2 = intB1x2;
        this.intB1x3 = intB1x3;
        this.intB1x4 = intB1x4;

        this.intB2x1 = intB2x1;
        this.intB2x2 = intB2x2;
        this.intB2x3 = intB2x3;
        this.intB2x4 = intB2x4;

        this.intB3x1 = intB3x1;
        this.intB3x2 = intB3x2;
        this.intB3x3 = intB3x3;
        this.intB3x4 = intB3x4;

        this.intB4x1 = intB4x1;
        this.intB4x2 = intB4x2;
        this.intB4x3 = intB4x3;
        this.intB4x4 = intB4x4;
    }

    public JFrameConstruction(String title) {
        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(414, 450); //414 450
        setResizable(false);

        initComponents();

        b1X1Panel = addToFrame(b1X1Label, 0, 0,"#464B5D");
        b2X1Panel = addToFrame(b2X1Label,100,0, "#84ffff");
        b1X1Label.setText(String.valueOf(intB1x1));


        add(b3X1Panel);
        //b3X1Label.setAlignmentY(Component.CENTER_ALIGNMENT);
        //b3X1Label.setHorizontalAlignment(JLabel.CENTER); // set the horizontal alignement on the x axis !
        //b3X1Label.setVerticalAlignment(JLabel.CENTER);
        b3X1Label.setHorizontalAlignment(JLabel.CENTER);
        b3X1Panel.add(b3X1Label);
        b3X1Panel.setSize(100, 100);
        b3X1Panel.setLocation(200, 0);
        b3X1Panel.setBackground(Color.WHITE);
        b3X1Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        add(b4X1Panel);
        b4X1Panel.add(b4X1Label);
        b4X1Panel.setSize(100, 100);
        b4X1Panel.setLocation(300, 0);
        b4X1Panel.setBackground(Color.decode("#84ffff"));
        b4X1Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        add(b1X2Panel);
        b1X2Panel.add(b1X2Label);
        b1X2Panel.setSize(100, 100);
        b1X2Panel.setLocation(0, 100);
        b1X2Panel.setBackground(Color.decode("#84ffff"));
        b1X2Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        add(b2X2Panel);
        b2X2Panel.add(b2X2Label);
        b2X2Panel.setSize(100, 100);
        b2X2Panel.setLocation(100, 100);
        b2X2Panel.setBackground(Color.WHITE);
        b2X2Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        add(b3X2Panel);
        b3X2Panel.add(b3X2Label);
        b3X2Panel.setSize(100, 100);
        b3X2Panel.setLocation(200, 100);
        b3X2Panel.setBackground(Color.YELLOW);
        b3X2Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        add(b4X2Panel);
        b4X2Panel.add(b4X2Label);
        b4X2Panel.setSize(100, 100);
        b4X2Panel.setLocation(300, 100);
        b4X2Panel.setBackground(Color.WHITE);
        b4X2Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        add(b1X3Panel);
        b1X3Panel.add(b1X3Label);
        b1X3Panel.setSize(100, 100);
        b1X3Panel.setLocation(0, 200);
        b1X3Panel.setBackground(Color.WHITE);
        b1X3Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        add(b2X3Panel);
        b2X3Panel.add(b2X3Label);
        b2X3Panel.setSize(100, 100);
        b2X3Panel.setLocation(100, 200);
        b2X3Panel.setBackground(Color.YELLOW);
        b2X3Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        add(b3X3Panel);
        b3X3Panel.add(b3X3Label);
        b3X3Panel.setSize(100, 100);
        b3X3Panel.setLocation(200, 200);
        b3X3Panel.setBackground(Color.WHITE);
        b3X3Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        add(b4X3Panel);
        b4X3Panel.add(b4X3Label);
        b4X3Panel.setSize(100, 100);
        b4X3Panel.setLocation(300, 200);
        b4X3Panel.setBackground(Color.YELLOW);
        b4X3Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        add(b1X4Panel);
        b1X4Panel.add(b1X4Label);
        b1X4Panel.setSize(100, 100);
        b1X4Panel.setLocation(0, 300);
        b1X4Panel.setBackground(Color.YELLOW);
        b1X4Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        add(b2X4Panel);
        b2X4Panel.add(b2X4Label);
        b2X4Panel.setSize(100, 100);
        b2X4Panel.setLocation(100, 300);
        b2X4Panel.setBackground(Color.WHITE);
        b2X4Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        add(b3X4Panel);
        b3X4Panel.add(b3X4Label);
        b3X4Panel.setSize(100, 100);
        b3X4Panel.setLocation(200, 300);
        b3X4Panel.setBackground(Color.YELLOW);
        b3X4Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        add(b4X4Panel);
        b4X4Panel.add(b4X4Label);
        b4X4Panel.setSize(100, 100);
        b4X4Panel.setLocation(300, 300);
        b4X4Panel.setBackground(Color.WHITE);
        b4X4Panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        add(background);

        setVisible(true);
    }

    private void initComponents() {
        b1X1Panel = new JPanel();
        b1X1Label = new JLabel(String.valueOf(intB1x1));
        b2X1Panel = new JPanel();
        b2X1Label = new JLabel(String.valueOf(intB2x1));
        b3X1Panel = new JPanel();
        b3X1Label = new JLabel(String.valueOf(intB3x1));
        b4X1Panel = new JPanel();
        b4X1Label = new JLabel(String.valueOf(intB4x1));

        b1X2Panel = new JPanel();
        b1X2Label = new JLabel(String.valueOf(intB1x2));
        b2X2Panel = new JPanel();
        b2X2Label = new JLabel(String.valueOf(intB2x2));
        b3X2Panel = new JPanel();
        b3X2Label = new JLabel(String.valueOf(intB3x2));
        b4X2Panel = new JPanel();
        b4X2Label = new JLabel(String.valueOf(intB4x2));

        b1X3Panel = new JPanel();
        b1X3Label = new JLabel(String.valueOf(intB1x3));
        b2X3Panel = new JPanel();
        b2X3Label = new JLabel(String.valueOf(intB2x3));
        b3X3Panel = new JPanel();
        b3X3Label = new JLabel(String.valueOf(intB3x3));
        b4X3Panel = new JPanel();
        b4X3Label = new JLabel(String.valueOf(intB4x3));

        b1X4Panel = new JPanel();
        b1X4Label = new JLabel(String.valueOf(intB1x4));
        b2X4Panel = new JPanel();
        b2X4Label = new JLabel(String.valueOf(intB2x4));
        b3X4Panel = new JPanel();
        b3X4Label = new JLabel(String.valueOf(intB3x4));
        b4X4Panel = new JPanel();
        b4X4Label = new JLabel(String.valueOf(intB4x4));

        background = new JPanel();
    }


    @Override
    public void eventDispatched(AWTEvent event) {
        if(event.getID() == 402) return;
        inputContainer++;
        KeyEvent keyEvent = (KeyEvent) event;
        int key = keyEvent.getKeyCode();
        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
            System.out.println(inputContainer + "  RIGHT");
            // b1X1Label.setText(String.valueOf(intB1x1));
            b1X1Label.setText("RIGHT");
        } else if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) {
            System.out.println(inputContainer + "  LEFT");
            b1X1Label.setText("LEFT");
        } else if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
            System.out.println(inputContainer + "  UP");
            b1X1Label.setText("UP");
        } else if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
            System.out.println(inputContainer + "  DOWN");
            b1X1Label.setText("DOWN");
        }
    }
    public JPanel addToFrame(JLabel label, int locX, int locY, String colour) {
        JPanel name = new JPanel();
        name.add(label);
        name.setSize(100, 100);
        name.setLocation(locX, locY);
        name.setBackground(Color.decode(colour));
        name.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        add(name);
        return name;
    }
}
