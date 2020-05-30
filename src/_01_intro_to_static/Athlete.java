package _01_intro_to_static;


	public class Athlete {
	    static int nextBibNumber=0;
	    static String raceLocation = "New York";
	    static String raceStartTime = "9.00am";

	    String name;
	    int speed;
	    int bibNumber;
	    

	    Athlete (String name, int speed){
	        this.name = name;
	        this.speed = speed;
	        nextBibNumber++;
	        bibNumber=nextBibNumber;
	      
	    }

	    public static void main(String[] args) {
	    	System.out.println(raceLocation);
	        Athlete bob = new Athlete("bob", 100);
	        System.out.println(bob.name);
	        System.out.println(bob.bibNumber);
	        Athlete rob = new Athlete("rob", 1);
	        System.out.println(rob.name);
	        System.out.println(rob.bibNumber);
	    	//create two athletes
	        //print their names, bibNumbers, and the location of their race. 
	    }
	}

