package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
public class LoginFrame extends JFrame {
    private JLabel loginLabel;
    private JLabel passwordLabel;
    private JTextField loginField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JButton registrationButton;
    private Base usersBase=new Base();

LoginFrame(){

    setSize(350,250);

    loginLabel = new JLabel("User:");
    loginLabel.setBounds(10,20,80,25);
    add(loginLabel);

    loginField = new JTextField();
    loginField.setBounds(100,20,165,25);
    add(loginField);

    passwordLabel = new JLabel("Password:");
    passwordLabel.setBounds(10,50,80,25);
    add(passwordLabel);

    passwordField = new JPasswordField();
    passwordField.setBounds(100,50,165,25);
    add(passwordField);

    loginButton = new JButton("Login");
    loginButton.setFocusable(false);
    loginButton.addActionListener(e -> loginStatus(e));
    loginButton.setBounds(10,80, 80,25);
    add(loginButton);

    registrationButton=new JButton("Registration");
    registrationButton.setFocusable(false);
    registrationButton.addActionListener(e->registrationStatus(e));
    registrationButton.setBounds(90,80,160,25);
    add(registrationButton);

    setLayout(null);
    setVisible(true);

    initialusersBase();
}
    private void registrationStatus(ActionEvent e){
        String login = loginField.getText();
        String password = String.valueOf(passwordField.getPassword());

        if(usersBase.getAllUsers().containsKey(login)) {
            if(usersBase.getAllUsers().get(login).equals(password)) {
                getContentPane().setBackground(Color.RED);
            }
            else {
                getContentPane().setBackground(Color.GREEN);
            }
        }
        else  getContentPane().setBackground(Color.GREEN);
    }
    private void loginStatus(ActionEvent e) {
        String login = loginField.getText();
        String password = String.valueOf(passwordField.getPassword());

        if(usersBase.getAllUsers().containsKey(login)) {
            if(usersBase.getAllUsers().get(login).equals(password)) {
                getContentPane().setBackground(Color.GREEN);
            }
            else  getContentPane().setBackground(Color.RED);
        }
        else  getContentPane().setBackground(Color.RED);
    }

    private void initialusersBase(){
        usersBase.usersBase();
    }
}
