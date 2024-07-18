//Dahyun Eom
//dahyun.eom@stonybrook.edu
// Import stuff here
import java.time.LocalDateTime;
public class PassengerJet extends Jet {
	
    // Members go here
	private int numPassengers;
	private int numEngines;
	private boolean hasAutopilot;
	private OverhaulHoursAdjust ohAdjust;
	private int maxHardLandings;

	public PassengerJet(String manufacturer, String model, int year, String owner, Integer grossWeightEmpty, int hardLandings,
						int lastOverhaul, int numOverhauls, double maxRecommendedFlightHours, int numPassengers, int numEngines,
						boolean hasAutopilot, OverhaulHoursAdjust ohAdjust, int maxHardLandings){
	    super(manufacturer, model, year, owner, grossWeightEmpty, hardLandings, lastOverhaul, numOverhauls, maxRecommendedFlightHours);
		this.numPassengers = numPassengers;
		this.numEngines = numEngines;
		this.hasAutopilot = hasAutopilot;
		this.ohAdjust = ohAdjust;
		this.maxHardLandings = maxHardLandings;
							
	}



	// Methods go here
	public boolean isDifficultToFly(){
		if (hasAutopilot == false){
			return true;
		}
		else{
			return false;
		}
	}

	public boolean needsLongRunway(){
		return grossWeightEmpty > 300000;
	}

	public double maximumNumberOfFlightHours(){
		double modifiedMaxFlightHours = maxRecommendedFlightHours;
		if (LocalDateTime.now().getYear() - year > ohAdjust.getYears()){
			modifiedMaxFlightHours = maxRecommendedFlightHours*(1- (double)ohAdjust.getPercentage()/100);
		}
		return modifiedMaxFlightHours;
	}

	public double timeTillOverhaul(){
		return maximumNumberOfFlightHours() - lastOverhaul;
	}

	public boolean needsOverhaul(){
		return hardLandings > maxHardLandings || timeTillOverhaul()<100;
	}

    public static void main(String[] args) {
	// Aircraft 1
	PassengerJet j1 = new PassengerJet("Boeing", // Manufacturer
					   "747",    // Model
					   1999,     // year of manufacture
					   "United", // owner
					   650000,   // gross weight empty
					   10,       // number of hard landings
					   1890,     // lastOverhaul (flight hours since)
					   19,       // number of overhauls
					   2000,     // maximum recommended flight hours
					   510,      // number of passengers
					   4,        // number of engines
					   true,     // has autopilot
					   new OverhaulHoursAdjust(10, 10), // overhaul adjustment info
					   20);      // Maximum number of hard landings

	// Aircraft 2
	PassengerJet j2 = new PassengerJet("McDonnel-Douglas", // Manufacturer
					   "DC-10",            // Model
					   1979,     // year of manufacture
					   "American", // owner
					   430000,   // gross weight empty
					   15,       // number of hard landings
					   1500,     // lastOverhaul (flight hours since)
					   29,       // number of overhauls
					   2000,     // maximum recommended flight hours
					   380,      // number of passengers
					   3,        // number of engines
					   false,    // has autopilot
					   new OverhaulHoursAdjust(10, 5), // overhaul adjustment info
					   25);      // Maximum number of hard landings

		System.out.println("Testing PassengerJet =============");
		if (j1.compareTo(j2) > 0) {
			System.out.println("J1 is greater than j2");       
		} else if (j1.compareTo(j2) < 0) {
			System.out.println("J1 is less than j2");
		} else {
			System.out.println("j1 and j2 are equivalent");
		}                                                                                //working fine
		
		System.out.println("j1 time till overhaul:" + j1.timeTillOverhaul());
		System.out.println("J1 needs overhaul? " + j1.needsOverhaul());
			
		System.out.println("Add 30 flying hours j1");

		j1.fly(10);
		j1.fly(10);
		j1.fly(10);
		System.out.println("j1 time till overhaul:" + j1.timeTillOverhaul());
		System.out.println("J1 needs overhaul? " + j1.needsOverhaul());
		
		System.out.println("J1 do the overhaul");
		j1.overhaul();
		System.out.println("j1 time till overhaul:" + j1.timeTillOverhaul());
		System.out.println("J1 needs overhaul? " + j1.needsOverhaul());

		System.out.println("J2 needs overhaul? " + j2.needsOverhaul());
		System.out.println("j2 time till overhaul:" + j2.timeTillOverhaul());

		System.out.println("Add 60 flying hours j2");
		j2.fly(20);
		j2.fly(20);
		j2.fly(20);

		System.out.println("j2 time till overhaul:" + j2.timeTillOverhaul());
		System.out.println("J2 needs overhaul? " + j2.needsOverhaul());

		// 12 hard landings
		System.out.println("12 hard landings for j2");
		for (int i = 0; i < 12; i++) {
		    j2.hardLanding();
		}
		System.out.println("j2 time till overhaul:" + j2.timeTillOverhaul());
		System.out.println("J2 needs overhaul? " + j2.needsOverhaul());
		
		System.out.println("J1 is aging! " + j1.isAging());
		System.out.println("J2 is aging! " + j2.isAging());
		System.out.println("J1 is hard to fly! " + j1.isDifficultToFly());
		System.out.println("J2 is hard to fly! " + j2.isDifficultToFly());
		System.out.println("J1 needs long runway! " + j1.needsLongRunway());
		System.out.println("J2 needs long runway! " + j2.needsLongRunway());
		
	}

}
