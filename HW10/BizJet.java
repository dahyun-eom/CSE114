//Dahyun Eom
//dahyun.eom@stonybrook.edu
// Imports go here

import java.time.LocalDateTime;

public class BizJet extends Jet {
    // Members go here
	private int numPassengers;
	private boolean transOceanCertified;
	private OverhaulHoursAdjust ohAdjust;
	private int maxHardLandings;

	public BizJet(String manufacturer, String model, int year, String owner, Integer grossWeightEmpty, int hardLandings,
					int lastOverhaul, int numOverhauls, double maxRecommendedFlightHours, int numPassengers, boolean transOceanCertified, OverhaulHoursAdjust ohAdjust, int maxHardLandings){
		super(manufacturer, model, year, owner, grossWeightEmpty, hardLandings, lastOverhaul, numOverhauls, maxRecommendedFlightHours);
		this.numPassengers = numPassengers;
		this.transOceanCertified = transOceanCertified;
		this.ohAdjust = ohAdjust;
		this.maxHardLandings = maxHardLandings;
	}

    // Methods go here
	public boolean theJetRocks(){
		return numPassengers>=12 && transOceanCertified==true;
	}

	public double maximumNumberOfFlightHours(){
		double modifiedMaxFlightHours = maxRecommendedFlightHours;
		if (LocalDateTime.now().getYear() - year > ohAdjust.getYears()){
			modifiedMaxFlightHours = maxRecommendedFlightHours*(1- (double)ohAdjust.getPercentage()/100);
		}
		return modifiedMaxFlightHours;
	}

	public double timeTillOverhaul(){
		double finalmodifiedMaxFlightHours = maximumNumberOfFlightHours();
		if(LocalDateTime.now().getYear() - year<=3){
			finalmodifiedMaxFlightHours+=50;
		}
		return finalmodifiedMaxFlightHours - lastOverhaul;
	}

	public boolean needsOverhaul(){
		return hardLandings > maxHardLandings || timeTillOverhaul()<100;
	}


	public static void main(String[] args) {

	    // Aircraft 1
	    BizJet j1 = new BizJet("Dussault Aviation", // Manufacturer
				   "Falcon 50",         // Model
				   1999,                // year of manufacture
				   "RCI",               // owner
				   30000,               // gross weight empty
				   20,                  // Number of hard landings
				   1890,                // lastOverhaul (flight hours)
				   10,                  // number of overhauls
				   2000,                // maximum recommended flight hours between overhauls.
				   8,                   // number of passengers
				   true,                // trans-ocean certified
				   new OverhaulHoursAdjust(5, 10), // Overhaul adjust information
				   40);                 // Maximum number of hard landings
	    
	    // Aircraft 2
	    BizJet j2 = new BizJet("Cessna",            // Manufacturer
				   "Citation X",        // Model
				   2001,                // year of manufacture
				   "United Technologies", // owner
				   22000,               // gross weight empty
				   5,                   // Number of hard landings
				   1500,                // lastOverhaul (flight hours)
				   14,                  // number of overhauls
				   2000,                // maximum recommended flight hours between overhauls.
				   12,                  // number of passengers
				   false,               // trans-ocean certified
				   new OverhaulHoursAdjust(10, 10), // Overhaul adjust information
				   50);                 // Maximum number of hard landings

	    // Aircraft 3
	    BizJet j3 = new BizJet("Dussault Aviation", // Manufacturer
				   "Falcon 900",        // Model
				   2022,                // year of manufacture
				   "RCI",               // owner
				   30000,               // gross weight empty
				   35,                  // Number of hard landings
				   1890,                // lastOverhaul (flight hours)
				   10,                  // number of overhauls
				   2000,                // maximum recommended flight hours between overhauls.
				   10,                  // number of passengers
				   true,                // trans-ocean certified
				   new OverhaulHoursAdjust(5, 10), // Overhaul adjust information
				   40);// Maximum number of hard landings

	    System.out.println("Testing BizJet =============");
	    
	    if (j1.compareTo(j2) > 0) {
		System.out.println("J1 is greater than j2");
	    } else if (j1.compareTo(j2) < 0) {
		System.out.println("J1 is less than j2");
	    } else {
		System.out.println("j1 and j2 are equivalent");
	    }
	    
	    System.out.println("j1 needs overhaul? " + j1.needsOverhaul());
	    System.out.println("j1 time till overhaul:" + j1.timeTillOverhaul());
	    j1.fly(10);
	    j1.fly(10);
	    j1.fly(10);
	    System.out.println("j1 time till overhaul:" + j1.timeTillOverhaul());
	    System.out.println("j1 needs overhaul? " + j1.needsOverhaul());
	    System.out.println("j3 needs overhaul? " + j3.needsOverhaul());
	    System.out.println("j3 time till overhaul:" + j3.timeTillOverhaul());
	    System.out.println("Add 60 hours to j3 flight time");
	    j3.fly(20);
	    j3.fly(20);
	    j3.fly(20);
	    System.out.println("j3 time till overhaul:" + j3.timeTillOverhaul());
	    System.out.println("J3 needs overhaul? " + j3.needsOverhaul());
	    System.out.println("J3 do overhaul!");
	    j3.overhaul();
	    System.out.println("j3 time till overhaul:" + j3.timeTillOverhaul());
	    System.out.println("J3 needs overhaul? " + j3.needsOverhaul());
		
	    // hard landings
	    System.out.println("6 hard landings for j3");
	    for (int i = 0; i < 6; i++) {
		    j3.hardLanding();
	    }
	    System.out.println("j3 time till overhaul:" + j3.timeTillOverhaul());
	    System.out.println("J3 needs overhaul? " + j3.needsOverhaul());


	    System.out.println("J2 needs overhaul? " + j2.needsOverhaul());
	    System.out.println("j2 time till overhaul:" + j2.timeTillOverhaul());
	    j2.fly(10);
	    j2.fly(10);
	    j2.fly(10);
	    System.out.println("j2 time till overhaul:" + j2.timeTillOverhaul());
	    System.out.println("J2 needs overhaul? " + j2.needsOverhaul());
	    
	    System.out.println("J1 is aging! " + j1.isAging());
	    System.out.println("J2 is aging! " + j2.isAging());
	    if (j1.theJetRocks()) {
		System.out.println("J1 Rocks!");
	    } else {
		System.out.println("J1 does not rock!");
	    }
	    if (j2.theJetRocks()) {
		System.out.println("J2 Rocks!");
	    } else {
		System.out.println("J2 does not rock!");
	    }
	}
}
