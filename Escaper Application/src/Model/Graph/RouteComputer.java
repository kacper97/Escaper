package Model.Graph;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class RouteComputer {
	private Map map_;
	
	public RouteComputer(Map map) {
		map_ = map;
	}
	
	public EscapeRoute computeRoute(int fromLocation) {
		RoomWrapper currentWrapRoom = null;
		Hashtable<Integer,RoomWrapper> allWrapRooms = new Hashtable<>();
		PriorityQueue<RoomWrapper> candidates = new PriorityQueue<>();
		currentWrapRoom = addAllRoomsAndSetBeginning(fromLocation, candidates, allWrapRooms);
		//Wrongly assigned location
		assert currentWrapRoom != null;
		// Modified Dijkstra routine that does not go through full rooms or corridors
		Corridor exitingCorridor = null;
		while(!currentWrapRoom.getRoom().hasExit()) { // If the room has exit end
			if (candidates.size() == 0) {currentWrapRoom = null; break; }// We can't find a proper escape route. PANIC!!!
			currentWrapRoom = candidates.poll(); // Get the best candidate
			currentWrapRoom.setVisited(); // Mark as visited
			
			// Update fullnesses of the route elements that are used on the path
			currentWrapRoom.getRoom().increaseFullness(); 
			if (currentWrapRoom.getPreviousCorridor() != null) currentWrapRoom.getPreviousCorridor().increaseFullness();
			
			Iterator<Entry<Integer, Corridor>> corridorIterator = currentWrapRoom.getRoom().getCorridors().entrySet().iterator();
			while (corridorIterator.hasNext()) { 
				Corridor corridor = corridorIterator.next().getValue();
				if(corridor.isFull()) continue; // This ensures, that we'll never take into consideration rooms that are connected only by full corridors
				if(corridor.hasExit()) { exitingCorridor = corridor; break; } // We can escape via this corridor -> TODO better to add separate exits to those corridors
				Iterator<Entry<Integer, Room>> neighbourIterator = corridor.getRooms().entrySet().iterator();
				while (neighbourIterator.hasNext()) { // If the corridor is ok look at all neighbours of currentWrapp room and consider adding as candidates
					Room neighbour = neighbourIterator.next().getValue();
					RoomWrapper neighbourWrap = allWrapRooms.get(neighbour.getID());
					if(neighbourWrap.wasVisited()) continue; // The node is closed 
					if(neighbour.isFull()) continue; // Also rooms that are full will not be part of the route
					int distance = currentWrapRoom.getDistance() + corridor.getLength(); // Distance to the candidate via currentRoom
					// If is possible to improve the distance, improve it, if is improved, change the best option to get there
					if(distance < neighbourWrap.getDistance()) { neighbourWrap.setDistance(distance); neighbourWrap.setPrevious(corridor, currentWrapRoom);}		
					candidates.add(neighbourWrap); 
					}
			}
		}
		// TODO What if exitingCorridor = null && currentWrapRoom == null which means that no way out exists 
		// Construct escape route and return it
		 return (exitingCorridor == null) ? new EscapeRoute(currentWrapRoom) : new EscapeRoute(currentWrapRoom,exitingCorridor);
	}
	
	// Returns beginnig
	public RoomWrapper addAllRoomsAndSetBeginning(int fromLocation,PriorityQueue<RoomWrapper> candidates,Hashtable<Integer,RoomWrapper> allWrapRooms) {
		// Add all of the rooms to candidate queue
		RoomWrapper currentWrapRoom = null;
		Iterator<Entry<Integer, Room>> roomIterator = map_.getRooms().entrySet().iterator();
				while (roomIterator.hasNext()) {
					Room room = roomIterator.next().getValue();
					if (room.getID() == fromLocation) {		// Get the starting room and add all rooms in the building in wrapper to hash set to preprocess them before the computation
						currentWrapRoom = new RoomWrapper(room);
						currentWrapRoom.setDistance(0);
						candidates.add(currentWrapRoom);
						currentWrapRoom.setVisited();
						allWrapRooms.put(room.getID(),currentWrapRoom);
					}
					else allWrapRooms.put(room.getID(), new RoomWrapper(room));
				}
		return  currentWrapRoom;	
	}
	
}
