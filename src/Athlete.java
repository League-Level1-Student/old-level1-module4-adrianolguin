
	public class Athlete {

	     static int nextBibNumber = 0;
	     static String raceLocation = "New York";
	     static String raceStartTime = "9.00am";

	     String name;
	     int speed;
	     int bibNumber = nextBibNumber;

	Athlete (String name, int speed){
	     this.name = name;
	     this.speed = speed;
	     nextBibNumber++;
	}

	public static void main(String[] args) {
	     //create two athletes      //print their names, bibNumbers, and the location of their race. }
		
		Athlete fred = new Athlete("fred", 5);
		Athlete bob = new Athlete("bob", 5);
		
		System.out.println(bob.bibNumber);
		System.out.println(fred.bibNumber);
		//System.out.println(nextBibNumber);
		
	} 
}

