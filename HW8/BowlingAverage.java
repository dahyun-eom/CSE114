//Dahyun Eom
//dahyun.eom@stonybrook.edu
import java.io.*;
import java.util.Scanner;
public class BowlingAverage {

    public static Bowler[] readBowlers(Scanner bowlerInput){

        Bowler[] work = new Bowler[10];
        int countNumerOfBowlers = 0;
        Bowler[] bowlers;

        try{
            for (int i=0; i<10; i++){
                String name = bowlerInput.next();
                int countOfGames = bowlerInput.nextInt();
                int [] gameScores = new int[countOfGames];

                for (int j=0; j<countOfGames; j++){
                    gameScores[j] += bowlerInput.nextInt();
                }

                work[i] = new Bowler(name, gameScores);
                countNumerOfBowlers += 1;
            }
        }catch(Exception e){
        }
        finally{
            bowlers = new Bowler[countNumerOfBowlers];
            for(int i=0; i<countNumerOfBowlers; i++){
                bowlers[i] = work[i];
            }
        }
        return bowlers;
    }


    public static void main(String[] args) throws IOException{ 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input file name");
        String inputFileName = sc.next();

    
        Scanner inputFile = new Scanner(new BufferedReader(new FileReader("./"+inputFileName)));
        //readBowlers(inputFile);

        PrintWriter fileWriter = null;
        String outputFileName = "./"+inputFileName + ".out";

        Bowler[] bowlers = readBowlers(inputFile);

        fileWriter = new PrintWriter(new BufferedWriter(new FileWriter("./"+outputFileName)));
        for (int i=0; i < bowlers.length; i++){
            fileWriter.print(bowlers[i].getName() + ": ");
            fileWriter.print(bowlers[i].getAverage());
            fileWriter.println();
        }
        fileWriter.close();
        sc.close();
    }
   
}
