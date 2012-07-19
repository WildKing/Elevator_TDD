import java.util.ArrayList;


public class Building 
{	
	Elevator elev;
	ArrayList<Floor> floors = new ArrayList<Floor>();
	int totalFloor;
	
	public Building(int numOfFloor)
	{
		totalFloor = numOfFloor;
		addFloorToBuilding(numOfFloor);
		elev = new Elevator(this);
	}

	private void addFloorToBuilding(int numOfFloor) 
	{
		for(int i=0; i<numOfFloor; i++)
		{
			floors.add(new Floor(i+1));
		}
	}

	public void pressFloorButtonUp(int i) 
	{
		floors.get(i).pressFloorButtonUp();
		elev.goToFloor(i);
	}
	
	public void pressFloorButtonDown(int i) 
	{
		floors.get(i).pressFloorButtonDown();
	}

	public int getNumberOfFloor() 
	{
		return totalFloor;
	}

	public void pressElevButton(int i) 
	{
		elev.pressButton(i);
		elev.goToFloor(i);
	}

	public Floor getfloor(int i) 
	{
		return floors.get(i);
	}
}
