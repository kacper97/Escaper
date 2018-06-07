package controller;

import view.MainFrame;
import view.UserLoginPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserLoginButtonController implements ActionListener {
    private MainFrame properMainFrame;

    public UserLoginButtonController(MainFrame properMainFrame){
        super();
        this.properMainFrame = properMainFrame;

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JPanel userLoginPanel = new UserLoginPanel(this.properMainFrame);
        properMainFrame.setNewPanel(userLoginPanel);



    }


}