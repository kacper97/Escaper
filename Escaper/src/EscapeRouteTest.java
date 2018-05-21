import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EscapeRouteTest {
	////////// CREATE ROUTE TESTS ///////////

	@Test
	void createRouteWhenNoRouteAssignedTest() {
		// The route property is empty
		if (route.hasAssignedRoute()) {
			// Call createRoute
			route.createRoute();
			// Route property is not empty
			assertFalse(route.isEmpty());
		}
	}

	@Test
	void checkRouteCreatedProperlyTest() {
		// Check if the entries of the route property are really included in building map, compare with the map property
		auto map = route.getBuilding().getMap(); 
		for (auto routeElement : route.getRoute()) {
			assertTrue(map.containsElements(routeElement));
		}
	}

	@Test
	void checkRouteIsEmptyIfMapIsEmptyTest() {
		// Introduce an empty map to the map property
		route.getBuilding().setMap() = new Map(); // Constructor should create an empty map
		assertTrue(route.getMap().isEmpty());
		// Compute the route and check if it's empty
		route.updateRoute();
		assertTrue(route.isEmpty());
	}

	@Test
	void checkRouteIsEmptyIfMapIsNotAssignedTest() {
		// Set the map property to null
		route.getBuilding().setMap() = null;
		// Compute the route and check if it's empty
		route.updateRoute();
		assertTrue(route.isEmpty());
	}

	@Test
	void checkRouteIsEmptyIfBuildingHasNoMapTest() {
		// Set the building's map property to null 
		route.setBuilding() = null;
		// Compute the route and check if it's empty
		route.updateRoute();
		assertTrue(route.isEmpty());
	}

	@Test
	void checkIfTheStartingPositionOnRouteIsCorrectTest() {
		// Get route
		auto user; // TODO should have a position
		Facade facade = new Facade(user);
		auto route = facade.getRoute(); // TODO This should call update route
		// Compare with user's position
		assertEqual(route.getStartingPoint(),user.getPosition());
	}

	@Test
	void checkIfTheFinalPositionOnRouteIsExitTest() {		
		// Check if the last entry on the route is really an exit
		assertTrue(route.getEndPoint().isExit());
	}

	@Test
	void routeIsEmptyIfAllCapacitiesOnTheMapAreFullTest() {
		Map map;
		for (auto re : map.getRouteElements()) {
			re.setUsedCapacity(re.getCapacity());
		}
		route.getBuilding().setMap() = map;
		route.updateRoute();
		assertTrue(route.isEmpty());
		// Try to create path
	}
	/////// END OF CREATE ROUTE TESTS ////////

	////////// GET ROUTE TESTS ///////////
	@Test
	void getRouteReturnsCurrentRoute() {
		escapeRoute = new EscapeRoute(l, b);
		escapeRoute.currentRoute = route;
		assertEquals(escapeRoute.getRoute(), route);
	}
	/////// END OF GET ROUTE TESTS ///////

	////////// GET MAP TESTS ///////////

	@Test(expected = IOException.class)
	void createMapTest() throws IOException {
		// check if we can create a new map object
		EscapeRoute escape = new EscapeRoute(location, building);
		Map map = new Map();
		escape.getMap();
	}

	@Test
	void checkMapExistsTest() {
		// will check if the Map class exists
		try {
			Class.forName("org.package.Map");
		} catch (ClassNotFoundException e) {
			Assert.fail("should have a class called Map");
		}
	}

	@Test
	void checkMapTypeTest() {
		// check if the map returned is of type Map
		EscapeRoute escape = new EscapeRoute(location, building);
		Map map = new Map();
		assertThat(escape.getMap(), instanceOf(Map.class));
	}


	@Test
	void checkMapEmptyTest() throws NullPointerException{
		// check if the getMap is empty or not
		Map emptyMap = new Map();
		assertFalse(emptyMap.isEmpty());
		
	}

	/////// END OF GET MAP TESTS ///////

	@Test
	void testObject() {
		fail("Not yet implemented");
	}

	@Test
	void testGetClass() {
		fail("Not yet implemented");
	}

	@Test
	void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	void testEquals() {
		fail("Not yet implemented");
	}

	@Test
	void testClone() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testNotify() {
		fail("Not yet implemented");
	}

	@Test
	void testNotifyAll() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLong() {
		fail("Not yet implemented");
	}

	@Test
	void testWaitLongInt() {
		fail("Not yet implemented");
	}

	@Test
	void testWait() {
		fail("Not yet implemented");
	}

	@Test
	void testFinalize() {
		fail("Not yet implemented");
	}

	@Before

	@Test
	void whenUpdatingRouteWithDifferentLocationRouteChanges() {
		Location l = new Location();
		Building b = new Building();
		Route r = new Route();

		EscapeRoute escapeRoute = new EscapeRoute(l, b);

		r = escapeRoute.getRoute();
		escapeRoute.updateRoute(l);

	}

}
