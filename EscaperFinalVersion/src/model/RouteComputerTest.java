/*
package Model.Graph;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RouteComputerTest {

	@Test 
	void basicFindShortestRouteThreeRoomsThreeCorridorsOneExitTest() {
		Map map = new Map("Test");

		for(int i = 0; i < 5; i++) {
			if(i > 2) map.addRoom(new Room(i+"",null,i,10,0,true));
			else map.addRoom(new Room(i+"",null,i,10,0,false));
		}
		Corridor c1 = new Corridor(1, 5, 10, 0, false);
		Corridor c2 = new Corridor(5, 6, 10, 0, false);
		Corridor c6 = new Corridor(9, 10, 10, 0, false);
		
		// Create graph
		map.linkRoomsByCorridor(map.getRooms().get(0), map.getRooms().get(1), c1);
		map.linkRoomsByCorridor(map.getRooms().get(0), map.getRooms().get(2), c2);
		map.linkRoomsByCorridor(map.getRooms().get(1), map.getRooms().get(3), c6);
		
		RouteComputer computer = new RouteComputer(map);
		EscapeRoute route = computer.computeRoute(0);
		
		// Expected ID sequence of elements 0->5->1->10->3
		List<RouteElement> expected = new ArrayList<>();
		expected.add(map.getRooms().get(0));
		expected.add(map.getRooms().get(1));
		expected.add(map.getRooms().get(3));
		
		Assert.assertArrayEquals(expected.toArray(), route.getRoute().toArray());
	}
	@Test
	void basicFindShortestRouteFiveRoomsSevenCorridorsOneExitTest() {
		Map map = new Map("Test");

		for(int i = 0; i < 5; i++) {
			if(i > 2) map.addRoom(new Room(i+"",null,i,10,0,true));
			else map.addRoom(new Room(i+"",null,i,10,0,false));
		}
		Corridor c1 = new Corridor(1, 5, 10, 0, false);
		Corridor c2 = new Corridor(5, 6, 10, 0, false);
		Corridor c3 = new Corridor(1, 7, 10, 0, false);
		Corridor c4 = new Corridor(1, 8, 10, 0, false);
		Corridor c5 = new Corridor(1, 9, 10, 0, false);
		Corridor c6 = new Corridor(9, 10, 10, 0, false);
		Corridor c7 = new Corridor(1, 11, 10, 0, false);
		
		// Create graph
		map.linkRoomsByCorridor(map.getRooms().get(0), map.getRooms().get(1), c1);
		map.linkRoomsByCorridor(map.getRooms().get(0), map.getRooms().get(2), c2);
		map.linkRoomsByCorridor(map.getRooms().get(1), map.getRooms().get(2), c3);
		map.linkRoomsByCorridor(map.getRooms().get(1), map.getRooms().get(3), c6);
		map.linkRoomsByCorridor(map.getRooms().get(2), map.getRooms().get(3), c4);
		map.linkRoomsByCorridor(map.getRooms().get(2), map.getRooms().get(4), c5);
		map.linkRoomsByCorridor(map.getRooms().get(3), map.getRooms().get(4), c7);
		
		RouteComputer computer = new RouteComputer(map);
		EscapeRoute route = computer.computeRoute(0);
		
		// Expected ID sequence 0->5->1->7->2->8->3
		List<RouteElement> expected = new ArrayList<>();
		expected.add(map.getRooms().get(0));
		expected.add(map.getRooms().get(1));
		expected.add(map.getRooms().get(2));
		expected.add(map.getRooms().get(3));
				
		Assert.assertArrayEquals(expected.toArray(), route.getRoute().toArray());
	}
	
	@Test
	void fullCorridorFindRouteFiveRoomsSevenCorridorsOneExitTest() {
		Map map = new Map("Test");

		for(int i = 0; i < 5; i++) {
			if(i > 2) map.addRoom(new Room(i+"",null,i,10,0,true));
			else map.addRoom(new Room(i+"",null,i,10,0,false));
		}
		Corridor c1 = new Corridor(1, 5, 10, 10, false);
		Corridor c2 = new Corridor(5, 6, 10, 0, false);
		Corridor c3 = new Corridor(1, 7, 10, 0, false);
		Corridor c4 = new Corridor(1, 8, 10, 0, false);
		Corridor c5 = new Corridor(1, 9, 10, 0, false);
		Corridor c6 = new Corridor(9, 10, 10, 0, false);
		Corridor c7 = new Corridor(1, 11, 10, 0, false);
		
		// Create graph
		map.linkRoomsByCorridor(map.getRooms().get(0), map.getRooms().get(1), c1);
		map.linkRoomsByCorridor(map.getRooms().get(0), map.getRooms().get(2), c2);
		map.linkRoomsByCorridor(map.getRooms().get(1), map.getRooms().get(2), c3);
		map.linkRoomsByCorridor(map.getRooms().get(1), map.getRooms().get(3), c6);
		map.linkRoomsByCorridor(map.getRooms().get(2), map.getRooms().get(3), c4);
		map.linkRoomsByCorridor(map.getRooms().get(2), map.getRooms().get(4), c5);
		map.linkRoomsByCorridor(map.getRooms().get(3), map.getRooms().get(4), c7);
		
		RouteComputer computer = new RouteComputer(map);
		EscapeRoute route = computer.computeRoute(0);
		
		// Expected ID sequence 0->6->2->8->3
		List<RouteElement> expected = new ArrayList<>();
		expected.add(map.getRooms().get(0));
		expected.add(map.getRooms().get(2));
		expected.add(map.getRooms().get(3));
				
		Assert.assertArrayEquals(expected.toArray(), route.getRoute().toArray());
	}
	
	
	@Test
	void fullRoomAndFullCorridorFindRouteFiveRoomsSevenCorridorsOneExitTest() {
		Map map = new Map("Test");

		for(int i = 0; i < 5; i++) {
			if(i > 2) map.addRoom(new Room(i+"",null,i,10,0,true));
			else map.addRoom(new Room(i+"",null,i,10,0,false));
		}
		map.getRooms().get(3).updateFullness(10); // Set it full
		Corridor c1 = new Corridor(1, 5, 10, 10, false);
		Corridor c2 = new Corridor(5, 6, 10, 0, false);
		Corridor c3 = new Corridor(1, 7, 10, 0, false);
		Corridor c4 = new Corridor(1, 8, 10, 0, false);
		Corridor c5 = new Corridor(1, 9, 10, 0, false);
		Corridor c6 = new Corridor(9, 10, 10, 0, false);
		Corridor c7 = new Corridor(1, 11, 10, 0, false);
		
		// Create graph
		map.linkRoomsByCorridor(map.getRooms().get(0), map.getRooms().get(1), c1);
		map.linkRoomsByCorridor(map.getRooms().get(0), map.getRooms().get(2), c2);
		map.linkRoomsByCorridor(map.getRooms().get(1), map.getRooms().get(2), c3);
		map.linkRoomsByCorridor(map.getRooms().get(1), map.getRooms().get(3), c6);
		map.linkRoomsByCorridor(map.getRooms().get(2), map.getRooms().get(3), c4);
		map.linkRoomsByCorridor(map.getRooms().get(2), map.getRooms().get(4), c5);
		map.linkRoomsByCorridor(map.getRooms().get(3), map.getRooms().get(4), c7);
		
		RouteComputer computer = new RouteComputer(map);
		EscapeRoute route = computer.computeRoute(0);
		
		// Expected ID sequence 0->6->2->8->3
		List<RouteElement> expected = new ArrayList<>();
		expected.add(map.getRooms().get(0));
		expected.add(map.getRooms().get(2));
		expected.add(map.getRooms().get(4));
				
		Assert.assertArrayEquals(expected.toArray(), route.getRoute().toArray());
	}

}
*/
