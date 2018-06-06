package Model.Graph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Parser {
	private String mapFileName_; // File that holds representation of a map
	private String situationFileName_; // File that holds current occupation of spaces in a building
	private Scanner mapScanner_;
	private Scanner situationScanner_;
	public Parser(String mapFile, String situationFile) throws FileNotFoundException {
		mapFileName_ = mapFile;
		situationFileName_ = situationFile;
		mapScanner_ = new Scanner(new File(mapFileName_));
		situationScanner_ = new Scanner(new File(situationFileName_));
	}

	public Map getMap() {
		Map parsed = new Map(mapFileName_);
		loadRouteElements(parsed);
		loadConnections(parsed);
		updateFullnesses(parsed); // Load initially fullnesses
		return parsed;
	}

	private void updateFullnesses(Map map) {
		// Structure of file with situation (C || R);id;fullness
		String line;
		while(situationScanner_.hasNextLine()) {
			line = situationScanner_.nextLine();
			String[] parsed = line.split(";");
			RouteElement element = null;
			int id = Integer.parseInt(parsed[1]);
			int fullness = Integer.parseInt(parsed[2]);
			System.out.println(parsed[0]);
			if (parsed[0].equals("R")) element = map.getRooms().get(id);
			else if (parsed[0].equals("C")) element = map.getCorridors().get(id);
			else assert false;
			if (element!=null)
			element.updateFullness(fullness);
		}
	}


	private void loadRouteElements(Map map) {
		String line;
		while(!(line = mapScanner_.nextLine()).equals("Connections")) {
			String[] parsed = line.split(";");
			if (parsed[0].equals("R")) addRoom(parsed, map);
			else if (parsed[0].equals("C")) addCorridor(parsed, map);
			else assert false;
		}
	}

	private void loadConnections(Map map) {
		// Connection line structure L;roomID;corridorID
		String line;
		while(mapScanner_.hasNextLine()) {
			line = mapScanner_.nextLine();
			String[] parsed = line.split(";");
			if (parsed[0].equals("L")) addConnection(map,Integer.parseInt(parsed[1]),(Integer.parseInt(parsed[2])));
			else assert false;
		}
	}

	private void addConnection(Map map, int roomID, int corridorID) {
		map.addCorridorToRoom(map.getRooms().get(roomID), map.getCorridors().get(corridorID));
	}

	private void addRoom(String[] parsed, Map map) {
		// Structure of line representing a room R;ID;name;capacity;hasExit;X;Y
		int ID = Integer.parseInt(parsed[1]);
		String name = parsed[2];
		int capacity = Integer.parseInt(parsed[3]);
		boolean hasExit = (parsed[4].equals("Y")) ? true : false;
		int fullness = 0; // Initially empty
		Coordinates coord = new Coordinates(Integer.parseInt(parsed[5]),Integer.parseInt(parsed[6]));
		map.addRoom(new Room(name,coord,ID,capacity,fullness,hasExit));
	}

	private void addCorridor(String[] parsed, Map map) {
		// Structure of line representing a corridor C;ID;length;capacity;hasExit
		int ID = Integer.parseInt(parsed[1]);
		int fullness = 0;
		int length = Integer.parseInt(parsed[2]);
		int capacity = Integer.parseInt(parsed[3]);
		boolean hasExit = (parsed[4].equals("Y")) ? true : false;
		map.addCorridor(new Corridor(length,ID,capacity,fullness,hasExit));
	}

}