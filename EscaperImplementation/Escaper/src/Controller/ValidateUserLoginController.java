package Controller;

import Model.User;
import View.MainFrame;
import View.Panels.UserLoginPanel;
import View.Panels.UserPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValidateUserLoginController implements ActionListener {
    private MainFrame properMainFrame;
    private JTextField username;
    private JTextField password;

    public ValidateUserLoginController(MainFrame properMainFrame, JTextField username, JTextField password){
        super();
        this.properMainFrame = properMainFrame;
        this.password = password;
        this.username = username;

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Hello");
        User newUser = new User();
        String[] userData = newUser.login(this.username.getText(),this.password.getText(),"U");
        JPanel userPanel = new UserPanel(this.properMainFrame,userData[0],userData[1]);
        properMainFrame.setNewPanel(userPanel);



    }


}