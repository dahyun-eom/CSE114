//Dahyun Eom
//dahyun.eom@stonybrook.edu
import java.time.LocalDateTime;
abstract class Jet implements Comparable<Jet>{

    protected String manufacturer;
    protected String model;
    protected int year;
    protected String owner;
    protected Integer grossWeightEmpty;
    protected int hardLandings;
    protected int lastOverhaul;
    protected int numOverhauls;
    protected double maxRecommendedFlightHours;

    public Jet(String manufacturer, String model, int year, String owner, Integer grossWeightEmpty, int hardLandings,
                int lastOverhaul, int numOverhauls, double maxRecommendedFlightHours){

        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.owner = owner;
        this.grossWeightEmpty = grossWeightEmpty;
        this.hardLandings = hardLandings;
        this.lastOverhaul = lastOverhaul;
        this.numOverhauls = numOverhauls;
        this.maxRecommendedFlightHours = maxRecommendedFlightHours;


    }

    public void sellTo(String newOwner){
        owner = newOwner;
    }

    public void overhaul(){
        lastOverhaul = 0;
        hardLandings = 0;
    }

    public void hardLanding(){
        hardLandings++;
    }

    public void fly(int hours){
        lastOverhaul += hours;
    }

    public boolean isAging(){
        return LocalDateTime.now().getYear() - year>15 && numOverhauls>=25;
    }

    abstract double timeTillOverhaul(); //abstract method

    abstract boolean needsOverhaul(); //abstract method

    public int compareTo(Jet o){
        return grossWeightEmpty.compareTo(o.grossWeightEmpty);
    }


    
}