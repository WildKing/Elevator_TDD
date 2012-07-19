import static org.junit.Assert.*;

import org.junit.Test;


public class FloorTest {

	@Test
	public void testFloor() {
		//fail("Not yet implemented");
		Floor floor = new Floor(10);
		assertEquals(10, floor.getnumOfFloor());
	}

	@Test
	public void testPressFloorButtonUp() {
		//fail("Not yet implemented");
		Floor floor = new Floor(10);
		floor.pressFloorButtonUp();
		assertEquals(true,floor.getFloorPanel().getUpFloorButton().getState());
		
	}

	@Test
	public void testPressFloorButtonDown() {
		//fail("Not yet implemented");
		Floor floor = new Floor(4);
		floor.pressFloorButtonDown();
		assertEquals(true,floor.getFloorPanel().getDownFloorButton().getState());
	}

	@Test
	public void testGetnumOfFloor() {
		//fail("Not yet implemented");
	}

}
