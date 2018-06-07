package controller;

import view.MainFrame;
import view.WelcomePanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeButtonController implements ActionListener {
    private MainFrame properMainFrame;

    public HomeButtonController(MainFrame properMainFrame){
        super();
        this.properMainFrame = properMainFrame;

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JPanel welcomePanel = new WelcomePanel(this.properMainFrame);
        properMainFrame.setNewPanel(welcomePanel);



    }



}
