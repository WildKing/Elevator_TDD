
public class FloorButton
{
	boolean state;
	
	public FloorButton()
	{
		state = false;
	}
	
	public void ButtonPressed()
	{
		state = true;
	}

	public boolean getState() 
	{
		return state;
	}
	
}
