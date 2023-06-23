package VersuchsVersionen.Other.Objektorientiert.Version3;

import javax.swing.*;

public class GameWindow extends JFrame {

    public GameWindow(String title){
        setTitle(title);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        GamePanel gamePanel = new GamePanel();
        add(gamePanel);

        setExtendedState(MAXIMIZED_BOTH);

        setVisible(true);
        setResizable(false);
    }
}
