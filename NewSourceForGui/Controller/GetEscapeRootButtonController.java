package Controller;

import View.MainFrame;
import View.Panels.EscapeRootPanel;
import View.Panels.UserLoginPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetEscapeRootButtonController implements ActionListener {
    private MainFrame properMainFrame;

    public GetEscapeRootButtonController(MainFrame properMainFrame){
        super();
        this.properMainFrame = properMainFrame;

    }

    @Override
    public void actionPerformed(ActionEvent event) {
        JPanel escapeRootPanel = new EscapeRootPanel(this.properMainFrame);
        properMainFrame.setNewPanel(escapeRootPanel);

        //HERE IS ACTION LISTENER FOR A BUTTON WHICH AFTER PRESSING WILL SHOW ESCAPE ROOT



    }


}
