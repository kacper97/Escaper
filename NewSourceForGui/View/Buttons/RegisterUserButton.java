package View.Buttons;

import Controller.RegisterButtonController;
import View.MainFrame;

import javax.swing.*;
import java.awt.*;

import static View.Panels.WelcomePanel.WELCOME_PANEL_HEIGHT;
import static View.Panels.WelcomePanel.WELCOME_PANEL_WIDTH;

public class RegisterUserButton extends JButton {
    private MainFrame properMainFrame;
    private boolean admin;


    public RegisterUserButton(MainFrame properMainFrame, String text, boolean admin) {
        super();
        this.properMainFrame = properMainFrame;
        this.admin = admin;
        setText(text);
        setBackground(Color.YELLOW);
        setFont(new Font("Arial", Font.BOLD, 40));
        setPreferredSize(new Dimension(WELCOME_PANEL_WIDTH, WELCOME_PANEL_HEIGHT / 8));
        RegisterButtonController rbc = new RegisterButtonController(this.properMainFrame, this.admin);
        addActionListener(rbc);


    }
}