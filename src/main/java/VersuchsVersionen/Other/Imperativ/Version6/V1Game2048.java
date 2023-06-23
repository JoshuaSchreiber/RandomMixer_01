package VersuchsVersionen.Other.Imperativ.Version6;

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialOceanicIJTheme;

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
    JButton colorChange;
    JLabel  topLine;
    JLabel jPunktzahl;
    int punktzahl;
    int rekord;
    int color = 1;
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

        colorChange = new JButton("Change Color Theme!");
        newButton(colorChange, "#000000", "#FFFFFF", 5, 1, 100, 5, 5,50,  250, 50);
        colorChange.addActionListener(e -> {
            if(e.getSource() == this.colorChange){
                if(color == 1){
                    color = 2;
                    FlatMaterialDeepOceanIJTheme.setup();
                    FlatMaterialDeepOceanIJTheme.updateUI();
                    try {
                        UIManager.setLookAndFeel(new FlatMaterialDeepOceanIJTheme());
                    } catch (UnsupportedLookAndFeelException ex) {
                        throw new RuntimeException(ex);
                    }
                }else if(color == 2){
                    color = 1;
                    FlatMaterialOceanicIJTheme.setup();
                    FlatMaterialOceanicIJTheme.updateUI();
                    try {
                        UIManager.setLookAndFeel(new FlatMaterialOceanicIJTheme());
                    } catch (UnsupportedLookAndFeelException ex) {
                        throw new RuntimeException(ex);
                    }
                }
                actualise(16);
            }
            System.out.println(color);
        });

        topLine = new JLabel("2048");
        newField("#000000", "#FFFFFF", topLine, 0, 0, 0,0,0, 40, 9, true);

        jPunktzahl = new JLabel("Punktzahl: " + punktzahl);
        newField("#000000", "#FFFFFF", jPunktzahl, 5, 2, 100,5,5, 50, 1, false);

        labelHashMap.put("1", newField("#464B5D", "#84ffff", l1, 0, 1, 350, 5,5,5, 1, false));
        labelHashMap.put("2", newField("#84ffff", "#464B5D", l2, 1, 1, 5 ,5,5,5, 1, false));
        labelHashMap.put("3", newField("#464B5D", "#84ffff", l3, 2, 1, 5 ,5,5,5, 1, false));
        labelHashMap.put("4", newField("#84ffff", "#464B5D", l4, 3, 1, 5 ,5,5,5, 1, false));

        labelHashMap.put("5", newField("#84ffff", "#464B5D", l5, 0, 2,350, 5,5,5, 1, false));
        labelHashMap.put("6", newField("#464B5D", "#84ffff", l6, 1, 2, 5 ,5,5,5, 1, false));
        labelHashMap.put("7", newField("#84ffff", "#464B5D", l7, 2, 2, 5 ,5,5,5, 1, false));
        labelHashMap.put("8", newField("#464B5D", "#84ffff", l8, 3, 2, 5 ,5,5,5, 1, false));

        labelHashMap.put("9", newField("#464B5D", "#84ffff", l9, 0, 3, 350, 5,5,5, 1, false));
        labelHashMap.put("10", newField("#84ffff", "#464B5D", l10, 1, 3, 5 ,5,5,5, 1, false));
        labelHashMap.put("11", newField("#464B5D", "#84ffff", l11, 2, 3, 5 ,5,5,5, 1, false));
        labelHashMap.put("12", newField("#84ffff", "#464B5D", l12, 3, 3, 5 ,5,5,5, 1, false));

        labelHashMap.put("13", newField("#84ffff", "#464B5D", l13, 0, 4,350, 5,5,50, 1, false));
        labelHashMap.put("14", newField("#464B5D", "#84ffff", l14, 1, 4, 5 ,5,5,50, 1, false));
        labelHashMap.put("15", newField("#84ffff", "#464B5D", l15, 2, 4, 5 ,5,5,50, 1, false));
        labelHashMap.put("16", newField("#464B5D", "#84ffff", l16, 3, 4, 5 ,5,5,50, 1, false));

        actualise(16);
    }
    public JLabel newField(String backgroundColor, String foregroundColor, JLabel jLabel, int gridx, int gridy, int insetsLeft, int insetsRight, int insetsUp, int insetsDown, int gridBagSystemBoxesWidth, boolean isItTheTopLine ) {
        jLabel.setBackground(Color.decode(backgroundColor));
        jLabel.setForeground(Color.decode(foregroundColor));
        jLabel.setPreferredSize(new Dimension(100, 100));
        jLabel.setVerticalAlignment(JLabel.CENTER);
        jLabel.setHorizontalAlignment(JLabel.CENTER);
        jLabel.setFont(jLabel.getFont().deriveFont(20f));
        if(isItTheTopLine){
            jLabel.setFont(jLabel.getFont().deriveFont(40f));
        }
        jLabel.setFont(jLabel.getFont().deriveFont(Font.BOLD));
        jLabel.setOpaque(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = gridx;
        gridBagConstraints.gridy = gridy;
        gridBagConstraints.gridwidth = gridBagSystemBoxesWidth;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(insetsUp, insetsLeft, insetsDown, insetsRight);
        gridBagLayout.setConstraints(jLabel, gridBagConstraints);
        add(jLabel);
        return jLabel;
    }
    public void newButton(JButton jButton, String backgroundColor, String foregroundColor, int gridx, int gridy, int insetsLeft, int insetsRight, int insetsUp, int insetsDown, int gridWidth, int gridHeight){
        jButton.setBackground(Color.decode(backgroundColor));
        jButton.setForeground(Color.decode(foregroundColor));
        jButton.setPreferredSize(new Dimension(gridWidth, gridHeight));
        jButton.setVerticalAlignment(JLabel.CENTER);
        jButton.setHorizontalAlignment(JLabel.CENTER);
        jButton.setFont(jButton.getFont().deriveFont(20f));
        jButton.setFont(jButton.getFont().deriveFont(Font.BOLD));
        jButton.setOpaque(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = gridx;
        gridBagConstraints.gridy = gridy;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(insetsUp, insetsLeft, insetsDown, insetsRight);
        gridBagLayout.setConstraints(jButton, gridBagConstraints);
        add(jButton);
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
    public void actualise(int hLength){
        for(int i = hLength; i >0; i--) {
            int fieldWorth = Integer.parseInt(labelHashMap.get((String.valueOf(i))).getText());
            labelHashMap.get(String.valueOf(i)).setText(String.valueOf(fieldWorth));
            forBackGround(String.valueOf(i));
        }
    }
    public void forBackGround(String fieldValue) {
        JLabel jLabel = labelHashMap.get((String.valueOf(fieldValue)));
        int numericalValue = Integer.parseInt(labelHashMap.get(fieldValue).getText());
        String backgroundColor = "";
        String foregroundColor = "";
        if(color == 1) {
            if (numericalValue == 0) {
                backgroundColor = "#1A2025";
                foregroundColor = backgroundColor;
            } else if (numericalValue == 2) { backgroundColor = "#17042F";
            } else if (numericalValue == 4) { backgroundColor = "#1C1056";
            } else if (numericalValue == 8) { backgroundColor = "#172173";
            } else if (numericalValue == 16) { backgroundColor = "#0F346B";
            } else if (numericalValue == 32) { backgroundColor = "#084763";
            } else if (numericalValue == 64) { backgroundColor = "#0A6166";
            } else if (numericalValue == 128) { backgroundColor = "#11A19F";
            } else if (numericalValue == 256) { backgroundColor = "#4ED0A8";
            } else if (numericalValue == 512) { backgroundColor = "#86F39D";;
            } else if (numericalValue == 1024) { backgroundColor = "#BDF287";
            } else if (numericalValue == 2048) { backgroundColor = "#F6EB47";
            } else if (numericalValue == 4096) { backgroundColor = "#FFFBE5";
            }
        }else if (color == 2){
            if (numericalValue == 0) {
                backgroundColor = "#1A2025";
                foregroundColor =  backgroundColor;
            }else if(numericalValue == 2){ backgroundColor = "#17323E";
            }else if(numericalValue == 4){ backgroundColor = "#0F4149";
            }else if(numericalValue == 8){ backgroundColor = "#024D55";
            }else if(numericalValue == 16){ backgroundColor = "#075758";
            }else if(numericalValue == 32){ backgroundColor = "#075758";
            }else if(numericalValue == 64){ backgroundColor = "#216F72";
            }else if(numericalValue == 128){ backgroundColor = "#057D7E";
            }else if(numericalValue == 256){ backgroundColor = "#179997";
            }else if(numericalValue == 512){ backgroundColor = "#58B2A5";
            }else if(numericalValue == 1024){ backgroundColor = "#6AC1B8";
            }else if(numericalValue == 2048){ backgroundColor = "#91CEC6";
            }else if(numericalValue == 4096){ backgroundColor = "#8D2E4E2";
            }
        }
        if(numericalValue < 32 && numericalValue != 0){
            foregroundColor = "#FFFFFF";
        }else if (numericalValue != 0){
            foregroundColor = "#000000";
        }
        jLabel.setBackground(Color.decode(backgroundColor));
        jLabel.setForeground(Color.decode(foregroundColor));
        punktzahl = (i1+i1+i3+i4+i5+i6+i7+i8+i9+i10+i11+i12+i13+i14+i15+i16);
        jPunktzahl.setText("Punktzahl:  " + punktzahl);
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

        String x1 = oneIsZero("1","2","3","4");
        String x2 = theSame("1","2","3","4");
        String x3 = oneIsZero("1","2","3","4");

        String x4 = oneIsZero("5","6","7","8");
        String x5 = theSame("5","6","7","8");
        String x6 = oneIsZero("5","6","7","8");

        String x7 = oneIsZero("9","10","11","12");
        String x8 = theSame("9","10","11","12");
        String x9 = oneIsZero("9","10","11","12");

        String x10 = oneIsZero("13","14","15","16");
        String x11 = theSame("13","14","15","16");
        String x12 = oneIsZero("13","14","15","16");

        if(Objects.equals(x1, "NoChange") && Objects.equals(x2, "NoChange") && Objects.equals(x3, "NoChange") && Objects.equals(x4, "NoChange") && Objects.equals(x5, "NoChange") && Objects.equals(x6, "NoChange") && Objects.equals(x7, "NoChange") && Objects.equals(x8, "NoChange") && Objects.equals(x9, "NoChange") && Objects.equals(x10, "NoChange") && Objects.equals(x11, "NoChange") && Objects.equals(x12, "NoChange")){
            ergebnis = "NoChange";
        }
        return ergebnis;
    }
    public String left() {
        String ergebnis = "";

        String x1 = oneIsZero("4","3","2","1");
        String x2 = theSame("4","3","2","1");
        String x3 = oneIsZero("4","3","2","1");

        String x4 = oneIsZero("8","7","6","5");
        String x5 = theSame("8","7","6","5");
        String x6 = oneIsZero("8","7","6","5");

        String x7 = oneIsZero("12","11","10","9");
        String x8 = theSame("12","11","10","9");
        String x9 = oneIsZero("12","11","10","9");

        String x10 = oneIsZero("16","15","14","13");
        String x11 = theSame("16","15","14","13");
        String x12 = oneIsZero("16","15","14","13");

        if(Objects.equals(x1, "NoChange") && Objects.equals(x2, "NoChange") && Objects.equals(x3, "NoChange") && Objects.equals(x4, "NoChange") && Objects.equals(x5, "NoChange") && Objects.equals(x6, "NoChange") && Objects.equals(x7, "NoChange") && Objects.equals(x8, "NoChange") && Objects.equals(x9, "NoChange") && Objects.equals(x10, "NoChange") && Objects.equals(x11, "NoChange") && Objects.equals(x12, "NoChange")){
            ergebnis = "NoChange";
        }
        return ergebnis;
    }
    public String  up() {
        String ergebnis = "";

        String x1 = oneIsZero("13","9","5","1");
        String x2 = theSame("13","9","5","1");
        String x3 = oneIsZero("13","9","5","1");

        String x4 = oneIsZero("14","10","6","2");
        String x5 = theSame("14","10","6","2");
        String x6 = oneIsZero("14","10","6","2");

        String x7 = oneIsZero("15","11","7","3");
        String x8= theSame("15","11","7","3");
        String x9 = oneIsZero("15","11","7","3");

        String x10 = oneIsZero("16","12","8","4");
        String x11 = theSame("16","12","8","4");
        String x12 = oneIsZero("16","12","8","4");

        if(Objects.equals(x1, "NoChange") && Objects.equals(x2, "NoChange") && Objects.equals(x3, "NoChange") && Objects.equals(x4, "NoChange") && Objects.equals(x5, "NoChange") && Objects.equals(x6, "NoChange") && Objects.equals(x7, "NoChange") && Objects.equals(x8, "NoChange") && Objects.equals(x9, "NoChange") && Objects.equals(x10, "NoChange") && Objects.equals(x11, "NoChange") && Objects.equals(x12, "NoChange")){
            ergebnis = "NoChange";
        }
        return ergebnis;
    }
    public String down() {
        String ergebnis = "";

        String x1 = oneIsZero("1","5","9","13");
        String x2 = theSame("1","5","9","13");
        String x3 = oneIsZero("1","5","9","13");

        String x4 = oneIsZero("2","6","10","14");
        String x5 = theSame("2","6","10","14");
        String x6 = oneIsZero("2","6","10","14");

        String x7 = oneIsZero("3","7","11","15");
        String x8 = theSame("3","7","11","15");
        String x9 = oneIsZero("3","7","11","15");

        String x10 = oneIsZero("4","8","12","16");
        String x11 = theSame("4","8","12","16");
        String x12 = oneIsZero("4","8","12","16");

        if(Objects.equals(x1, "NoChange") && Objects.equals(x2, "NoChange") && Objects.equals(x3, "NoChange") && Objects.equals(x4, "NoChange") && Objects.equals(x5, "NoChange") && Objects.equals(x6, "NoChange") && Objects.equals(x7, "NoChange") && Objects.equals(x8, "NoChange") && Objects.equals(x9, "NoChange") && Objects.equals(x10, "NoChange") && Objects.equals(x11, "NoChange") && Objects.equals(x12, "NoChange")){
            ergebnis = "NoChange";
        }
        return ergebnis;
    }
    public String theSame(String one, String two, String three, String four) {
        String ergebnis = "Change";

        String sOne = labelHashMap.get(one).getText();
        int iOne = Integer.parseInt(sOne);
        String sTwo = labelHashMap.get(two).getText();
        int iTwo = Integer.parseInt(sTwo);
        String sThree = labelHashMap.get(three).getText();
        int iThree = Integer.parseInt(sThree);
        String sFour = labelHashMap.get(four).getText();
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
        forBackGround(one);
        labelHashMap.get(String.valueOf(two)).setText(String.valueOf(iTwo));
        forBackGround(two);
        labelHashMap.get(String.valueOf(three)).setText(String.valueOf(iThree));
        forBackGround(three);
        labelHashMap.get(String.valueOf(four)).setText(String.valueOf(iFour));
        forBackGround(four);
        return ergebnis;
    }
    public String oneIsZero(String one, String two, String three, String four) {
        String ergebnis = "Change";

        String sOne = labelHashMap.get(one).getText();
        int iOne = Integer.parseInt(sOne);
        String sTwo = labelHashMap.get(two).getText();
        int iTwo = Integer.parseInt(sTwo);
        String sThree = labelHashMap.get(three).getText();
        int iThree = Integer.parseInt(sThree);
        String sFour = labelHashMap.get(four).getText();
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
        forBackGround(one);
        labelHashMap.get(String.valueOf(two)).setText(String.valueOf(iTwo));
        forBackGround(two);
        labelHashMap.get(String.valueOf(three)).setText(String.valueOf(iThree));
        forBackGround(three);
        labelHashMap.get(String.valueOf(four)).setText(String.valueOf(iFour));
        forBackGround(four);

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

        int rand2 = randomGenerator.nextInt(1, 17);
        for(int i = 0; i < 17; i++){
            if(rand2 != 0) {
                rand2 = helpMethodeIntegerSpur(i+1, String.valueOf(rand2), spur);
            }
        }
        System.out.println("                    ->  " +spur + "  spurned on field  " + rand2);
    }
    public int helpMethodeIntegerSpur(int loopValuePlusOne, String fieldValue, String spur){
        java.util.Random randomGenerator = new java.util.Random();
        String hFieldValue;
        hFieldValue = labelHashMap.get(fieldValue).getText();
        if (labelHashMap.get(fieldValue).getText().equals("0")) {
            labelHashMap.get(fieldValue).setText(spur);
            forBackGround(fieldValue);
        }
        int rand2 = 0;
        if (!hFieldValue.equals("0") && loopValuePlusOne <17) {
            rand2 = randomGenerator.nextInt(loopValuePlusOne, 17);
        }
        return rand2;
    }
}