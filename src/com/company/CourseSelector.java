package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseSelector extends JFrame implements ActionListener {

    JButton startQuiz;
    static String courseChosen;
    JComboBox selectBox;
    CourseSelector(){

        JPanel panel = new JPanel();
        this.setTitle("Main Window"); // sets title for the this
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE); // exit out application
        this.setSize(600,600); // set the this size
        this.setResizable(false);
        Border border = BorderFactory.createLineBorder(Color.decode("#ffd482"),3);

        // combo box
        String[] courses = {"","Maths" , "Science" , "Literature"};
        selectBox = new JComboBox(courses);
        selectBox.setBounds(200,240,200,90);

        // title for combo box
        JLabel title = new JLabel("Choose the course: ");
        title.setFont(new Font("Optima",Font.BOLD,22));
        title.setBounds(210,235,300,30);
        title.setForeground(Color.decode("#fe5f55"));

        // Button
        startQuiz = new JButton();
        startQuiz.setText("Start Quiz");
        startQuiz.setBounds(260, 300,80, 50);
        startQuiz.setForeground(Color.decode("#7a9e9f"));
        startQuiz.addActionListener(this);



        panel.add(selectBox);
        panel.add(startQuiz);
        panel.add(title);
        panel.setBorder(border);
        panel.setBackground(Color.decode("#4f6367"));
        panel.setLayout(null);

        this.add(panel);
//        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startQuiz){
            courseChosen = selectBox.getSelectedItem().toString();
            this.setVisible(false);
            Quiz frame3 = new Quiz();
            frame3.setVisible(true);
        }



    }
}
