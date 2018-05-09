
public class EscapeRoute{

Location currentLocation;
Route currentRoute;
Building building;


	public EscapeRoute(Location l, Building b){
		currentLocation = l;
		createRoute();
	}


	private void createRoute(){

		currentRoute = null;

	}

	public Route getRoute(){

		return currentRoute;
	}

	
	public void updateRoute(Location l){
		currentLocation = l;
		createRoute();
	}


	public Map getMap(){
		building.getMap();
	}

}