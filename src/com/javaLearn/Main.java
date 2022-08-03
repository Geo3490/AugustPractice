package com.javaLearn;
//
//import javax.swing.*;
//
//                          GUI

// public class Main {
//
//    public static void main(String[] args) {
//
//        JPanel panel = new JPanel();
//        JFrame frame = new JFrame();
//
//
//
//
//        frame.setSize(350, 250);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.add(panel);
//
//        panel.setLayout(null);
//
//        JLabel label = new JLabel("User");
//        label.setBounds(100, 25, 100, 100);
//        panel.add(label);
//
//        JTextField textField = new JTextField( 20);
//
//
//        panel.add(textField);
//
//        frame.setVisible(true);
//    }
//
//}

                //FIZZ BUZZ CHALLENGE

public class Main{
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++ ){

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Fizz Buzz");
            }
            if(i % 3 == 0){
                System.out.println("FIZZ");
            }
            if(i % 5 == 0){
                System.out.println("Buzz");
            }
        }
    }
}
