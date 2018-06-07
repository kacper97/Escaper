package model;

import java.util.*;

// Sequence of rooms representing an exit path
public class EscapeRoute {
	private List<Room> route_ = new ArrayList<>();
	public EscapeRoute(RoomWrapper exit) {
		RoomWrapper current = exit;
		while(current.getPreviousRoom() != null) {
			route_.add(current.getRoom());
			current = current.getPreviousRoom();
		}
		route_.add(current.getRoom());
		Collections.reverse(route_);
	}
	
	// When exiting through corridor
	public EscapeRoute(RoomWrapper last, Corridor exit) {
		this(last);
	}
	
	public List<Room> getRoute(){
		return route_;
	}
	
}
