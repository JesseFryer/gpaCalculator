package gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class AppPanel extends JPanel {

    private BufferedImage banner;
    public AppPanel () {
        setPanelSize();
        importAssets();
    }

    private void setPanelSize() {
        Dimension size = new Dimension(1280, 720);
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
    }

    private void importAssets() {
        InputStream is = getClass().getResourceAsStream("/banner.png");
        try {
            banner = ImageIO.read(is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(banner,382,0,null);
    }

}
