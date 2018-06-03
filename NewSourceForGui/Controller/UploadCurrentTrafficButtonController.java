package Controller;

import View.MainFrame;
import View.Panels.UserLoginPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class UploadCurrentTrafficButtonController  implements ActionListener {

    private MainFrame properMainFrame;
    private JTextField username;
    private JTextField password;
    private JTextField name;
    private JTextField surename;
    private ButtonGroup role;

    public UploadCurrentTrafficButtonController (MainFrame properMainFram){
        super();
        this.properMainFrame = properMainFrame;


    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JFileChooser fc = new JFileChooser();
        int val = fc.showOpenDialog(this.properMainFrame);
        if (val == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
            System.out.println("2Opening: " + file.getName());
        }

    }
}