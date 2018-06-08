package View.Buttons;

import Controller.HomeButtonController;
import View.MainFrame;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import static View.Panels.BottomNavigationPanel.BOTTOM_PANEL_HEIGHT;
import static View.Panels.BottomNavigationPanel.BOTTOM_PANEL_WIDTH;

public class HomeButton extends JButton {
    private MainFrame properMainFrame;

    public HomeButton(MainFrame properMainFrame){
        super();
        this.properMainFrame = properMainFrame;
        setPreferredSize(new Dimension(BOTTOM_PANEL_WIDTH,BOTTOM_PANEL_HEIGHT));
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(this.getClass().getResource("home-icon.png"));
        } catch (IOException e) {
            System.out.println("Can't get to back button picture");
        }
        ImageIcon imageIcon = new ImageIcon(myPicture);
        setIcon(imageIcon);
        setBackground(Color.black);
        HomeButtonController hbc = new HomeButtonController(this.properMainFrame);
        addActionListener(hbc);
    }


}
