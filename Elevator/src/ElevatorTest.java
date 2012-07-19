import static org.junit.Assert.*;

import org.junit.Test;


public class ElevatorTest {
	
	Building building = new Building(10);
	@Test
	public void testElevator() {
		//fail("Not yet implemented");
		Elevator elev = new Elevator(building);
		assertEquals(0,elev.getElevPosition());
	}

	@Test
	public void testGetElevPosition() {
		//fail("Not yet implemented");
		//Elevator elev = new Elevator(building);
	}

	@Test
	public void testGoToFloor() {
		//fail("Not yet implemented");
		Elevator elev = new Elevator(building);
		elev.goToFloor(2);
		assertEquals(2,elev.getElevPosition());
		elev.goToFloor(5);
		assertEquals(5,elev.getElevPosition());
	}

	@Test
	public void testPressButton() {
		//fail("Not yet implemented");
	}

}
