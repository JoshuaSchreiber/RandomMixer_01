package VersuchsVersionen.Other.Imperativ.Version2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;


public class JFrameConstructionV2 extends JFrame implements AWTEventListener {
    int i1x1 = 1;
    int i2x1 = 2;
    int i3x1 = 3;
    int i4x1 = 4;
    int i1x2 = 5;
    int i2x2 = 6;
    int i3x2 = 7;
    int i4x2 = 8;
    int i1x3 = 9;
    int i2x3 = 10;
    int i3x3 = 11;
    int i4x3 = 12;
    int i1x4 = 13;
    int i2x4 = 14;
    int i3x4 = 15;
    int i4x4 = 16;
    JLabel l1x1;
    JLabel l2x1;
    JLabel l3x1;
    JLabel l4x1;
    JLabel l1x2;
    JLabel l2x2;
    JLabel l3x2;
    JLabel l4x2;
    JLabel l1x3;
    JLabel l2x3;
    JLabel l3x3;
    JLabel l4x3;
    JLabel l1x4;
    JLabel l2x4;
    JLabel l3x4;
    JLabel l4x4;
    int inputCounter; // Counts the correct user inputs
    GridBagLayout gridBagLayout;
    GridBagConstraints gridBagConstraints;
    MainCalculation mainCalculation;

    public JFrameConstructionV2(String title){
        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setExtendedState(MAXIMIZED_BOTH);

        gridBagLayout = new GridBagLayout();
        setLayout(gridBagLayout);

        initComponents();

        setVisible(true);
        setResizable(false);
    }


    public void initComponents(){
        l1x1 = new JLabel(String.valueOf(i1x1));
        l2x1 = new JLabel(String.valueOf(i2x1));
        l3x1 = new JLabel(String.valueOf(i3x1));
        l4x1 = new JLabel(String.valueOf(i4x1));

        l1x2 = new JLabel(String.valueOf(i1x2));
        l2x2 = new JLabel(String.valueOf(i2x2));
        l3x2 = new JLabel(String.valueOf(i3x2));
        l4x2 = new JLabel(String.valueOf(i4x2));

        l1x3 = new JLabel(String.valueOf(i1x3));
        l2x3 = new JLabel(String.valueOf(i2x3));
        l3x3 = new JLabel(String.valueOf(i3x3));
        l4x3 = new JLabel(String.valueOf(i4x3));

        l1x4 = new JLabel(String.valueOf(i1x4));
        l2x4 = new JLabel(String.valueOf(i2x4));
        l3x4 = new JLabel(String.valueOf(i3x4));
        l4x4 = new JLabel(String.valueOf(i4x4));

        newField("#464B5D","#84ffff", l1x1, 0, 0);
        newField("#84ffff","#464B5D", l2x1, 1, 0);
        newField("#464B5D","#84ffff", l3x1, 2, 0);
        newField("#84ffff","#464B5D", l4x1, 3, 0);

        newField("#84ffff","#464B5D", l1x2, 0, 1);
        newField("#464B5D","#84ffff", l2x2, 1, 1);
        newField("#84ffff","#464B5D", l3x2, 2, 1);
        newField("#464B5D","#84ffff", l4x2, 3, 1);

        newField("#464B5D","#84ffff", l1x3, 0, 2);
        newField("#84ffff","#464B5D", l2x3, 1, 2);
        newField("#464B5D","#84ffff", l3x3, 2, 2);
        newField("#84ffff","#464B5D", l4x3, 3, 2);

        newField("#84ffff","#464B5D", l1x4, 0, 3);
        newField("#464B5D","#84ffff", l2x4, 1, 3);
        newField("#84ffff","#464B5D", l3x4, 2, 3);
        newField("#464B5D","#84ffff", l4x4, 3, 3);
    }
    public void newField(String backgroundColor, String foregroundColor, JLabel jLabel, int gridx, int gridy){
        jLabel.setBackground(Color.decode(backgroundColor));
        jLabel.setPreferredSize(new Dimension(100, 100));
        jLabel.setVerticalAlignment(JLabel.CENTER);
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setFont(jLabel.getFont().deriveFont(20f));
        jLabel.setFont(jLabel.getFont().deriveFont(Font.BOLD));
        jLabel.setForeground(Color.decode(foregroundColor));
        jLabel.setOpaque(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = gridx;
        gridBagConstraints.gridy = gridy;
        gridBagConstraints.gridwidth =  1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.weighty = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(5,5,5,5);
        gridBagLayout.setConstraints(jLabel, gridBagConstraints);
        add(jLabel);
    }

    public void reset(int i1x1, int i2x1, int i3x1, int i4x1, int i1x2, int i2x2, int i3x2, int i4x2, int i1x3, int i2x3, int i3x3, int i4x3, int i1x4, int i2x4, int i3x4, int i4x4) {
        this.i1x1 = i1x1;
        this.i2x1 = i2x1;
        this.i3x1 = i3x1;
        this.i4x1 = i4x1;

        this.i1x2 = i1x2;
        this.i2x2 = i2x2;
        this.i3x2 = i3x2;
        this.i4x2 = i4x2;

        this.i1x3 = i1x3;
        this.i2x3 = i2x3;
        this.i3x3 = i3x3;
        this.i4x3 = i4x3;

        this.i1x4 = i1x4;
        this.i2x4 = i2x4;
        this.i3x4 = i3x4;
        this.i4x4 = i4x4;

        l1x1.setText(String.valueOf(this.i1x1));
        l2x1.setText(String.valueOf(this.i2x1));
        l3x1.setText(String.valueOf(this.i3x1));
        l4x1.setText(String.valueOf(this.i4x1));

        l1x2.setText(String.valueOf(this.i1x2));
        l2x2.setText(String.valueOf(this.i2x2));
        l3x2.setText(String.valueOf(this.i3x2));
        l4x2.setText(String.valueOf(this.i4x2));

        l1x3.setText(String.valueOf(this.i1x3));
        l2x3.setText(String.valueOf(this.i2x3));
        l3x3.setText(String.valueOf(this.i3x3));
        l4x3.setText(String.valueOf(this.i4x3));

        l1x4.setText(String.valueOf(this.i1x4));
        l2x4.setText(String.valueOf(this.i2x4));
        l3x4.setText(String.valueOf(this.i3x4));
        l4x4.setText(String.valueOf(this.i4x4));
    }

    @Override
    public void eventDispatched(AWTEvent event) {
        if(event.getID() == 402) return;
        inputCounter++;
        KeyEvent keyEvent = (KeyEvent) event;
        int key = keyEvent.getKeyCode();
        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
            System.out.println(inputCounter + "  RIGHT");
        } else if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) {
            System.out.println(inputCounter + "  LEFT");
        } else if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
            System.out.println(inputCounter + "  UP");
        } else if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
            System.out.println(inputCounter + "  DOWN");
        }
    }
}