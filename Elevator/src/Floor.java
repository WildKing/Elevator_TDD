
public class Floor 
{
	FloorPannel Fp;
	Door door;
	
	int floorNum;
	
	public Floor(int floorNum)
	{
		this.floorNum = floorNum;
		Fp=new FloorPannel();
	}

	public void pressFloorButtonUp()
	{
		Fp.pressFloorButtonUp();
	}
	
	public void pressFloorButtonDown()
	{
		Fp.pressFloorButtonDown();	
	}

	public int getnumOfFloor() 
	{
		return floorNum;
	}

	public FloorPannel getFloorPanel() 
	{
		return Fp;
	}
	
}
