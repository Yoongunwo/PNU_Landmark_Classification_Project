package org.example;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuBar {
    JMenuBar mb;
    Container c;
    MenuBar(Container c) {
        this.c = c;
        mb = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        openItem.addActionListener(new OpenActionListener());
        fileMenu.add(openItem);
        mb.add(fileMenu);
    }
    class OpenActionListener implements ActionListener{
        private JFileChooser chooser;

        OpenActionListener(){
            chooser = new JFileChooser();
        }

        public void actionPerformed(ActionEvent e) {
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                    "JPG & GIF Images", "jpg", "gif");
            chooser.setFileFilter(filter);
            int ret = chooser.showOpenDialog(null);
            if(ret != JFileChooser.APPROVE_OPTION){
                JOptionPane.showMessageDialog(null, "Yon didn't choose file.",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            String path = chooser.getSelectedFile().getPath();
            MyPanel panel = new MyPanel(path);
            c.add(panel);
            panel.setLocation(30,30);
            panel.setSize(500,500);
        }
    }
}
