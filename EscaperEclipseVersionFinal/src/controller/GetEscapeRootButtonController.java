package controller;

import model.MainMap;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GetEscapeRootButtonController implements ActionListener {

    public GetEscapeRootButtonController(){
        super();

    }

    @Override
    public void actionPerformed(ActionEvent event) {

        MainMap mainMap = new MainMap();
        mainMap.showMap();




    }


}
