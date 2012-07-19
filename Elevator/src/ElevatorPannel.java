import java.util.ArrayList;

public class ElevatorPannel 
{
	ArrayList<ElevatorButton> elevatorButtonPannel = new ArrayList<ElevatorButton>();
	Elevator e;
	ElevatorButton elevButton;
	
	public ElevatorPannel(Elevator e, int numOfFloor)
	{
		System.out.println("HEllo");
		this.e = e;
		addButtonToPannel(numOfFloor);
	}
	
	public void addButtonToPannel(int numOfFloor) 
	{
		for(int i=0; i<=numOfFloor; i++)
		{
			elevatorButtonPannel.add(new ElevatorButton());
		}
	}

	public void pressButton(int i) 
	{
		elevatorButtonPannel.get(i).pressButton();		
	}	
}
