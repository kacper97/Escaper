package view;

import view.AdminLoginButton;
import view.BuildignOwnerLoginButton;
import view.UserLoginButton;
import view.MainFrame;

import javax.swing.*;
import java.awt.*;

import static view.MainFrame.APPLICATION_HEIGHT;
import static view.MainFrame.APPLICATION_WIDTH;
import static view.BottomNavigationPanel.BOTTOM_PANEL_HEIGHT;

public class LoginPanel extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final static int LOGIN_PANEL_WIDTH = APPLICATION_WIDTH;
    public final static int LOGIN_PANEL_HEIGHT = APPLICATION_HEIGHT - BOTTOM_PANEL_HEIGHT;
    
    public LoginPanel(MainFrame properMainFrame) {
        setPreferredSize(new Dimension(LOGIN_PANEL_WIDTH,LOGIN_PANEL_HEIGHT));
        JButton adminLog = new AdminLoginButton(properMainFrame);
        JButton userLog = new UserLoginButton(properMainFrame);
        JButton buildOwnLog = new BuildignOwnerLoginButton(properMainFrame);
        setLayout(new BorderLayout());
        add(userLog, BorderLayout.NORTH);
        add(adminLog, BorderLayout.CENTER);
        add(buildOwnLog, BorderLayout.SOUTH);

    }
}
