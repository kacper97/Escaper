package controller;

import model.User;
import view.MainFrame;
import view.UserLoginPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValidateRegistrationButtonController implements ActionListener {

    private MainFrame properMainFrame;
    private JTextField username;
    private JTextField password;
    private JTextField name;
    private JTextField surename;
    private ButtonGroup role;

    public ValidateRegistrationButtonController(MainFrame properMainFrame, JTextField username, JTextField password, JTextField name, JTextField surename, ButtonGroup role){
        super();
        this.properMainFrame = properMainFrame;
        this.password = password;
        this.username = username;
        this.name = name;
        this.surename = surename;
        this.role = role;

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        //System.out.println(role.getSelection().getActionCommand());
        User newUser = new User();
        newUser.register(this.username.getText(),this.password.getText(),this.name.getText(),this.surename.getText(),this.role.getSelection().getActionCommand());
        JPanel userLoginPanel = new UserLoginPanel(this.properMainFrame);
        properMainFrame.setNewPanel(userLoginPanel);
    }
}
