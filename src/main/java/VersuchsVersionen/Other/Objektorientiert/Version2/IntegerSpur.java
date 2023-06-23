package VersuchsVersionen.Other.Objektorientiert.Version2;

import javax.swing.*;
import java.util.HashMap;

public class IntegerSpur extends V1Game2048 {
    public IntegerSpur(HashMap<String, JLabel> labelHashMap) {
        super();
        this.labelHashMap = labelHashMap;
        System.out.println(labelHashMap.get("2").getText());
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
}
