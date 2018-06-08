package main;

import view.MainFrame;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

                new MainFrame("Escaper");

        });
    }
}





