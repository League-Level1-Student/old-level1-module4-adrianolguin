public class Athlete {

    // static int nextBibNumber +=;
     String raceLocation = "New York";
     static String raceStartTime = "9.00am";

     String name;
     int speed;
     static int bibNumber = 1;

Athlete (String name, int speed){
	bibNumber = nextBibNumber;
     this.name = name;
     this.speed = speed;
}

public static void main(String[] args) {
//create two athletes      
//print their names, bibNumbers, and the location of their race. }

	
	Athlete a1 = new Athlete("bob", 5);
	
	Athlete a2 = new Athlete("randy", 3);
	
	a1.raceLocation = "New Jersey";
	
	System.out.println(a1.name + ":" + bibNumber + ", " + a1.raceLocation);
	System.out.println(a2.name + ":" + bibNumber + ", " + a2.raceLocation);
	
	
	
}
}