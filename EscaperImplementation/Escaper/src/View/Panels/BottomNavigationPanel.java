package View.Panels;

import View.Buttons.BackButton;
import View.Buttons.HomeButton;

import javax.swing.*;

import java.awt.*;

import static View.MainFrame.APPLICATION_HEIGHT;
import static View.MainFrame.APPLICATION_WIDTH;

public class BottomNavigationPanel extends JPanel {
    public final static int BOTTOM_PANEL_WIDTH = APPLICATION_WIDTH;
    public final static int BOTTOM_PANEL_HEIGHT = APPLICATION_HEIGHT/15;

    public BottomNavigationPanel(){
        setPreferredSize(new Dimension(BOTTOM_PANEL_WIDTH,BOTTOM_PANEL_HEIGHT));
        setBackground(Color.BLACK);
        setLayout(new BorderLayout());

        JButton backButton = new BackButton();
        JButton homeButton = new HomeButton();
        add(backButton, BorderLayout.EAST);
        add(homeButton,BorderLayout.WEST);
    }

}
