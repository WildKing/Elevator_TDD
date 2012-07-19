
public class Door 
{
	Elevator e;
	boolean state;
		
	public Door(Elevator e)
	{
		this.e = e;
		state = false;			//Initially it is Closed 
	}
	
	public void openDoor() 
	{
		if(state==false)
		{
			System.out.println("DOOR OPENED");
			state = true;
		}
	}
	
	public void closeDoor() 
	{
		if(state==true)
		{
			state = false;
			System.out.println("DOOR CLOSED");
		}
	}
	
	public boolean getState()
	{
		return state;
	}

}
