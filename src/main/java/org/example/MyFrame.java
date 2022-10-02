package org.example;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("Image Classification");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = this.getContentPane();
        c.setLayout(null);

        MenuBar menuBar = new MenuBar(c);
        setJMenuBar(menuBar.mb);

        this.setSize(1000,1000);
        this.setVisible(true);
    }
}
