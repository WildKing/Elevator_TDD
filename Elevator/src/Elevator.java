
public class Elevator 
{
	ElevatorPannel Ep;
	Door door;
	Building bd; 
	int numOfFloor; 
	int currPos;
	boolean state;
	
	public Elevator(Building bd)
	{
		currPos = 0;
		state = false;
		this.bd = bd;
		Ep = new ElevatorPannel(this,bd.getNumberOfFloor());
		door = new Door(this);
	}

	public int getElevPosition() 
	{
		return currPos;
	}

	public void goToFloor(int i) 
	{
		int j;
		System.out.println("ELEVATOR CURRENT POSITION IS: " + currPos);
		if(i>currPos)
		{
			System.out.println("ELEVATOR STARTED MOVING UP");
			
			for(j=currPos+1; j<=i; j++)
			{
				System.out.println("Elevator reached at floor no: "+ j);
			}
			
			currPos = j-1;
			System.out.println("Currrent Pos Is: " + getElevPosition());
			door.openDoor();
			door.closeDoor();
		}
		else if(i<currPos)
		{
			System.out.println("ELEVATOR STARTED MOVING DOWN");
			
			for(j=currPos-1; j>=i; j--)
			{
				System.out.println("Elevator reached at floor no: "+ j);
			}
			
			currPos = j+1;
			
			door.openDoor();
			door.closeDoor();
		}
		else 
			door.openDoor();
			door.closeDoor();
	}

	public void pressButton(int i) 
	{
		Ep.pressButton(i);		
	}
	
}
