package Items;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
public class Map {
	private String name_;
	private Hashtable<Integer,Room> rooms_ = new Hashtable<>();
	
	public Map(String name) {
		name_ = name;
	}

	public Hashtable<Integer,Room> getRooms() {
		return rooms_;
	}

	public void setRooms(Hashtable<Integer,Room> rooms_) {
		this.rooms_ = rooms_;
	}
	
	public String getName() {
		return name_;
	}
	
	// Adding methods behave in the way that when adding and an objects already exists in that structure won't be there added for second time
	// TODO reporting incorrect adding
	
	public void addRoom(Room r) {
		if (rooms_.contains(r) || rooms_.containsKey(r.getID())) return;
		rooms_.put(r.getID(), r);
		return;
	}
	
	public void addCorridorToRoom(Room r, Corridor c) {
		if(r.getCorridors().contains(c) || r.getCorridors().containsKey(c.getID()) || c.getRooms().contains(r)|| c.getRooms().containsKey(r.getID())) {
			return;	
		}
		// Ad symmetrically
		r.getCorridors().put(c.getID(), c);
		c.getRooms().put(r.getID(), r);
		return;
		
	}
	
	public void linkRoomsByCorridor(Room r1, Room r2, Corridor c) {
		addCorridorToRoom(r1,c);
		addCorridorToRoom(r2,c);
	}
}
