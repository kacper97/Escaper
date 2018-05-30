package View;

import View.Panels.BottomNavigationPanel;
import View.Panels.WelcomePanel;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class MainFrame extends JFrame {
    public final static int APPLICATION_WIDTH = 600;
    public final static int APPLICATION_HEIGHT = 1000;


    public MainFrame(String name){
        super(name);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(APPLICATION_WIDTH,APPLICATION_HEIGHT);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        JPanel bottomNavigationPanel = new BottomNavigationPanel();
        add(bottomNavigationPanel,BorderLayout.SOUTH);
        JPanel welcomePanel = new WelcomePanel(this);
        add(welcomePanel,BorderLayout.CENTER);

    }

    public void setNewPanel(JPanel panel){
        getContentPane().remove(1);
        add(panel,BorderLayout.CENTER);
        revalidate();
        repaint();
    }
}
