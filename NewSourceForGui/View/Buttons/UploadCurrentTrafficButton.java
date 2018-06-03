package View.Buttons;

import Controller.UploadBuildingPlansController;
import Controller.UploadCurrentTrafficButtonController;
import View.MainFrame;

import javax.swing.*;
import java.awt.*;

import static View.Panels.WelcomePanel.WELCOME_PANEL_HEIGHT;
import static View.Panels.WelcomePanel.WELCOME_PANEL_WIDTH;

public class UploadCurrentTrafficButton extends JButton {
    private MainFrame properMainFrame;


    public UploadCurrentTrafficButton(MainFrame properMainFrame, String text) {
        super();
        this.properMainFrame = properMainFrame;
        setText(text);
        setBackground(Color.ORANGE);
        setFont(new Font("Arial", Font.BOLD, 40));
        setPreferredSize(new Dimension(WELCOME_PANEL_WIDTH, WELCOME_PANEL_HEIGHT / 8));
        UploadCurrentTrafficButtonController uctc = new UploadCurrentTrafficButtonController(this.properMainFrame);
        addActionListener(uctc);


    }
}
