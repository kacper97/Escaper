package View.Buttons;

import Controller.AdminLoginButtonController;
import View.MainFrame;

import javax.swing.*;
import java.awt.*;

import static View.Panels.LoginPanel.LOGIN_PANEL_HEIGHT;
import static View.Panels.LoginPanel.LOGIN_PANEL_WIDTH;

public class AdminLoginButton extends JButton {

    private MainFrame properMainFrame;


    public AdminLoginButton(MainFrame properMainFrame){
        super();
        this.properMainFrame = properMainFrame;
        setText("Administration Panel");
        setBackground(Color.BLUE);
        setForeground(Color.white);
        setFont(new Font("Arial", Font.BOLD, 40));
        setPreferredSize(new Dimension(LOGIN_PANEL_WIDTH,LOGIN_PANEL_HEIGHT/3));
        AdminLoginButtonController albc = new AdminLoginButtonController(this.properMainFrame);
        addActionListener(albc);

    }
}
