package examples;

public class Athlete {

	private String name;
	private int speed;
	private static String marathonLocation;
	private int bibNumber;
	private static int runnersInRace;

	public Athlete(String name, int speed) {
		this.name = name;
		this.speed = speed;
		runnersInRace++;
//		setting the bib no depending upon runnersinRace
		this.bibNumber = runnersInRace;
	}

	public void setMarathonLocation(String marathonLocation) {
		this.marathonLocation = marathonLocation;
	}

	@Override
	public String toString() {
		return "Athlete " + name + " is running at " + speed + " miles per hour at " + marathonLocation + " " + bibNumber;
	}

	public static int getRunnersInRace() {
		return runnersInRace;
	}
	
//	to call static method, outside of class ideally we should use - Class.methodName()
//	Don't use too much static that way we are not really using Object Oriented Code
	
}
