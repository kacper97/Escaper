package Controller;

import Model.Graph.MainMap;
import Model.Graph.MapDrawer;
import View.MainFrame;

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
            MapDrawer.imageName = "plan1.png";
            MainMap.file1 = file.getName();

        }

    }
}
