package view;

import view.MainFrame;

import javax.swing.*;
import java.awt.*;

import static view.MainFrame.APPLICATION_HEIGHT;
import static view.MainFrame.APPLICATION_WIDTH;
import static view.BottomNavigationPanel.BOTTOM_PANEL_HEIGHT;

public class EscapeRootPanel extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final static int LOGIN_PANEL_WIDTH = APPLICATION_WIDTH;
    public final static int LOGIN_PANEL_HEIGHT = APPLICATION_HEIGHT - BOTTOM_PANEL_HEIGHT;
    

    public EscapeRootPanel(MainFrame properMainFrame) {

       //HERE IS PANEL TO VISUALISE ESCAPE ROOT ON GRAPH

        setPreferredSize(new Dimension(LOGIN_PANEL_WIDTH, LOGIN_PANEL_HEIGHT));
        setBackground(Color.BLACK);
    }
}
