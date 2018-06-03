package View.Panels;

import View.Buttons.ValidateUserLoginButton;
import View.MainFrame;

import javax.swing.*;
import java.awt.*;

import static View.MainFrame.APPLICATION_HEIGHT;
import static View.MainFrame.APPLICATION_WIDTH;
import static View.Panels.BottomNavigationPanel.BOTTOM_PANEL_HEIGHT;

public class BuildingOwnerLoginPanel extends JPanel {

    public final static int LOGIN_PANEL_WIDTH = APPLICATION_WIDTH;
    public final static int LOGIN_PANEL_HEIGHT = APPLICATION_HEIGHT - BOTTOM_PANEL_HEIGHT;
    private MainFrame properMainFrame;


    public BuildingOwnerLoginPanel(MainFrame properMainFrame) {
        this.properMainFrame = properMainFrame;
        setPreferredSize(new Dimension(LOGIN_PANEL_WIDTH, LOGIN_PANEL_HEIGHT));
        JTextField username = new JTextField("input user name here");
        JTextField password = new JPasswordField("input password here");
        JLabel textLabel = new JLabel("Please provide b. owner data below", SwingConstants.CENTER);
        textLabel.setFont(new Font("Arial", Font.BOLD, 30));
        username.setPreferredSize(new Dimension(LOGIN_PANEL_WIDTH / 2, LOGIN_PANEL_HEIGHT / 20));
        password.setPreferredSize(new Dimension(LOGIN_PANEL_WIDTH / 2, LOGIN_PANEL_HEIGHT / 20));
        username.setHorizontalAlignment(JTextField.CENTER);
        password.setHorizontalAlignment(JTextField.CENTER);
        username.setFont(new Font("Arial", Font.ITALIC, 20));
        password.setFont(new Font("Arial", Font.ITALIC, 20));
        JButton login = new ValidateUserLoginButton(this.properMainFrame, username, password, "B");
        setLayout(new GridLayout(7, 1));
        add(textLabel);
        add(username);
        add(password);
        add(login);


    }
}
