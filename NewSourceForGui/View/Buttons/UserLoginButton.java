package View.Buttons;

import Controller.StartButtonController;
import Controller.UserLoginButtonController;
import View.MainFrame;

import javax.swing.*;
import java.awt.*;

import static View.Panels.LoginPanel.LOGIN_PANEL_WIDTH;
import static View.Panels.LoginPanel.LOGIN_PANEL_HEIGHT;

public class UserLoginButton extends JButton {

    private MainFrame properMainFrame;


    public UserLoginButton(MainFrame properMainFrame){
        super();
        this.properMainFrame = properMainFrame;
        setText("User Panel");
        setBackground(Color.GREEN);
        setForeground(Color.white);
        setFont(new Font("Arial", Font.BOLD, 40));
        setPreferredSize(new Dimension(LOGIN_PANEL_WIDTH,LOGIN_PANEL_HEIGHT/3));
        UserLoginButtonController ulbc = new UserLoginButtonController(this.properMainFrame);
        addActionListener(ulbc);

    }
}
