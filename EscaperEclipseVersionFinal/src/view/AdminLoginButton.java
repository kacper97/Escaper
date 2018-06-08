package view;

import controller.AdminLoginButtonController;
import view.MainFrame;

import javax.swing.*;
import java.awt.*;

import static view.LoginPanel.LOGIN_PANEL_HEIGHT;
import static view.LoginPanel.LOGIN_PANEL_WIDTH;

public class AdminLoginButton extends JButton {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
