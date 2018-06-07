package model;


import java.io.FileNotFoundException;

public class MainMap {

    public static String file1 = "Databases\\proper1.txt";
    public static String file2 = "Databases\\proper2.txt";

    public void showMap() {

        Parser parser = null; // TODO load from GUI
        try {
            parser = new Parser(MainMap.file1,MainMap.file2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Map map = parser.getMap();
        // Draw it out and wait for users' selection then provide computed route
        MapDrawer drawer = new MapDrawer(map);
        drawer.drawMap();
    }

}
