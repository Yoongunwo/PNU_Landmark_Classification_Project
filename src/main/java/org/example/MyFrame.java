package org.example;

import javax.swing.*;
import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("Image Classification");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = this.getContentPane();
        c.setLayout(null);

        MenuBar menuBar = new MenuBar(c);
        setJMenuBar(menuBar.mb);
        JButton bt = new JButton("hi");
        bt.setSize(30,30);
        bt.setLocation(450,450);
        c.add(bt);
        this.setSize(1000,1000);
        this.setVisible(true);
    }
}
