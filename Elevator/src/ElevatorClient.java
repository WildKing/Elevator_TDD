
public class ElevatorClient {
	
	public static void main(String[] args) {
		
		int numOfFloor = 10;
		
		Building BD = new Building(numOfFloor);
		
		BD.pressFloorButtonUp(5);
		BD.pressFloorButtonUp(5);
		
		BD.pressElevButton(3);
	}

}
