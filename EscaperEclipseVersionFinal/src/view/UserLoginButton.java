package view;

import controller.UserLoginButtonController;
import view.MainFrame;

import javax.swing.*;
import java.awt.*;

import static view.LoginPanel.LOGIN_PANEL_WIDTH;
import static view.LoginPanel.LOGIN_PANEL_HEIGHT;

public class UserLoginButton extends JButton {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
