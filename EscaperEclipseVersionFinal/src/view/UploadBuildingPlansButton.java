package view;

import controller.UploadBuildingPlansController;
import view.MainFrame;

import javax.swing.*;
import java.awt.*;

import static view.WelcomePanel.WELCOME_PANEL_HEIGHT;
import static view.WelcomePanel.WELCOME_PANEL_WIDTH;

public class UploadBuildingPlansButton extends JButton {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MainFrame properMainFrame;


    public UploadBuildingPlansButton(MainFrame properMainFrame, String text) {
        super();
        this.properMainFrame = properMainFrame;
        setText(text);
        setBackground(Color.ORANGE);
        setFont(new Font("Arial", Font.BOLD, 40));
        setPreferredSize(new Dimension(WELCOME_PANEL_WIDTH, WELCOME_PANEL_HEIGHT / 8));
        UploadBuildingPlansController ubpc = new UploadBuildingPlansController(this.properMainFrame);
        addActionListener(ubpc);


    }
}
