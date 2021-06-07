package com.company;

import javax.swing.*;
import java.awt.*;

public class MainWindow{
    public static void main(String[] args){


        // create a frame


        // JFrame = a gui window to add components to

        JFrame frame = new JFrame(); // create a frame
        frame.setTitle("Main Window"); // sets title for the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out application
        frame.setSize(600,600); // set the frame size
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.decode("#4E586E"));
    }
}
