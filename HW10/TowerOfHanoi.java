//Dahyun Eom
//dahyun.eom@stonybrook.edu
public class TowerOfHanoi {

    public static void movePrint(String a, String b){
        System.out.println("Move:" + a + "-->" + b);
    }
    
    public static void moveSolution(int numberOfDisks, String startingPost, String targetPost, String workingPost){
        if (numberOfDisks == 1){
            movePrint(startingPost, targetPost);
        }
        else{
            moveSolution(numberOfDisks-1, startingPost, workingPost, targetPost);
            moveSolution(1, startingPost, targetPost, workingPost);
            moveSolution(numberOfDisks-1, workingPost, targetPost, startingPost);

        }
    }
    public static void main(String args[]){
        moveSolution(4, "1", "3", "2");
    }
}
