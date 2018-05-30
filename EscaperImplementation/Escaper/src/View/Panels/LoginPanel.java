package View.Panels;

import View.Buttons.AdminLoginButton;
import View.Buttons.BuildignOwnerLoginButton;
import View.Buttons.UserLoginButton;
import View.MainFrame;

import javax.swing.*;
import java.awt.*;

import static View.MainFrame.APPLICATION_HEIGHT;
import static View.MainFrame.APPLICATION_WIDTH;
import static View.Panels.BottomNavigationPanel.BOTTOM_PANEL_HEIGHT;

public class LoginPanel extends JPanel {

    public final static int LOGIN_PANEL_WIDTH = APPLICATION_WIDTH;
    public final static int LOGIN_PANEL_HEIGHT = APPLICATION_HEIGHT - BOTTOM_PANEL_HEIGHT;
    private MainFrame properMainFrame;


    public LoginPanel(MainFrame properMainFrame) {
        this.properMainFrame = properMainFrame;
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
