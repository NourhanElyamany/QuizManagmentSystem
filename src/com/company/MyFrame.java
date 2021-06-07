package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton start;
    JTextField id;
    JTextField text;
    Person p = new Person();
    MyFrame(){
        // JFrame = a gui window to add components to
        JPanel panel = new JPanel();
        this.setTitle("Main Window"); // sets title for the this
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); // exit out application
        this.setSize(700,700); // set the this size
        this.setResizable(false);
//        this.setLayout(new FlowLayout());
        ImageIcon image = new ImageIcon("/Users/nourhanelyamany/Desktop/Java-Projects/Quiz Managment System/src/com/company/quiz.png");
        Border border = BorderFactory.createLineBorder(Color.decode("#ffd482"),3);


        // welcome label
        JLabel label = new JLabel(); // create a label
        label.setText("   \nWELCOME..");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(Color.decode("#EEF5DB"));
        label.setFont(new Font("Optima", Font.CENTER_BASELINE,22));
        label.setIconTextGap(-140);
        label.setIcon(image);
        label.setBounds(100,100,350,350);

        // manager application label
        JLabel label2 = new JLabel();
        label2.setText("APPLICATION MANAGER");
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setForeground(Color.decode("#EEF5DB"));
        label2.setFont(new Font("Optima", Font.CENTER_BASELINE,19));
        label2.setBounds(200,220,250,250);

        // text entry
        text = new JTextField();
        JLabel username = new JLabel("Username: ");
        username.setFont(new Font("Optima",Font.BOLD,16));
        username.setBounds(138,380,200,30);
        username.setForeground(Color.decode("#B8D8D8"));
        text.setBounds(230, 380, 200, 30);
        text.setAlignmentX(JTextField.CENTER);
        text.setAlignmentY(JTextField.CENTER);
        text.setBackground(Color.decode("#EEF5DB"));
//        text.setText("EnterYourUsername..");
        //        text.setEditable(false);
        id = new JTextField();
        JLabel ID = new JLabel("ID: ");
        ID.setFont(new Font("Optima",Font.BOLD,16));
        ID.setBounds(138,430,200,30);
        ID.setForeground(Color.decode("#B8D8D8"));
        id.setBounds(230, 430, 200, 30);
        id.setAlignmentX(JTextField.CENTER);
        id.setAlignmentY(JTextField.CENTER);
        id.setBackground(Color.decode("#EEF5DB"));
//        id.setText("EnterYourID..");

        // button creation
        start = new JButton();
        start.setText("Start");
        start.setBounds(430, 430,70, 30);
        start.setForeground(Color.decode("#7a9e9f"));
        start.addActionListener(this);


        panel.setBorder(border);
        panel.setBackground(Color.decode("#4f6367"));
        panel.add(start);
        panel.add(text);
        panel.add(label);
        panel.add(label2);
        panel.add(username);
        panel.add(id);
        panel.add(ID);
        panel.setLayout(null);

        this.add(panel);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == start){
            p.username = text.getText();
            p.Id = Integer.parseInt(id.getText());
            System.out.println(p.username + p.Id);
            this.setVisible(false);
            CourseSelector frame2 = new CourseSelector();
            frame2.setVisible(true);
        }

    }


}
