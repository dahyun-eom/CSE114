import java.util.Random;
public class ArrUtils{


    public static int[] randomArray(int rangeMax, int count){ //This generates an array filled with random integer values.
        Random randgen = new Random();
        int[] newRandomArr = new int[count];

        for (int i = 0; i < count; i++) {
            newRandomArr[i] = randgen.nextInt(rangeMax);
        }
        return newRandomArr;
    }


    public static void printIntArray(String head, int[] ary){ //Prints all the elements in an integer array
        System.out.println(head);

        for (int i = 0; i < ary.length; i++){

            if (i==ary.length-1){
                System.out.println(ary[i]);
            }

            else{
                System.out.print(ary[i] + ", ");
            }
        }
    }


    public static boolean contains(int[] theArray, int validElements, int theValue){ //A method that returns true or false. It returns true if the provided array contains a given value. False otherwise.
        if (validElements == -1 ){
            validElements = (theArray.length-1);
        }

        for(int i = 0; i <= validElements; i++){
            if(theArray[i] == theValue){
                return true;
            }
        }
        return false;
    }


    public static void printIntArrayRange(String head, int[] ary, int firstElement, int lastElement){ //Prints the elements of an integer array from a given first element to a given last element
        System.out.println(head);
        if (ary.length ==0 || lastElement-firstElement <= 0 || firstElement < 0 || lastElement > ary.length){
            System.out.println("Nothing to print!");
            return;
        }

        for (int i = firstElement; i < lastElement; i++){
            System.out.print(ary[i]);

            if (i < lastElement -1){
                System.out.print(", ");
            }
        }
        System.out.println();
    }


    public static int locateFirst(int[] ary, int val){ //Returns the *index* of the first occurrence of an integer value in an array
        for (int i = 0; i < ary.length; i++){
            if (ary[i] == val){
                return i;
            }
        }
        return -1;
    }
}
