package controller;

import model.MainMap;
import view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class UploadCurrentTrafficButtonController  implements ActionListener {

    private MainFrame properMainFrame;

    public UploadCurrentTrafficButtonController (MainFrame properMainFrame){
        super();
        this.properMainFrame = properMainFrame;


    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JFileChooser fc = new JFileChooser();
        int val = fc.showOpenDialog(this.properMainFrame);
        if (val == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
            MainMap.file2 = file.getPath();
        }

    }
}