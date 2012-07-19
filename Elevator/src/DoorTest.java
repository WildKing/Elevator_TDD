import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DoorTest {

	Door door;
	Elevator e;
	@Before
	public void setUp() throws Exception {
		door = new Door(e);
		
	}

	@Test
	public void testDoor() {
		//fail("Not yet implemented");
		assertEquals(false, door.getState());
	}

	@Test
	public void testOpenDoor() {
		//fail("Not yet implemented");
		door.openDoor();
		assertEquals(true,door.getState());
	}

	@Test
	public void testCloseDoor() {
		//fail("Not yet implemented");
		door.closeDoor();
		assertEquals(false, door.getState());
	}

	@Test
	public void testGetState() {
		//fail("Not yet implemented");
	}

}
