package View.Buttons;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import static View.Panels.BottomNavigationPanel.BOTTOM_PANEL_HEIGHT;
import static View.Panels.BottomNavigationPanel.BOTTOM_PANEL_WIDTH;

public class BackButton extends JButton {

    public BackButton(){
        super();
        setPreferredSize(new Dimension(BOTTOM_PANEL_WIDTH/2-5,BOTTOM_PANEL_HEIGHT));
        BufferedImage myPicture = null;
        try {
            myPicture = ImageIO.read(this.getClass().getResource("back-icon.png"));
        } catch (IOException e) {
            System.out.println("Can't get to back button picture");
        }
        ImageIcon imageIcon = new ImageIcon(myPicture);
        setIcon(imageIcon);
        setBackground(Color.black);
    }

    public void setActionListerer(){

    }
}
