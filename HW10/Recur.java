//Dahyun Eom
//dahyun.eom@stonybrook.edu
public class Recur{
    
    public static String d2b(int value){
        if(value==0){
            return "0";
        }
        else{
            return d2b(value/2)+Integer.toString(value%2);
        }
    }    

    public static int arrayProduct(int[] numbers){        
        return arrayProduct(numbers, numbers.length-1);   
    }
        
    public static int arrayProduct(int[] numbers, int i){  //auxiliary method
        if(i==0){
            return numbers[0];
        }
        else{
            return numbers[i]*arrayProduct(numbers, i-1);
        }
    }

    public static void main(String args[]){

        ///////part1 test codes//////////////
        System.out.println("convert 129 to binary: "+d2b(129));
        System.out.println("convert 20 to binary: "+d2b(20));

        System.out.println();

        ////////part2 test codes///////////////////
        int[] arr = {10, 10, 10, 10};
        System.out.println("multiply all the integers in arr: "+arrayProduct(arr));

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("multiply all the integers in arr2: "+ arrayProduct(arr2));

    }
    
}
