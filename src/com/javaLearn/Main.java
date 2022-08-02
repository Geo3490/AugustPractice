package com.javaLearn;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Main {

    public static void main(String[] args) {

        JPanel panel = new JPanel();
        JFrame frame = new JFrame();




        frame.setSize(350, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel label = new JLabel("User");
        label.setBounds(10,20,80,25);
        panel.add(label);

        JTextField textField = new JTextField(20);
        panel.add(textField);

        frame.setVisible(true);

    }
}
