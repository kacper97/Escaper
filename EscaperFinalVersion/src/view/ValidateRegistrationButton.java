package view;

import controller.ValidateRegistrationButtonController;
import view.MainFrame;

import javax.swing.*;
import java.awt.*;

public class ValidateRegistrationButton extends JButton {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MainFrame properMainFrame;
    private JTextField username;
    private JTextField password;
    private JTextField name;
    private JTextField surename;
    private ButtonGroup role;

    public ValidateRegistrationButton(MainFrame properMainFrame, JTextField username, JTextField password, JTextField name, JTextField surename, ButtonGroup role){
        super();
        this.properMainFrame = properMainFrame;
        this.username = username;
        this.password = password;
        this.role = role;
        this.name = name;
        this.surename = surename;
        setText("Sign up");
        setBackground(Color.ORANGE);
        setFont(new Font("Arial", Font.BOLD, 40));

        ValidateRegistrationButtonController vrbc = new ValidateRegistrationButtonController(this.properMainFrame,this.username,this.password, this.name, this.surename, this.role);
        addActionListener(vrbc);

    }
}
