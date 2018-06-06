package Model.Graph;


import java.io.FileNotFoundException;

public class MainMap {

    public static String file1 = "database2.txt";
    public static String file2 = "database3.txt";

    public void showMap() {

        Parser parser = null; // TODO load from GUI
        try {
            parser = new Parser(this.file1,this.file2);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Map map = parser.getMap();
        // Draw it out and wait for users' selection then provide computed route
        MapDrawer drawer = new MapDrawer(map);
        drawer.drawMap();
    }

}
