package View.Buttons;

import Controller.UserLoginButtonController;
import Controller.ValidateUserLoginController;
import View.MainFrame;

import javax.swing.*;
import java.awt.*;

import static View.Panels.LoginPanel.LOGIN_PANEL_HEIGHT;
import static View.Panels.LoginPanel.LOGIN_PANEL_WIDTH;

public class ValidateUserLoginButton extends JButton {

    private MainFrame properMainFrame;
    private JTextField username;
    private JTextField password;


    public ValidateUserLoginButton(MainFrame properMainFrame, JTextField username, JTextField password){
        super();
        this.properMainFrame = properMainFrame;
        this.username = username;
        this.password = password;
        setText("Log In");
        setBackground(Color.green);
        setFont(new Font("Arial", Font.BOLD, 40));

        ValidateUserLoginController vulc = new ValidateUserLoginController(this.properMainFrame,this.username,this.password);
        addActionListener(vulc);

    }
}
