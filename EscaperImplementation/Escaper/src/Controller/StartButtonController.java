package Controller;

import View.MainFrame;
import View.Panels.LoginPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartButtonController implements ActionListener {
    private MainFrame properMainFrame;

    public StartButtonController(MainFrame properMainFrame){
        super();
        this.properMainFrame = properMainFrame;

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("Hello");
        JPanel loginPanel = new LoginPanel(this.properMainFrame);
        properMainFrame.setNewPanel(loginPanel);



    }


}
