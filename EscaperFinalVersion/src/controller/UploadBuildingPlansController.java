package controller;

import model.MainMap;
import model.MapDrawer;
import view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class UploadBuildingPlansController  implements ActionListener {

    private MainFrame properMainFrame;

    public UploadBuildingPlansController (MainFrame properMainFrame){
        super();
        this.properMainFrame = properMainFrame;


    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JFileChooser fc = new JFileChooser();
        int val = fc.showOpenDialog(this.properMainFrame);
        if (val == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
            MapDrawer.imageName = "Resources\\plan.png";
            MainMap.file1 = file.getPath();

        }

    }
}
