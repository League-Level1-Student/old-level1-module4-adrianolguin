
	public class Athlete {

	     static int nextBibNumber = 1000;
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
	
	int getBibNum() {
		return bibNumber;
	}

	public static void main(String[] args) {
	     //create two athletes      //print their names, bibNumbers, and the location of their race. }
	
		
		Athlete ath1 = new Athlete("bob",10);
		Athlete ath2 = new Athlete("bob",10);
		Athlete ath3 = new Athlete("bob",10);
		Athlete ath4 = new Athlete("bob",10);
		
	System.out.println(ath1.getBibNum());
	System.out.println(ath2.getBibNum());
	System.out.println(ath3.getBibNum());
	System.out.println(ath4.getBibNum());
	} 
}

