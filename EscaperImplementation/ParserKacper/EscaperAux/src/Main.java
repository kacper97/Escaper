import java.io.IOException;

import Items.Map;
import Items.MapDrawer;
import Items.RouteComputer;
import read.Parser;

public class Main {
	


	public static void main(String[] args) throws IOException {
		Map map = Parser.getMap();
		//Parser.updateFullnesses();
		MapDrawer drawer = new MapDrawer(map);
		drawer.drawMap();
		//int location = drawer.getIDOfUsersLocation();
		
		// Compute route
		RouteComputer computer = new RouteComputer(map);
		//EscapeRoute bestRoute = computer.computeRoute(location);
		
		// Give the computed route back to the drawer
		
		// Show user the computed route
		
		

	}

}
