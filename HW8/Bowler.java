//Dahyun Eom
//dahyun.eom@stonybrook.edu
public class Bowler{

    private String nameOfBowler;
    private int[] scoresOfABowler;

    public Bowler(String nameOfBowler, int[] scoresOfABowler){
        this.nameOfBowler = nameOfBowler;
        this.scoresOfABowler = scoresOfABowler;
    }

    public String getName(){
        return nameOfBowler;
    }

    public int[] getScoresOfABowler(){
        return scoresOfABowler;
    }

    public double getAverage(){
        if (scoresOfABowler.length == 0){
            return 0.0;
        }
        int sum =0;
        for(int i=0; i<scoresOfABowler.length; i++){
            sum += scoresOfABowler[i];
        }
        double average = (double) sum / scoresOfABowler.length;
        return average;
    }
    
}
