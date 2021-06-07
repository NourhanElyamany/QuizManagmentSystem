package com.company;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
   
    MyFrame(){

        // JFrame = a gui window to add components to

        this.setTitle("Main Window"); // sets title for the this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out application
        this.setSize(600,600); // set the this size
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.decode("#4E586E"));
    }
}
