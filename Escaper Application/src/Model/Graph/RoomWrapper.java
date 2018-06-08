package Model.Graph;


public class RoomWrapper implements Comparable<RoomWrapper> {
	private Room room_;
	private int distance_ = Integer.MAX_VALUE; 
	private RoomWrapper previousRoom_ = null;
	private Corridor previousCorridor_ = null;
	private boolean wasVisited_ = false; // If it has been examined/chosen by the algorithm already
	
	public RoomWrapper(Room room) {
		room_ = room;
	}

	@Override
	public int compareTo(RoomWrapper o) {
		if (distance_ == o.distance_) return room_.getID() - o.getRoom().getID(); // Not to be considered the same objects
		return Integer.compare(distance_, o.getDistance());
	}
	
	public Room getRoom() {
		return room_;
	}
	
	public int getDistance() {
		return distance_;
	}
	
	public void setDistance(int distance) {
		distance_ = distance;
	}
	
	public void setVisited() {
		wasVisited_ = true;
	}
	
	public boolean wasVisited() {
		return wasVisited_;
	}
	
	public void setPrevious(Corridor c, RoomWrapper r) {
		previousCorridor_ = c;
		previousRoom_ = r;
	}
	
	public Corridor getPreviousCorridor() {
		return previousCorridor_;
	}
	
	public RoomWrapper getPreviousRoom() {
		return previousRoom_;
	}
}
