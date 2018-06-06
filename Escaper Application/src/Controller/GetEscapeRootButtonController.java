package Controller;

import Model.Graph.MainMap;
import View.MainFrame;
import View.Panels.EscapeRootPanel;

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

        MainMap mainMap = new MainMap();
        mainMap.showMap();


        //HERE IS ACTION LISTENER FOR A BUTTON WHICH AFTER PRESSING WILL SHOW ESCAPE ROOT



    }


}
