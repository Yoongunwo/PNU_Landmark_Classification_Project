package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame {
    public static JLabel label = new JLabel("Hello, World!");
    Container c;
    MyFrame(){
        this.setTitle("Image Classification");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c = this.getContentPane();
        c.setLayout(null);

        MenuBar menuBar = new MenuBar(c,this);
        setJMenuBar(menuBar.mb);
        JButton bt = new JButton("hi");


        this.setSize(1000,1000);
        this.setVisible(true);

        int xbt = this.getWidth();

        c.add(bt);
        bt.setSize(30,30);
        int wbt = bt.getWidth();
        bt.setLocation(xbt/2-wbt,850);

        ActionListener listen = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c.add(label);
                label.setSize(100,50);
                int wlb = label.getWidth();
                label.setLocation(xbt/2-wlb,800);
            }
        };

        bt.addActionListener(listen);
    }

    public void labelremove(){
        label.setSize(0,0);
    }
}
