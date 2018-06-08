package View.Panels;

import View.Buttons.BackButton;
import View.Buttons.HomeButton;
import View.MainFrame;

import javax.swing.*;

import java.awt.*;

import static View.MainFrame.APPLICATION_HEIGHT;
import static View.MainFrame.APPLICATION_WIDTH;

public class BottomNavigationPanel extends JPanel {
    public final static int BOTTOM_PANEL_WIDTH = APPLICATION_WIDTH;
    public final static int BOTTOM_PANEL_HEIGHT = APPLICATION_HEIGHT/15;
    private MainFrame properMainFrame;

    public BottomNavigationPanel(MainFrame mainFrame){
        this.properMainFrame = mainFrame;
        setPreferredSize(new Dimension(BOTTOM_PANEL_WIDTH,BOTTOM_PANEL_HEIGHT));
        setBackground(Color.BLACK);
        setLayout(new BorderLayout());

        //JButton backButton = new BackButton();
        JButton homeButton = new HomeButton(this.properMainFrame);
        //add(backButton, BorderLayout.EAST);
        add(homeButton,BorderLayout.CENTER);
    }

}
