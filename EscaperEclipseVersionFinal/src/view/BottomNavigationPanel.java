package view;

import view.HomeButton;
import view.MainFrame;

import javax.swing.*;

import java.awt.*;

import static view.MainFrame.APPLICATION_HEIGHT;
import static view.MainFrame.APPLICATION_WIDTH;

public class BottomNavigationPanel extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final static int BOTTOM_PANEL_WIDTH = APPLICATION_WIDTH;
    public final static int BOTTOM_PANEL_HEIGHT = APPLICATION_HEIGHT/15;
    private MainFrame properMainFrame;

    public BottomNavigationPanel(MainFrame mainFrame){
        this.properMainFrame = mainFrame;
        setPreferredSize(new Dimension(BOTTOM_PANEL_WIDTH,BOTTOM_PANEL_HEIGHT));
        setBackground(Color.BLACK);
        setLayout(new BorderLayout());

        JButton homeButton = new HomeButton(this.properMainFrame);
        add(homeButton,BorderLayout.CENTER);
    }

}
