package view;

import view.StartButton;
import view.MainFrame;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import static view.MainFrame.APPLICATION_HEIGHT;
import static view.MainFrame.APPLICATION_WIDTH;
import static view.BottomNavigationPanel.BOTTOM_PANEL_HEIGHT;

public class WelcomePanel extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final static int WELCOME_PANEL_WIDTH = APPLICATION_WIDTH;
    public final static int WELCOME_PANEL_HEIGHT = APPLICATION_HEIGHT - BOTTOM_PANEL_HEIGHT;
    private MainFrame properMainFrame;


    public WelcomePanel(MainFrame properMainFrame){
        this.properMainFrame = properMainFrame;
        BufferedImage myPicture = null;
        try {
           myPicture = ImageIO.read(this.getClass().getResource("_Image_EmergencyExit.jpg"));
        } catch (IOException e) {
            System.out.println("Can't get to welcome panel picture");
        }
        ImageIcon imageIcon = new ImageIcon(myPicture) ;
        JLabel picLabel = new JLabel(imageIcon);
        picLabel.setIcon(imageIcon);
        picLabel.setPreferredSize(new Dimension(WELCOME_PANEL_WIDTH,WELCOME_PANEL_HEIGHT));
        setLayout(new BorderLayout());
        JButton welcomeButton = new StartButton(this.properMainFrame);

        add(picLabel, BorderLayout.CENTER);
        add(welcomeButton, BorderLayout.SOUTH);
        setBackground(Color.white);

        //setPreferredSize(new Dimension(WELCOME_PANEL_WIDTH,WELCOME_PANEL_HEIGHT));
    }
}
