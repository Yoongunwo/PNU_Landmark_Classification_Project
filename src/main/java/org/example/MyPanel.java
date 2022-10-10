package org.example;

import javax.swing.*;
import java.awt.*;

class MyPanel extends JPanel {
    private ImageIcon icon;
    private Image image;
    MyPanel(String path){
        icon = new ImageIcon(path);
        image = icon.getImage();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image,0,0, this.getWidth(), this.getHeight(), this);
    }
}
