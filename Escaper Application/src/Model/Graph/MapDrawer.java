package Model.Graph;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.view.mxGraph;

public class MapDrawer {
	
	private JFrame frame;
	private Map map;
	private mxGraph graph = null;
	public static String imageName;
	
	
	public MapDrawer(Map m){
		map = m; 
	    frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setSize(600, 1000);
		frame.setPreferredSize(new Dimension(600, 1000));
		frame.setResizable(false);
		
	}
	
	public void updateMap(Map m) {
		map = m;
		frame.getContentPane().remove(1);
		drawMap();
	}
	
	
	public void drawMap() {
		graph = new mxGraph();
		Object parent = graph.getDefaultParent();
		
		Iterator<Entry<Integer, Room>> roomIterator = map.getRooms().entrySet().iterator();
		Iterator<Entry<Integer, Room>> roomIterator2 = map.getRooms().entrySet().iterator();
		
		graph.getModel().beginUpdate();
		try {
			
			Hashtable<Integer,Object> rooms = new Hashtable<>();
			
			//createVertices
			while (roomIterator.hasNext()) {
				Room room = roomIterator.next().getValue();
				
				Object o = graph.insertVertex(parent, null, room.getName()+";"+room.getID(), 
						room.getCoordinates().getX(), room.getCoordinates().getY(), 20, 20);
				
				rooms.put(room.getID(), o);
			}
			
			
			//CreateEdges
			
			while (roomIterator2.hasNext()) {
				Room room = roomIterator2.next().getValue();
				Iterator<Entry<Integer, Corridor>> corridorIterator = room.getCorridors().entrySet().iterator();
				
				while (corridorIterator.hasNext()) {
					Corridor corridor = corridorIterator.next().getValue();
					Iterator<Entry<Integer, Room>> neighbourIterator = corridor.getRooms().entrySet().iterator();
					
					while (neighbourIterator.hasNext()) {
						Room neighbour = neighbourIterator.next().getValue();
						
						if (room.getID() != neighbour.getID()) {
							
							graph.insertEdge(parent, null, "", rooms.get(room.getID()), rooms.get(neighbour.getID()));
						}		
					}		
				}	
			}
			
		} finally {
			graph.getModel().endUpdate();
		}
		
		
		mxGraphComponent graphComponent = new mxGraphComponent(graph);
		graphComponent.getViewport().setOpaque(true);
		graphComponent.setBackgroundImage(new ImageIcon(imageName));
		
		// Mouse listener
		graphComponent.getGraphControl().addMouseListener(new MouseAdapter()
		{
			public void mouseReleased(MouseEvent e)
			{
				Object cell = graphComponent.getCellAt(e.getX(), e.getY());
				
				//Get id
				if (cell != null)
				{
					try {
					RouteComputer computer = new RouteComputer(map);
					int id = getIDFromLabel(graph.getLabel(cell));
					EscapeRoute escapeRoute = computer.computeRoute(id);
					drawRoute(escapeRoute);
					
					System.out.println(escapeRoute.getRoute());
					} catch(Exception ex) {}
				}
			}
		});
		
		
		frame.getContentPane().add(graphComponent);
		frame.revalidate();
		frame.repaint();
		frame.setVisible(true);
		

	}
	private void drawRoute(EscapeRoute route) {
		// TODO replace graph showing map with one showing only the route
		graph = new mxGraph();
		Object parent = graph.getDefaultParent();
		Room currentRoom = route.getRoute().get(0);
		
		graph.getModel().beginUpdate(); //This is necessary for adding things to the graph
		try {
			Object previousRoomNode = graph.insertVertex(parent, null, currentRoom.getName()+";"+currentRoom.getID(), 
						currentRoom.getCoordinates().getX(), currentRoom.getCoordinates().getY(), 20, 20);
			
			for(int i = 1; i < route.getRoute().size(); i++) {
				currentRoom = route.getRoute().get(i);
				Object currentRoomNode = graph.insertVertex(parent, null, currentRoom.getName()+";"+currentRoom.getID(), 
							currentRoom.getCoordinates().getX(), currentRoom.getCoordinates().getY(), 20, 20);
				// Link two following room by an edge
				graph.insertEdge(parent, null, " ", previousRoomNode, currentRoomNode);
				previousRoomNode = currentRoomNode;
			}

			
		} finally {
			graph.getModel().endUpdate();
		}
		
		mxGraphComponent graphComponent = new mxGraphComponent(graph);
		graphComponent.getViewport().setOpaque(true);
		graphComponent.setBackgroundImage(new ImageIcon("resources/plan.png"));

		frame.getContentPane().remove(0);
		frame.getContentPane().add(graphComponent);
		frame.revalidate();
		frame.repaint();
	}
	private int getIDFromLabel(String labelText) {
		String[] parsed = labelText.split(";");
		return Integer.parseInt(parsed[1]);
	}
		
	
	
	//---------TESTING--------------------------
	public static void main(String[] args) {
		
		
		
		//-----test map------
		Map testMap = new Map("Test");

		
		testMap.addRoom(new Room("Room1", new Coordinates(10, 10), 1, 10, 0, false));
		testMap.addRoom(new Room("Room2", new Coordinates(100, 30), 2, 10, 0, false));
		testMap.addRoom(new Room("Room3", new Coordinates(50, 50), 3, 10, 0, true));
		
		Corridor c1 = new Corridor(1, 5, 10, 0, false);
		Corridor c2 = new Corridor(1, 6, 10, 0, false);

		
		testMap.linkRoomsByCorridor(testMap.getRooms().get(1), testMap.getRooms().get(2), c1);
		testMap.linkRoomsByCorridor(testMap.getRooms().get(2), testMap.getRooms().get(3), c2);
		testMap.linkRoomsByCorridor(testMap.getRooms().get(1), testMap.getRooms().get(3), c2);
		
		//-----test map------
		
		
		
		//Call to drawMap()
		
		MapDrawer drawer = new MapDrawer(testMap);
		drawer.drawMap();
		
	}
	
	//---------TESTING----------
}
