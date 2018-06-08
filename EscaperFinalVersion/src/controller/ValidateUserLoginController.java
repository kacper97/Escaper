package controller;

import model.User;
import view.MainFrame;
import view.AdminPanel;
import view.BuildingOwnerPanel;
import view.UserPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ValidateUserLoginController implements ActionListener {
    private MainFrame properMainFrame;
    private JTextField username;
    private JTextField password;
    private String privilige;

    public ValidateUserLoginController(MainFrame properMainFrame, JTextField username, JTextField password, String privilige){
        super();
        this.properMainFrame = properMainFrame;
        this.password = password;
        this.username = username;
        this.privilige = privilige;

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        User newUser = new User();
        String[] userData = newUser.login(this.username.getText(),this.password.getText(),this.privilige);
        if (this.privilige.equals("U")) {
            JPanel userPanel = new UserPanel(this.properMainFrame, userData[0], userData[1]);
            properMainFrame.setNewPanel(userPanel);
        }
        else if (this.privilige.equals("A")) {
            JPanel adminPanel = new AdminPanel(this.properMainFrame, userData[0], userData[1]);
            properMainFrame.setNewPanel(adminPanel);
        } else if (this.privilige.equals("B")) {
            JPanel buildingOwnerPanel = new BuildingOwnerPanel(this.properMainFrame, userData[0], userData[1]);
            properMainFrame.setNewPanel(buildingOwnerPanel);

        }



    }


}