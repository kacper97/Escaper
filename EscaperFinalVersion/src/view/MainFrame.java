package view;

import view.BottomNavigationPanel;
import view.WelcomePanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public final static int APPLICATION_WIDTH = 600;
    public final static int APPLICATION_HEIGHT = 1000;


    public MainFrame(String name){
        super(name);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setSize(APPLICATION_WIDTH,APPLICATION_HEIGHT);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        JPanel bottomNavigationPanel = new BottomNavigationPanel(this);
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
