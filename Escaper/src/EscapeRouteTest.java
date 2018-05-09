import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EscapeRouteTest {

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
		
		EscapeRoute escapeRoute = new EscapeRoute(l,b);
		
		r = escapeRoute.getRoute();
		escapeRoute.updateRoute(l);
		
		
	}
	

}
