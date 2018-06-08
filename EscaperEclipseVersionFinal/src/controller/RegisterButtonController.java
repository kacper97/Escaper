package controller;

import view.MainFrame;
import view.RegistrationPanel;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterButtonController implements ActionListener {
    private MainFrame properMainFrame;
    private boolean admin;

    public RegisterButtonController(MainFrame properMainFrame, boolean admin){
        super();
        this.properMainFrame = properMainFrame;
        this.admin = admin;

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JPanel regitrationPanel = new RegistrationPanel(this.properMainFrame,this.admin);
        properMainFrame.setNewPanel(regitrationPanel);



    }


}

