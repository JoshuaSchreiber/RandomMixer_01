
import Version9.V1Game2048;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialOceanicIJTheme;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) throws UnsupportedLookAndFeelException {

        FlatMaterialOceanicIJTheme.setup();
        UIManager.setLookAndFeel(new FlatMaterialOceanicIJTheme());
        V1Game2048 v1Game2048 = new V1Game2048("2048");
        Toolkit.getDefaultToolkit().addAWTEventListener(v1Game2048, AWTEvent.KEY_EVENT_MASK);
    }
}