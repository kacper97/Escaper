package View.Buttons;

import Controller.StartButtonController;
import View.MainFrame;

import javax.swing.*;
import java.awt.*;


import static View.Panels.WelcomePanel.WELCOME_PANEL_HEIGHT;
import static View.Panels.WelcomePanel.WELCOME_PANEL_WIDTH;

public class StartButton extends JButton {
    private MainFrame properMainFrame;


    public StartButton(MainFrame properMainFrame){
        super();
        this.properMainFrame = properMainFrame;
        setText("Press here to start");
        setBackground(Color.white);
        setFont(new Font("Arial", Font.BOLD, 40));
        setPreferredSize(new Dimension(WELCOME_PANEL_WIDTH,WELCOME_PANEL_HEIGHT/8));
        StartButtonController sbc = new StartButtonController(this.properMainFrame);
        addActionListener(sbc);


    }


}
