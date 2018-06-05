package Items;
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
	
	
	
	public MapDrawer(Map m){
		map = m; 
	    frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		
	}
	
	public void updateMap(Map m) {
		map = m;
		drawMap();
	}
	
	public void drawMap() {	
		mxGraph graph = new mxGraph();
		Object parent = graph.getDefaultParent();
		
		Iterator<Entry<Integer, Room>> roomIterator = map.getRooms().entrySet().iterator();
		
		
		graph.getModel().beginUpdate();
		try {
			
			Hashtable<Integer,Object> rooms = new Hashtable<>();
			
			//createVertices
			while (roomIterator.hasNext()) {
				Room room = roomIterator.next().getValue();
				
				Object o = graph.insertVertex(parent, null, room.getName(), 
						room.getCoordinates().getX(), room.getCoordinates().getY(), 20, 20);
				
				rooms.put(room.getID(), o);
			}
			
			//CreateEdges
			

//			Object e1 = graph.insertEdge(parent, null, "", v1, v2);
//			Object e2 = graph.insertEdge(parent, null, "", v1, v2);
//			Object e3 = graph.insertEdge(parent, null, "", v1, v1);
		} finally {
			graph.getModel().endUpdate();
		}
		
		
		mxGraphComponent graphComponent = new mxGraphComponent(graph);
		graphComponent.getViewport().setOpaque(true);
		graphComponent.setBackgroundImage(new ImageIcon("resources/plan.png"));
		
		frame.getContentPane().add(graphComponent);
		frame.setVisible(true);
		
	}
	

//	
//	int getIDOfUsersLocation() {
//		
//		return -1;
//	}
	
	
	
	//---------TESTING--------------------------
	public static void main(String[] args) {
		
		
		
		//-----test map------
		Map testMap = new Map("Test");

		
		testMap.addRoom(new Room("Room1", new Coordinates(10, 10), 1, 10, 0, true));
		testMap.addRoom(new Room("Room2", new Coordinates(30, 30), 2, 10, 0, true));
		testMap.addRoom(new Room("Room3", new Coordinates(50, 50), 3, 10, 0, true));
		
		Corridor c1 = new Corridor(1, 5, 10, 0, false);
		Corridor c2 = new Corridor(1, 6, 10, 0, false);

		
		testMap.linkRoomsByCorridor(testMap.getRooms().get(1), testMap.getRooms().get(2), c1);
		testMap.linkRoomsByCorridor(testMap.getRooms().get(2), testMap.getRooms().get(3), c2);
		
		//-----test map------
		
		
		
		//Call to drawMap()
		
		MapDrawer drawer = new MapDrawer(testMap);
		drawer.drawMap();
		
		
		
		
		
		
	
		
		
//		System.out.println("repaint");
//		frame.getContentPane().remove(0);
//		frame.getContentPane().add(graphComponent2);
//		frame.setVisible(true);
//		frame.revalidate();
//		frame.repaint();
		
		
		
		
		
	}
	
	//---------TESTING----------
}
