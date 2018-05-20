import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EscapeRouteTest {

	////////// CREATE ROUTE TESTS ///////////

	@Test
	void createRouteWhenNoRouteAssignedTest() {
		// The route property is empty
		// Call createRoute
		// Route property is not empty
	}

	@Test
	void checkRouteCreatedProperlyTest() {
		// Check if the entries of the route property are really included in
		// building map, compare with the map property
	}

	@Test
	void checkRouteIsEmptyIfMapIsEmptyTest() {
		// Introduce an empty map to the map property
		// Compute the route and check if it's empty
	}

	@Test
	void checkRouteIsEmptyIfMapIsNotAssignedTest() {
		// Set the map property to null
		// Compute the route and check if it's empty
	}

	@Test
	void checkRouteIsEmptyIfBuildingHasNoMapTest() {
		// Set the building's map property to null
		// Compute the route and check if it's empty
	}

	@Test
	void checkIfTheStartingPositionOnRouteIsCorrectTest() {
		// Get route
		// Compare with user's position
	}

	@Test
	void checkIfTheFinalPositionOnRouteIsExitTest() {
		// Get route
		// Check if the last entry on the route is really an exit
	}

	@Test
	void whatHappensIfAllCapacitiesOnTheMapAreFullTest() {
		// Set the map's capacities to full
		// Try to create path
	}

	@Test
	void capacityIncreasesIfSomeoneAsksForRouteTest() {
		// Observe map capacities
		// Ask for map
		// Check if the capacities have increased
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

	@Test
	void createMapTest() {
		// check if we can create a new map
	}
	
	@Test
	void checkMapExistsTest(){
		// will go around all maps and check if the one we are looking for exists
	}
	
	@Test
	void checkMapTypeTest(){
		// check if the map returned is of type Map
	}
	
	@Test
	void checkEscapeMapTest(){
		// check if escape map contain route to escape
	}

	@Test
	void checkMapEmptyTest(){
		// check if the getMap is empty or not
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
