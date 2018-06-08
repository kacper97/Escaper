package view;

import view.GetEscapeRootButton;
import view.MainFrame;

import javax.swing.*;

import java.awt.*;

import static view.MainFrame.APPLICATION_HEIGHT;
import static view.MainFrame.APPLICATION_WIDTH;
import static view.BottomNavigationPanel.BOTTOM_PANEL_HEIGHT;

public class UserPanel extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final static int LOGIN_PANEL_WIDTH = APPLICATION_WIDTH;
    public final static int LOGIN_PANEL_HEIGHT = APPLICATION_HEIGHT - BOTTOM_PANEL_HEIGHT;
    private MainFrame properMainFrame;

    public UserPanel(MainFrame properMainFrame, String name, String surname) {
        this.properMainFrame = properMainFrame;
        setPreferredSize(new Dimension(LOGIN_PANEL_WIDTH, LOGIN_PANEL_HEIGHT));
        setBackground(Color.darkGray);
        JLabel textLabel = new JLabel("Welcome " + name + " " + surname,SwingConstants.CENTER);
        textLabel.setFont(new Font("Arial", Font.BOLD, 40));
        textLabel.setForeground(Color.white);
        setLayout(new GridLayout(7,1));
        JButton getEscapeRoot = new GetEscapeRootButton(this.properMainFrame);
        add(textLabel);
        add(getEscapeRoot);
    }
}
