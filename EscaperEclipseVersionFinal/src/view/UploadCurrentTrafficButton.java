package view;

import controller.UploadCurrentTrafficButtonController;
import view.MainFrame;

import javax.swing.*;
import java.awt.*;

import static view.WelcomePanel.WELCOME_PANEL_HEIGHT;
import static view.WelcomePanel.WELCOME_PANEL_WIDTH;

public class UploadCurrentTrafficButton extends JButton {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
