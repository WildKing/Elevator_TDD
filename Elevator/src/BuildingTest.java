import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BuildingTest {

	Building bd;
	
	@Before
	public void setUp() throws Exception 
	{
		bd = new Building(10);
	}

	@Test
	public void testBuilding() {
		//fail("Not yet implemented");
		assertEquals(10, bd.getNumberOfFloor());
	}

	@Test
	public void testPressFloorButtonUp() {
		//fail("Not yet implemented");
		bd.pressFloorButtonUp(4);
		assertEquals(true, bd.getfloor(4).getFloorPanel().getUpFloorButton().getState());
	}

	@Test
	public void testPressFloorButtonDown() {
		//fail("Not yet implemented");
	}

	@Test
	public void testGetNumberOfFloor() {
		//fail("Not yet implemented");
	}

	@Test
	public void testPressElevButton() {
		//fail("Not yet implemented");
	}

}
