package View.Buttons;

import Controller.GetEscapeRootButtonController;
import Controller.StartButtonController;
import View.MainFrame;

import javax.swing.*;
import java.awt.*;

import static View.Panels.WelcomePanel.WELCOME_PANEL_HEIGHT;
import static View.Panels.WelcomePanel.WELCOME_PANEL_WIDTH;

public class GetEscapeRootButton extends JButton {
    private MainFrame properMainFrame;


    public GetEscapeRootButton(MainFrame properMainFrame) {
        super();
        this.properMainFrame = properMainFrame;
        setText("Get Escape Root");
        setBackground(Color.GREEN);
        setFont(new Font("Arial", Font.BOLD, 30));
        setPreferredSize(new Dimension(WELCOME_PANEL_WIDTH, WELCOME_PANEL_HEIGHT / 8));
        GetEscapeRootButtonController gerbc = new GetEscapeRootButtonController(this.properMainFrame);
        addActionListener(gerbc);
    }
}
