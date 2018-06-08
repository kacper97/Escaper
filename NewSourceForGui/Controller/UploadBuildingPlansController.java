package Controller;

import Model.User;
import View.MainFrame;
import View.Panels.LoginPanel;
import View.Panels.UserLoginPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class UploadBuildingPlansController  implements ActionListener {

    private MainFrame properMainFrame;

    public UploadBuildingPlansController (MainFrame properMainFram){
        super();
        this.properMainFrame = properMainFrame;


    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JFileChooser fc = new JFileChooser();
        int val = fc.showOpenDialog(this.properMainFrame);
        if (val == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
            System.out.println("1Opening: " + file.getName());
        }

    }
}
