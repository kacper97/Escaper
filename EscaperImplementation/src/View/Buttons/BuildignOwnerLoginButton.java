package View.Buttons;

import View.MainFrame;

import javax.swing.*;
import java.awt.*;

import static View.Panels.LoginPanel.LOGIN_PANEL_HEIGHT;
import static View.Panels.LoginPanel.LOGIN_PANEL_WIDTH;

public class BuildignOwnerLoginButton extends JButton {

    private MainFrame properMainFrame;


    public BuildignOwnerLoginButton(MainFrame properMainFrame){
        super();
        this.properMainFrame = properMainFrame;
        setText("B. Owner Log In");
        setBackground(Color.white);
        setFont(new Font("Arial", Font.BOLD, 40));
        setPreferredSize(new Dimension(LOGIN_PANEL_WIDTH,LOGIN_PANEL_HEIGHT/3));


    }
}
