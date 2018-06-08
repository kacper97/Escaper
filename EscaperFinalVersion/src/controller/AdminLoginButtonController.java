package controller;

import view.MainFrame;
import view.AdminLoginPanel;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdminLoginButtonController implements ActionListener {
    private MainFrame properMainFrame;

    public AdminLoginButtonController(MainFrame properMainFrame){
        super();
        this.properMainFrame = properMainFrame;

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JPanel adminLoginPanel = new AdminLoginPanel(this.properMainFrame);
        properMainFrame.setNewPanel(adminLoginPanel);



    }


}

