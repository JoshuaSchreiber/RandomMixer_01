package VersuchsVersionen.Other.JFrameTests;
import java.util.prefs.*;

public class SavingAValue {

    public SavingAValue(){
        //savePreference("10", "20");
        String myValue = readPreference("10");

        System.out.println(readPreference("10"));
    }

    public void savePreference(String key, String value) {
        Preferences prefs = Preferences.userNodeForPackage(SavingAValue.class);
        prefs.put(key, value);
    }

    public String readPreference(String key) {
        Preferences prefs = Preferences.userNodeForPackage(SavingAValue.class);
        return prefs.get(key, "default");
    }

}