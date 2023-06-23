package VersuchsVersionen.Other.Objektorientiert.Version3;

import Version9.V1Game2048;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialDeepOceanIJTheme;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialOceanicIJTheme;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.util.HashMap;
import java.util.Objects;
import java.util.prefs.Preferences;

public class GamePanel extends JPanel {
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
    JLabel rekord;
    int color = 1;
    JButton reset;
    JButton  b; // fake Button
    JLabel l; // fake Label
    GridBagConstraints gridBagConstraints;
    private GridBagLayout gridBagLayout;

    public GamePanel(){
        gridBagLayout = new GridBagLayout();
        setLayout(gridBagLayout);
        initGame();
    }

    public void initGame(){
        initComponents();

    }

    public void initComponents(){

        l1 = new JLabel("0");
        l2 = new JLabel("0");
        l3 = new JLabel("0");
        l4 = new JLabel("0");

        l5 = new JLabel("0");
        l6 = new JLabel("0");
        l7 = new JLabel("0");
        l8 = new JLabel("0");

        l9 = new JLabel("0");
        l10 = new JLabel("0");
        l11 = new JLabel("0");
        l12 = new JLabel("0");

        l13 = new JLabel("0");
        l14 = new JLabel("0");
        l15 = new JLabel("0");
        l16 = new JLabel("0");

        colorChange = new JButton("Change Color Theme!");
        newField("jButton", l, colorChange, "#000000", "#FFFFFF", 250, 50, 1, 6,1,1,5,50,5,100);
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
        });

        topLine = new JLabel("2048");
        newField("jLabel", topLine, b, "#000000", "#FFFFFF", 10, 80, 2, 0,0,10,5,35,5,5);

        jPunktzahl = new JLabel("Punktzahl: " + punktzahl);
        newField("jLabel", jPunktzahl, b, "#000000", "#FFFFFF", 250, 50, 1, 0, 2, 1, 5,50,100,5);

        rekord = new JLabel("Rekord: " + readPreference("1"));
        newField("jLabel",rekord, b, "#000000", "#FFFFFF", 250, 50, 1, 0, 1, 1, 5,50,100,5);

        labelHashMap.put("1", newField("jLabel", l1, b,"", "", 100, 100, 1, 1, 1, 1, 5, 5,5, 5 ));
        labelHashMap.put("2", newField("jLabel", l2, b,"", "", 100, 100, 1, 2, 1, 1, 5, 5,5, 5 ));
        labelHashMap.put("3", newField("jLabel", l3, b,"", "", 100, 100, 1, 3, 1, 1, 5, 5,5, 5 ));
        labelHashMap.put("4", newField("jLabel", l4, b,"", "", 100, 100, 1, 4, 1, 1, 5, 5,5, 5 ));

        labelHashMap.put("5", newField("jLabel", l5, b,"", "", 100, 100, 1, 1, 2, 1, 5, 5,5, 5 ));
        labelHashMap.put("6", newField("jLabel", l6, b,"", "", 100, 100, 1, 2, 2, 1, 5, 5,5, 5 ));
        labelHashMap.put("7", newField("jLabel", l7, b,"", "", 100, 100, 1, 3, 2, 1, 5, 5,5, 5 ));
        labelHashMap.put("8", newField("jLabel", l8, b,"", "", 100, 100, 1, 4, 2, 1, 5, 5,5, 5 ));

        labelHashMap.put("9", newField("jLabel", l9, b,"", "", 100, 100, 1, 1, 3, 1, 5, 5,5, 5 ));
        labelHashMap.put("10", newField("jLabel", l10, b,"", "", 100, 100, 1, 2, 3, 1, 5, 5,5, 5 ));
        labelHashMap.put("11", newField("jLabel", l11, b,"", "", 100, 100, 1, 3, 3, 1, 5, 5,5, 5 ));
        labelHashMap.put("12", newField("jLabel", l12, b,"", "", 100, 100, 1, 4, 3, 1, 5, 5,5, 5 ));

        labelHashMap.put("13", newField("jLabel", l13, b,"", "", 100, 100, 1, 1, 4, 1, 5, 50,5, 5 ));
        labelHashMap.put("14", newField("jLabel", l14, b,"", "", 100, 100, 1, 2, 4, 1, 5, 50,5, 5 ));
        labelHashMap.put("15", newField("jLabel", l15, b,"", "", 100, 100, 1, 3, 4, 1, 5, 50,5, 5 ));
        labelHashMap.put("16", newField("jLabel", l16, b,"", "", 100, 100, 1, 4, 4, 1, 5, 50,5, 5 ));

        actualise(16);

        reset = new JButton("reset");
        newField("jButton", l, reset, "#000000", "#FFFFFF", 250, 50, 1, 6, 2, 1, 5,50,5,100);
        reset.addActionListener(e -> {
            if(e.getSource() == this.reset){
                for(int i = 1; i < 17; i++){
                    labelHashMap.get(String.valueOf(i)).setText("0");
                }
                integerSpur();
                actualise(16);
            }

        });
    }

    public JLabel newField(String labelOrButton, JLabel jLabel, JButton jButton, String backgroundColor, String foregroundColor, int preferredSizeWidth, int preferredSizeHeight, int fontSize, int gridx, int gridy, int gridwidth, int insetsUp, int insetsDown, int insetsRight, int insetsLeft) {
        if (Objects.equals(labelOrButton, "jLabel")) {
            if (!backgroundColor.equals("")) {
                jLabel.setBackground(Color.decode(backgroundColor));
                jLabel.setForeground(Color.decode(foregroundColor));
            }
            jLabel.setPreferredSize(new Dimension(preferredSizeWidth, preferredSizeHeight));
            jLabel.setVerticalAlignment(JLabel.CENTER);
            jLabel.setHorizontalAlignment(JLabel.CENTER);
            if (!backgroundColor.equals("#000000")) {
                jLabel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            }else{
                jLabel.setBorder(BorderFactory.createLineBorder(Color.CYAN, 1));
            }
            if (fontSize == 1) {
                jLabel.setFont(jLabel.getFont().deriveFont(20f));
            } else if (fontSize == 2) {
                jLabel.setFont(jLabel.getFont().deriveFont(40f));
            }
            jLabel.setFont(jLabel.getFont().deriveFont(Font.BOLD));
            // jLabel.setBorder(new OvalBorder());
            jLabel.setOpaque(true);
        } else if (Objects.equals(labelOrButton, "jButton")) {
            if(!backgroundColor.equals("")) {
                jButton.setBackground(Color.decode(backgroundColor));
                jButton.setForeground(Color.decode(foregroundColor));
            }
            jButton.setPreferredSize(new Dimension(preferredSizeWidth, preferredSizeHeight));
            jButton.setVerticalAlignment(JLabel.CENTER);
            jButton.setHorizontalAlignment(JLabel.CENTER);
            if (!backgroundColor.equals("#000000")) {
                jButton.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
            }else {
                jButton.setBorder(BorderFactory.createLineBorder(Color.CYAN, 1));
            }
            jButton.setFont(jButton.getFont().deriveFont(20f));
            jButton.setFont(jButton.getFont().deriveFont(Font.BOLD));
            jButton.setOpaque(true);
        }
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = gridx;
        gridBagConstraints.gridy = gridy;
        gridBagConstraints.gridwidth = gridwidth;
        gridBagConstraints.gridheight = 1;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.insets = new Insets(insetsUp, insetsLeft, insetsDown, insetsRight);
        if (Objects.equals(labelOrButton, "jLabel")) {
            gridBagLayout.setConstraints(jLabel, gridBagConstraints);
            add(jLabel);
        } else if (Objects.equals(labelOrButton, "jButton")) {
            gridBagLayout.setConstraints(jButton, gridBagConstraints);
            add(jButton);
        }
        return jLabel;
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

        punktzahl = (Integer.parseInt(labelHashMap.get("1").getText())+Integer.parseInt(labelHashMap.get("2").getText())+Integer.parseInt(labelHashMap.get("3").getText())+Integer.parseInt(labelHashMap.get("4").getText())+Integer.parseInt(labelHashMap.get("5").getText())+Integer.parseInt(labelHashMap.get("6").getText())+Integer.parseInt(labelHashMap.get("7").getText())+Integer.parseInt(labelHashMap.get("8").getText())+Integer.parseInt(labelHashMap.get("9").getText())+Integer.parseInt(labelHashMap.get("10").getText())+Integer.parseInt(labelHashMap.get("11").getText())+Integer.parseInt(labelHashMap.get("12").getText())+Integer.parseInt(labelHashMap.get("13").getText())+Integer.parseInt(labelHashMap.get("14").getText())+Integer.parseInt(labelHashMap.get("15").getText())+Integer.parseInt(labelHashMap.get("16").getText()));
        jPunktzahl.setText("Punktzahl:  " + punktzahl);

        if(Integer.parseInt(readPreference("1")) < punktzahl){
            SavingAValue(String.valueOf(punktzahl));
        }
        rekord.setText("Rekord:  " + String.valueOf(readPreference("1")));
    }
    public String readPreference(String key) {
        Preferences prefs = Preferences.userNodeForPackage(V1Game2048.class);
        return prefs.get(key, "0");
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
    public void SavingAValue(String valueToSave){
        savePreference("1", valueToSave);
    }
    public void savePreference(String key, String value) {
        Preferences prefs = Preferences.userNodeForPackage(V1Game2048.class);
        prefs.put(key, value);
    }
}
