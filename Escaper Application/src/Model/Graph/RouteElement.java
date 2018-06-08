package Model.Graph;

public class RouteElement implements Comparable<RouteElement> {
	private int id_;
	private int capacity_;
	private int fullness_;
	private boolean hasExit_;
	
	public RouteElement(int ID, int capacity, int fullness, boolean hasExit) {
		id_ = ID;
		capacity_ = capacity;
		fullness_ = fullness;
		hasExit_ = hasExit;
	}
	// Creating full/not-usable for escape corridor
	public RouteElement(int ID, int capacity, boolean hasExit) {
		id_ = ID;
		// When capacity_ == fullness_ -> the element cannot be accessed by the user cause it's full has to be avoided
		capacity_ = capacity;
		fullness_ = capacity;
		hasExit_ = hasExit;
	}
	public int getID() {
		return id_;
	}
	
	public boolean hasExit() {
		return hasExit_;
	}
	
	public boolean isFull() {
		return capacity_ <= fullness_;
	}
	
	public void updateFullness(int state) {
		fullness_ = state;
	}
	
	public void increaseFullness() {
		fullness_++;
	}

	@Override
	public int compareTo(RouteElement o) {
		return id_ - o.getID();
	}
}
