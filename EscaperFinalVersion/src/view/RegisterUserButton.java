package view;

import controller.RegisterButtonController;
import view.MainFrame;

import javax.swing.*;
import java.awt.*;

import static view.WelcomePanel.WELCOME_PANEL_HEIGHT;
import static view.WelcomePanel.WELCOME_PANEL_WIDTH;

public class RegisterUserButton extends JButton {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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