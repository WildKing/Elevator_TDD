
public class FloorPannel 
{	
	FloorButton upButton,downButton;
	
	public FloorPannel()
	{	
		upButton = new FloorButton();
		downButton = new FloorButton();
	}

	public void pressFloorButtonUp() 
	{
		upButton.ButtonPressed();		
	}
	
	public void pressFloorButtonDown() 
	{
		downButton.ButtonPressed();		
	}

	public FloorButton getUpFloorButton() 
	{
		return upButton;
	}

	public FloorButton getDownFloorButton() {
		// TODO Auto-generated method stub
		return downButton;
	}
	
	
}
