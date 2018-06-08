package view;

import controller.BuildingOwnerLoginButtonController;
import view.MainFrame;

import javax.swing.*;
import java.awt.*;

import static view.LoginPanel.LOGIN_PANEL_HEIGHT;
import static view.LoginPanel.LOGIN_PANEL_WIDTH;

public class BuildignOwnerLoginButton extends JButton {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MainFrame properMainFrame;


    public BuildignOwnerLoginButton(MainFrame properMainFrame){
        super();
        this.properMainFrame = properMainFrame;
        setText("Building Owner Panel");
        setBackground(Color.RED);
        setFont(new Font("Arial", Font.BOLD, 40));
        setForeground(Color.WHITE);
        setPreferredSize(new Dimension(LOGIN_PANEL_WIDTH,LOGIN_PANEL_HEIGHT/3));
        BuildingOwnerLoginButtonController bowlbc = new BuildingOwnerLoginButtonController(this.properMainFrame);
        addActionListener(bowlbc);


    }
}
