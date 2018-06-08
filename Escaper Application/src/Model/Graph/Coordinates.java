package Model.Graph;


public class Coordinates {
	int x;
	int y;
	
	public Coordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
	public synchronized int getX() {
		return x;
	}

	public synchronized void setX(int x) {
		this.x = x;
	}

	public synchronized int getY() {
		return y;
	}

	public synchronized void setY(int y) {
		this.y = y;
	}
}
