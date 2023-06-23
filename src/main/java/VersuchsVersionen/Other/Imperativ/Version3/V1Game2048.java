package VersuchsVersionen.Other.Imperativ.Version3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AWTEventListener;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Objects;


public class V1Game2048 extends JFrame implements AWTEventListener {
    int i1 = 0;
    int i2 = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 0;
    int i9 = 0;
    int i10 = 0;
    int i11 = 0;
    int i12 = 0;
    int i13 = 0;
    int i14 = 0;
    int i15 = 0;
    int i16 = 0;
    HashMap<String, JLabel> labelHashMap = new HashMap<>();
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    JLabel l6;
    JLabel l7;
    JLabel l8;
    JLabel l9;
    JLabel l10;
    JLabel l11;
    JLabel l12;
    JLabel l13;
    JLabel l14;
    JLabel l15;
    JLabel l16;
    int inputCounter; // Counts the correct user inputs
    GridBagLayout gridBagLayout;
    GridBagConstraints gridBagConstraints;

    public V1Game2048(String title) {
        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setExtendedState(MAXIMIZED_BOTH);

        gridBagLayout = new GridBagLayout();
        setLayout(gridBagLayout);

        initComponents();
        integerSpur();

        setVisible(true);
        setResizable(false);
    }


    public void initComponents() {
        l1 = new JLabel(String.valueOf(i1));
        l2 = new JLabel(String.valueOf(i2));
        l3 = new JLabel(String.valueOf(i3));
        l4 = new JLabel(String.valueOf(i4));

        l5 = new JLabel(String.valueOf(i5));
        l6 = new JLabel(String.valueOf(i6));
        l7 = new JLabel(String.valueOf(i7));
        l8 = new JLabel(String.valueOf(i8));

        l9 = new JLabel(String.valueOf(i9));
        l10 = new JLabel(String.valueOf(i10));
        l11 = new JLabel(String.valueOf(i11));
        l12 = new JLabel(String.valueOf(i12));

        l13 = new JLabel(String.valueOf(i13));
        l14 = new JLabel(String.valueOf(i14));
        l15 = new JLabel(String.valueOf(i15));
        l16 = new JLabel(String.valueOf(i16));

        labelHashMap.put("1", newField(i1, "#464B5D", "#84ffff", l1, 0, 0));
        labelHashMap.put("2", newField(i2, "#84ffff", "#464B5D", l2, 1, 0));
        labelHashMap.put("3", newField(i3, "#464B5D", "#84ffff", l3, 2, 0));
        labelHashMap.put("4", newField(i4, "#84ffff", "#464B5D", l4, 3, 0));

        labelHashMap.put("5", newField(i5, "#84ffff", "#464B5D", l5, 0, 1));
        labelHashMap.put("6", newField(i6, "#464B5D", "#84ffff", l6, 1, 1));
        labelHashMap.put("7", newField(i7, "#84ffff", "#464B5D", l7, 2, 1));
        labelHashMap.put("8", newField(i8, "#464B5D", "#84ffff", l8, 3, 1));

        labelHashMap.put("9", newField(i9, "#464B5D", "#84ffff", l9, 0, 2));
        labelHashMap.put("10", newField(i10, "#84ffff", "#464B5D", l10, 1, 2));
        labelHashMap.put("11", newField(i11, "#464B5D", "#84ffff", l11, 2, 2));
        labelHashMap.put("12", newField(i12, "#84ffff", "#464B5D", l12, 3, 2));

        labelHashMap.put("13", newField(i13, "#84ffff", "#464B5D", l13, 0, 3));
        labelHashMap.put("14", newField(i14, "#464B5D", "#84ffff", l14, 1, 3));
        labelHashMap.put("15", newField(i15, "#84ffff", "#464B5D", l15, 2, 3));
        labelHashMap.put("16", newField(i16, "#464B5D", "#84ffff", l16, 3, 3));
    }

    public JLabel newField(int numericalValue, String backgroundColor, String foregroundColor, JLabel jLabel, int gridx, int gridy) {
        if (numericalValue == 0) {
            foregroundColor = backgroundColor;
        }
        jLabel.setBackground(Color.decode(backgroundColor));
        jLabel.setForeground(Color.decode(foregroundColor));
        jLabel.setPreferredSize(new Dimension(100, 100));
        jLabel.setVerticalAlignment(JLabel.CENTER);
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setFont(jLabel.getFont().deriveFont(20f));
        jLabel.setFont(jLabel.getFont().deriveFont(Font.BOLD));
        jLabel.setOpaque(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = gridx;
        gridBagConstraints.gridy = gridy;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.weightx = 0;
        gridBagConstraints.weighty = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        gridBagLayout.setConstraints(jLabel, gridBagConstraints);
        add(jLabel);
        return jLabel;
    }
    public void forBackGround(int fieldValue, int numericalValue) {
        JLabel jLabel = labelHashMap.get((String.valueOf(fieldValue)));
        String backgroundColor = "";
        String foregroundColor = "";
        if(fieldValue == 1 || fieldValue == 3 || fieldValue == 6 || fieldValue == 8 || fieldValue == 9 || fieldValue == 11 || fieldValue == 14 || fieldValue == 16){
            backgroundColor = "#464B5D";
            foregroundColor = "#84ffff";
        }else if(fieldValue == 2 || fieldValue == 4 || fieldValue == 5 || fieldValue == 7 || fieldValue == 10 || fieldValue == 12 || fieldValue == 13 || fieldValue == 15){
            backgroundColor = "#84ffff";
            foregroundColor = "#464B5D";
        }
        if(numericalValue == 0){
            foregroundColor = backgroundColor;
        }
        jLabel.setBackground(Color.decode(backgroundColor));
        jLabel.setForeground(Color.decode(foregroundColor));
    }

    @Override
    public void eventDispatched(AWTEvent event) {
        String v = "";
        if (event.getID() == 402) return;
        inputCounter++;
        KeyEvent keyEvent = (KeyEvent) event;
        int key = keyEvent.getKeyCode();
        if (key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) {
            System.out.println(inputCounter + "  RIGHT:");
            v = move("right");
        } else if (key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) {
            System.out.println(inputCounter + "  LEFT:");
            v = move("left");
        } else if (key == KeyEvent.VK_UP || key == KeyEvent.VK_W) {
            System.out.println(inputCounter + "  UP:");
            v = move("up");
        } else if (key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) {
            System.out.println(inputCounter + "  DOWN:");
            v = move("down");
        }
        if(!Objects.equals(v, "NoChange")){
            integerSpur();
        }
    }

    public String move(String direction) {
        String ergebnis = "";
        switch (direction) {
            case "right" -> ergebnis = right();
            case "left" -> ergebnis = left();
            case "up" -> ergebnis = up();
            case "down" -> ergebnis = down();
        }
        return ergebnis;
    }

    public String right() {
        String ergebnis = "";

        String x1 = oneIsZero(1,2,3,4);
        String x2 = theSame(1,2,3,4);
        String x3 = oneIsZero(1,2,3,4);

        String x4 = oneIsZero(5,6,7,8);
        String x5 = theSame(5,6,7,8);
        String x6 = oneIsZero(5,6,7,8);

        String x7 = oneIsZero(9,10,11,12);
        String x8 = theSame(9,10,11,12);
        String x9 = oneIsZero(9,10,11,12);

        String x10 = oneIsZero(13,14,15,16);
        String x11 = theSame(13,14,15,16);
        String x12 = oneIsZero(13,14,15,16);

        if(Objects.equals(x1, "NoChange") && Objects.equals(x2, "NoChange") && Objects.equals(x3, "NoChange") && Objects.equals(x4, "NoChange") && Objects.equals(x5, "NoChange") && Objects.equals(x6, "NoChange") && Objects.equals(x7, "NoChange") && Objects.equals(x8, "NoChange") && Objects.equals(x9, "NoChange") && Objects.equals(x10, "NoChange") && Objects.equals(x11, "NoChange") && Objects.equals(x12, "NoChange")){
            ergebnis = "NoChange";
        }
        return ergebnis;
    }

    public String left() {
        String ergebnis = "";

        String x1 = oneIsZero(4,3,2,1);
        String x2 = theSame(4,3,2,1);
        String x3 = oneIsZero(4,3,2,1);

        String x4 = oneIsZero(8,7,6,5);
        String x5 = theSame(8,7,6,5);
        String x6 = oneIsZero(8,7,6,5);

        String x7 = oneIsZero(12,11,10,9);
        String x8 = theSame(12,11,10,9);
        String x9 = oneIsZero(12,11,10,9);

        String x10 = oneIsZero(16,15,14,13);
        String x11 = theSame(16,15, 14, 13);
        String x12 = oneIsZero(16,15,14,13);

        if(Objects.equals(x1, "NoChange") && Objects.equals(x2, "NoChange") && Objects.equals(x3, "NoChange") && Objects.equals(x4, "NoChange") && Objects.equals(x5, "NoChange") && Objects.equals(x6, "NoChange") && Objects.equals(x7, "NoChange") && Objects.equals(x8, "NoChange") && Objects.equals(x9, "NoChange") && Objects.equals(x10, "NoChange") && Objects.equals(x11, "NoChange") && Objects.equals(x12, "NoChange")){
            ergebnis = "NoChange";
        }
        return ergebnis;
    }

    public String  up() {
        String ergebnis = "";

        String x1 = oneIsZero(13,9,5,1);
        String x2 = theSame(13,9,5,1);
        String x3 = oneIsZero(13,9,5,1);

        String x4 = oneIsZero(14,10,6,2);
        String x5 = theSame(14,10,6,2);
        String x6 = oneIsZero(14,10,6,2);

        String x7 = oneIsZero(15,11,7,3);
        String x8= theSame(15,11,7,3);
        String x9 = oneIsZero(15,11,7,3);

        String x10 = oneIsZero(16,12,8,4);
        String x11 = theSame(16,12,8,4);
        String x12 = oneIsZero(16,12,8,4);

        if(Objects.equals(x1, "NoChange") && Objects.equals(x2, "NoChange") && Objects.equals(x3, "NoChange") && Objects.equals(x4, "NoChange") && Objects.equals(x5, "NoChange") && Objects.equals(x6, "NoChange") && Objects.equals(x7, "NoChange") && Objects.equals(x8, "NoChange") && Objects.equals(x9, "NoChange") && Objects.equals(x10, "NoChange") && Objects.equals(x11, "NoChange") && Objects.equals(x12, "NoChange")){
            ergebnis = "NoChange";
        }
        return ergebnis;
    }

    public String down() {
        String ergebnis = "";

        String x1 = oneIsZero(1,5,9,13);
        String x2 = theSame(1,5,9,13);
        String x3 = oneIsZero(1,5,9,13);

        String x4 = oneIsZero(2,6,10,14);
        String x5 = theSame(2,6,10,14);
        String x6 = oneIsZero(2,6,10,14);

        String x7 = oneIsZero(3,7,11,15);
        String x8 = theSame(3,7,11,15);
        String x9 = oneIsZero(3,7,11,15);

        String x10 = oneIsZero(4,8,12,16);
        String x11 = theSame(4,8,12,16);
        String x12 = oneIsZero(4,8,12,16);

        if(Objects.equals(x1, "NoChange") && Objects.equals(x2, "NoChange") && Objects.equals(x3, "NoChange") && Objects.equals(x4, "NoChange") && Objects.equals(x5, "NoChange") && Objects.equals(x6, "NoChange") && Objects.equals(x7, "NoChange") && Objects.equals(x8, "NoChange") && Objects.equals(x9, "NoChange") && Objects.equals(x10, "NoChange") && Objects.equals(x11, "NoChange") && Objects.equals(x12, "NoChange")){
            ergebnis = "NoChange";
        }
        return ergebnis;
    }

    public String theSame(int one, int two, int three, int four) {
        String ergebnis = "Change";

        String sOne = labelHashMap.get((String.valueOf(one))).getText();
        int iOne = Integer.parseInt(sOne);
        String sTwo = labelHashMap.get((String.valueOf(two))).getText();
        int iTwo = Integer.parseInt(sTwo);
        String sThree = labelHashMap.get((String.valueOf(three))).getText();
        int iThree = Integer.parseInt(sThree);
        String sFour = labelHashMap.get((String.valueOf(four))).getText();
        int iFour = Integer.parseInt(sFour);

        int o  = iOne;
        int tw  = iTwo;
        int th = iThree;
        int f = iFour;

        if (iFour ==  iThree) {
            iFour = iThree * 2;
            iThree = 0;
        }
        if (iThree == iTwo) {
            iThree = iThree * 2;
            iTwo = 0;
        }
        if (iTwo == iOne) {
            iTwo = iTwo * 2;
            iOne = 0;
        }

        System.out.println("Field  " + one + "  changes from  " + o + "   ->   " + iOne);
        System.out.println("Field  " + two + "  changes from  " + tw + "   ->   " + iTwo);
        System.out.println("Field  " + three + "  changes from  " + th + "   ->   " + iThree);
        System.out.println("Field  " + four + "  changes from  " + f + "   ->   " + iFour);

        if(o == iOne && tw == iTwo && th == iThree && f == iFour){
            ergebnis = "NoChange";
        }

        labelHashMap.get(String.valueOf(one)).setText(String.valueOf(iOne));
        forBackGround(one, iOne);
        labelHashMap.get(String.valueOf(two)).setText(String.valueOf(iTwo));
        forBackGround(two, iTwo);
        labelHashMap.get(String.valueOf(three)).setText(String.valueOf(iThree));
        forBackGround(three, iThree);
        labelHashMap.get(String.valueOf(four)).setText(String.valueOf(iFour));
        forBackGround(four, iFour);
        return ergebnis;
    }

    public String oneIsZero(int one, int two, int three, int four) {
        String ergebnis = "Change";

        String sOne = labelHashMap.get((String.valueOf(one))).getText();
        int iOne = Integer.parseInt(sOne);
        String sTwo = labelHashMap.get((String.valueOf(two))).getText();
        int iTwo = Integer.parseInt(sTwo);
        String sThree = labelHashMap.get((String.valueOf(three))).getText();
        int iThree = Integer.parseInt(sThree);
        String sFour = labelHashMap.get((String.valueOf(four))).getText();
        int iFour = Integer.parseInt(sFour);

        int o  = iOne;
        int tw  = iTwo;
        int th = iThree;
        int f = iFour;

        for(int i = 4; i > 0; i--) {
            if (iTwo == 0) {
                iTwo = iOne;
                iOne = 0;
            }
            if (iThree == 0) {
                iThree = iTwo;
                iTwo = 0;
            }
            if (iFour == 0) {
                iFour = iThree;
                iThree = 0;
            }
        }

        System.out.println("Field  " + one + "  changes from  " + o + "   ->   " + iOne);
        System.out.println("Field  " + two + "  changes from  " + tw + "   ->   " + iTwo);
        System.out.println("Field  " + three + "  changes from  " + th + "   ->   " + iThree);
        System.out.println("Field  " + four + "  changes from  " + f + "   ->   " + iFour);

        if(o == iOne && tw == iTwo && th == iThree && f == iFour){
            ergebnis = "NoChange";
        }

        labelHashMap.get(String.valueOf(one)).setText(String.valueOf(iOne));
        forBackGround(one, iOne);
        labelHashMap.get(String.valueOf(two)).setText(String.valueOf(iTwo));
        forBackGround(two, iTwo);
        labelHashMap.get(String.valueOf(three)).setText(String.valueOf(iThree));
        forBackGround(three, iThree);
        labelHashMap.get(String.valueOf(four)).setText(String.valueOf(iFour));
        forBackGround(four, iFour);

        return ergebnis;
    }

    public void integerSpur(){
        java.util.Random randomGenerator = new java.util.Random();
        int rand = randomGenerator.nextInt(1, 4);
        String spur;
        if(rand == 1 || rand == 2){
            spur = "2";
        }else{
            spur = "4";
        }

        boolean spurned = false;
        int x = 1000;
        int y = 0;
        while(!spurned && x != 0) {
            x--;
            int rand2 = randomGenerator.nextInt(1, 17);
            y = rand2;
            if (rand2 == 1 && labelHashMap.get("1").getText().equals("0")) {
                labelHashMap.get("1").setText(spur);
                spurned = true;
                forBackGround(1, Integer.parseInt(spur));
            }else if (rand2 == 2 && labelHashMap.get("2").getText().equals("0")){
                labelHashMap.get("2").setText(spur);
                spurned = true;
                forBackGround(2, Integer.parseInt(spur));
            }else if (rand2 == 3 && labelHashMap.get("3").getText().equals("0")){
                labelHashMap.get("3").setText(spur);
                spurned = true;
                forBackGround(3, Integer.parseInt(spur));
            }else if (rand2 == 4 && labelHashMap.get("4").getText().equals("0")){
                labelHashMap.get("4").setText(spur);
                spurned = true;
                forBackGround(4, Integer.parseInt(spur));
            }else if (rand2 == 5 && labelHashMap.get("5").getText().equals("0")){
                labelHashMap.get("5").setText(spur);
                spurned = true;
                forBackGround(5, Integer.parseInt(spur));
            }else if (rand2 == 6 && labelHashMap.get("6").getText().equals("0")){
                labelHashMap.get("6").setText(spur);
                spurned = true;
                forBackGround(6, Integer.parseInt(spur));
            }else if (rand2 == 7 && labelHashMap.get("7").getText().equals("0")){
                labelHashMap.get("7").setText(spur);
                spurned = true;
                forBackGround(7, Integer.parseInt(spur));
            }else if (rand2 == 8 && labelHashMap.get("8").getText().equals("0")){
                labelHashMap.get("8").setText(spur);
                spurned = true;
                forBackGround(8, Integer.parseInt(spur));
            }else if (rand2 == 9 && labelHashMap.get("9").getText().equals("0")){
                labelHashMap.get("9").setText(spur);
                spurned = true;
                forBackGround(9, Integer.parseInt(spur));
            }else if (rand2 == 10 && labelHashMap.get("10").getText().equals("0")){
                labelHashMap.get("10").setText(spur);
                spurned = true;
                forBackGround(10, Integer.parseInt(spur));
            }else if (rand2 == 11 && labelHashMap.get("11").getText().equals("0")){
                labelHashMap.get("11").setText(spur);
                spurned = true;
                forBackGround(11, Integer.parseInt(spur));
            }else if (rand2 == 12 && labelHashMap.get("12").getText().equals("0")){
                labelHashMap.get("12").setText(spur);
                spurned = true;
                forBackGround(12, Integer.parseInt(spur));
            }else if (rand2 == 13 && labelHashMap.get("13").getText().equals("0")){
                labelHashMap.get("13").setText(spur);
                spurned = true;
                forBackGround(13, Integer.parseInt(spur));
            }else if (rand2 == 14 && labelHashMap.get("14").getText().equals("0")){
                labelHashMap.get("14").setText(spur);
                spurned = true;
                forBackGround(14, Integer.parseInt(spur));
            }else if (rand2 == 15 && labelHashMap.get("15").getText().equals("0")){
                labelHashMap.get("15").setText(spur);
                spurned = true;
                forBackGround(15, Integer.parseInt(spur));
            }else if (rand2 == 16 && labelHashMap.get("16").getText().equals("0")){
                labelHashMap.get("16").setText(spur);
                spurned = true;
                forBackGround(16, Integer.parseInt(spur));
            }
        }
        System.out.println("                    ->  " +spur + "  spurned on field  " + y);
    }
}
