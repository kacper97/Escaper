package view;

import controller.GetEscapeRootButtonController;
import view.MainFrame;

import javax.swing.*;
import java.awt.*;

import static view.WelcomePanel.WELCOME_PANEL_HEIGHT;
import static view.WelcomePanel.WELCOME_PANEL_WIDTH;

public class GetEscapeRootButton extends JButton {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public GetEscapeRootButton(MainFrame properMainFrame) {
        super();
        setText("Get Escape Route");
        setBackground(Color.GREEN);
        setFont(new Font("Arial", Font.BOLD, 30));
        setPreferredSize(new Dimension(WELCOME_PANEL_WIDTH, WELCOME_PANEL_HEIGHT / 8));
        GetEscapeRootButtonController gerbc = new GetEscapeRootButtonController();
        addActionListener(gerbc);
    }
}
