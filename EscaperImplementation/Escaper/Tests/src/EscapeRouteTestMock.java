import static org.mockito.Mockito.*;

class RouteComputerTestMock {

	
	RouteComputer route = new RouteComputer(location, building);
	
        
	@Test 
	public void createRouteWhenNoRouteAssignedTest() {
		// The route property is empty
		// Call createRoute
		// Route property is not empty
		RouteComputer route = mock(RouteComputer.class);
		when(route.getRoute()).thenReturn(true);
		route.createRoute();
		verify(route.getRoute() != null);
	
	}
	
	@Test
	public void checkRouteIsEmptyIfMapIsEmptyTest() {
		// Introduce an empty map to the map property
		// Compute the route and check if it's empty
		RouteComputer route = mock(RouteComputer.class);
		when(route.getMap()).thenReturn(false);
		route.getBuilding().setMap() = new Map();
		route.updateRoute();
		verify(route.getMap() == null);
		
	}
	
	@Test
	public void checkRouteIsEmptyIfMapIsNotAssignedTest() {
		// Set the map property to null
		// Compute the route and check if it's empty
		RouteComputer route = mock(RouteComputer.class);
		when(route.getRoute()).thenReturn(false);
		route.getBuilding().setMap() = null;
		route.updateRoute();
		verify(route.getRoute() == null);
	}
	
	
	@Test
	public void checkRouteIsEmptyIfBuildingHasNoMapTest() {
		// Set the building's map property to null
		// Compute the route and check if it's empty
		RouteComputer route = mock(RouteComputer.class);
		when(route.getRoute()).thenReturn(false);
		route.setBuilding() = null;
		route.updateRoute();
		verify(route.getRoute() == null);
	}
	
	@Test
	public void checkIfTheStartingPositionOnRouteIsCorrectTest() {
		// Get route
		// Compare with user's position
		RouteComputer route = mock(RouteComputer.class);
		when(route.getstartingPoint() == user.getPosition()).thenReturn(true);
		auto user;
		Facade facade = new Facade(user);
		auto route = facade.getRoute();
		verify(route.getstartingPoint() == user.getPosition());
	}
	
	@Test
	public void checkIfTheFinalPositionOnRouteIsExitTest() {
		// Get route
		// Check if the last entry on the route is really an exit
		RouteComputer route = mock(RouteComputer.class);
		when(route.getEndPoint() == Exit).thenReturn(true);
		verify(route.getEndPoint() == Exit);
	}
	
	@Test
        public void getRouteReturnsCurrentRoute() {
	RouteComputer route = mock(RouteComputer.class);
	when(escapeRoute.getRoute() == route).thenReturn(true);
	escapeRoute = new EscapeRoute(l, b);
	escapeRoute.currentRoute = route;
	verify(escapeRoute.getRoute() == route);
	}
		
	
}
