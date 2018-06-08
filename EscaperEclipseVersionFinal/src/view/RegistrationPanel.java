package view;

import view.ValidateRegistrationButton;
import view.MainFrame;

import javax.swing.*;
import java.awt.*;

import static view.MainFrame.APPLICATION_HEIGHT;
import static view.MainFrame.APPLICATION_WIDTH;
import static view.BottomNavigationPanel.BOTTOM_PANEL_HEIGHT;

public class RegistrationPanel extends JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final static int LOGIN_PANEL_WIDTH = APPLICATION_WIDTH;
    public final static int LOGIN_PANEL_HEIGHT = APPLICATION_HEIGHT - BOTTOM_PANEL_HEIGHT;
    private MainFrame properMainFrame;
    
    
    public RegistrationPanel(MainFrame properMainFrame, boolean admin) {
        this.properMainFrame = properMainFrame;
        setPreferredSize(new Dimension(LOGIN_PANEL_WIDTH, LOGIN_PANEL_HEIGHT));
        JTextField uname = new JTextField("set username here");
        JTextField pass = new JTextField("set password here");
        JTextField name = new JTextField("input name here");
        JTextField surname = new JTextField("input surname here");

        JLabel textLabel = new JLabel("Enter new user data",SwingConstants.CENTER);
        textLabel.setFont(new Font("Arial", Font.BOLD, 30));
        uname.setPreferredSize(new Dimension(LOGIN_PANEL_WIDTH/2, LOGIN_PANEL_HEIGHT/20));
        uname.setFont(new Font("Arial", Font.ITALIC, 20));
        uname.setHorizontalAlignment(JTextField.CENTER);
        pass.setPreferredSize(new Dimension(LOGIN_PANEL_WIDTH/2, LOGIN_PANEL_HEIGHT/20));
        pass.setHorizontalAlignment(JTextField.CENTER);
        pass.setFont(new Font("Arial", Font.ITALIC, 20));
        name.setPreferredSize(new Dimension(LOGIN_PANEL_WIDTH/2, LOGIN_PANEL_HEIGHT/20));
        name.setFont(new Font("Arial", Font.ITALIC, 20));
        name.setHorizontalAlignment(JTextField.CENTER);
        surname.setPreferredSize(new Dimension(LOGIN_PANEL_WIDTH/2, LOGIN_PANEL_HEIGHT/20));
        surname.setHorizontalAlignment(JTextField.CENTER);
        surname.setFont(new Font("Arial", Font.ITALIC, 20));

        JLabel checkRoleLable = new JLabel();
        checkRoleLable.setLayout(new GridLayout(1,3));
        JCheckBox user = new JCheckBox("user");
        user.setFont(new Font("Arial", Font.ITALIC, 20));
        user.setActionCommand("U");
        user.setSelected(true);
        JCheckBox administrator = new JCheckBox("administrator");
        administrator.setFont(new Font("Arial", Font.ITALIC, 20));
        administrator.setActionCommand("A");
        JCheckBox buildingowner = new JCheckBox("building owner");
        buildingowner.setFont(new Font("Arial", Font.ITALIC, 20));
        buildingowner.setActionCommand("B");
        ButtonGroup bg = new ButtonGroup();
        bg.add(user);
        bg.add(administrator);
        bg.add(buildingowner);
        checkRoleLable.add(user);
        checkRoleLable.add(administrator);
        checkRoleLable.add(buildingowner);

        JButton validateRegistration = new ValidateRegistrationButton(this.properMainFrame,uname,pass,name,surname,bg);


        setLayout(new GridLayout(7,1));
        add(textLabel);
        add(name);
        add(surname);
        add(uname);
        add(pass);
        if (admin == true)
        add(checkRoleLable);
        add(validateRegistration);


    }

}