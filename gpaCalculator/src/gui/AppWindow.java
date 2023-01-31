package gui;

import javax.swing.*;

public class AppWindow extends JFrame {
    public AppWindow(AppPanel appPanel) {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(appPanel);
        setLocationRelativeTo(null);
        setResizable(false);
        pack();
        setVisible(true);
    }

}
