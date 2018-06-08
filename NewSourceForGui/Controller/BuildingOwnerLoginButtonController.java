package Controller;

import View.MainFrame;
import View.Panels.AdminLoginPanel;
import View.Panels.BuildingOwnerLoginPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BuildingOwnerLoginButtonController implements ActionListener {
    private MainFrame properMainFrame;

    public BuildingOwnerLoginButtonController(MainFrame properMainFrame){
        super();
        this.properMainFrame = properMainFrame;

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JPanel ownerLoginPanel = new BuildingOwnerLoginPanel(this.properMainFrame);
        properMainFrame.setNewPanel(ownerLoginPanel);



    }


}
