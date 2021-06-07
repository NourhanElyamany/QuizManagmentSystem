package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.GraphicsEnvironment;


public class MainWindow{
    public static void main(String[] args){

        //frame and icon

        JFrame frame = new JFrame(); // create a frame
        JPanel panel = new JPanel();
        frame.setTitle("Main Window"); // sets title for the this
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out application
        frame.setSize(600,600); // set the this size
        frame.setResizable(false);
        ImageIcon image = new ImageIcon("/Users/nourhanelyamany/Desktop/Java-Projects/Quiz Managment System/src/com/company/quiz.png");
        Border border = BorderFactory.createLineBorder(Color.decode("#ffd482"),3);

        // welcome label
        JLabel label = new JLabel(); // create a label
        label.setText("   \nWELCOME..");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.decode("#FFD482"));
        label.setFont(new Font("Optima", Font.CENTER_BASELINE,22));
        label.setIconTextGap(-140);
        label.setIcon(image);
        label.setBounds(100,100,350,350);

        // manager application label
        JLabel label2 = new JLabel();
        label2.setText("MANAGER APPLICATION");
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setForeground(Color.decode("#FFD482"));
        label2.setFont(new Font("Optima", Font.CENTER_BASELINE,19));
        label2.setBounds(200,220,250,250);


        // panel
        panel.setBorder(border);
        panel.setBackground(Color.decode("#4E586E"));
        panel.add(label);
        panel.add(label2);
        panel.setLayout(null);


        frame.add(panel);
        frame.setVisible(true);


        String fonts[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for ( int i = 0; i < fonts.length; i++ )
        {
            System.out.println(fonts[i]);
        }





    }
}
