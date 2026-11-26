public class Elevator{	
	private int cFloor, travelled, tFloor;
	
	public Elevator(int topFloor){
		cFloor = 1;
		travelled = 0;
		tFloor = topFloor;
	}
	
	public int getCurrentFloor(){
		return cFloor;
	}
	
	public int getFloorsTravelled(){
		return travelled;
	}
	
	public boolean goTo(int floor){
		if(floor>=1 && floor<=tFloor && floor!=cFloor){
			travelled += Math.abs(floor - cFloor);
			cFloor = floor;
			return true;
		}else return false;
	}
	
	public String toString(){
		return "Floor " + cFloor + " of " + tFloor;
	}
	
}	
