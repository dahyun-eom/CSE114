//Dahyun Eom
//dahyun.eom@stonybrook.edu
import java.util.Arrays;
public class State{

    public static void stateDistribution(String[] states_arr){
        Arrays.sort(states_arr);

        int count = 1;
        for(int i=0; i<states_arr.length-1; i++){
            if(states_arr[i].equals(states_arr[i+1])){
                count++;
            }
            else{
                System.out.println(states_arr[i] +", "+ count);
                count = 1;
            }
            if(i == states_arr.length-2){
                System.out.println(states_arr[i+1] +", "+ count);
            }
        }
    }
}