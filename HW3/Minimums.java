import java.util.Scanner;
public class Minimums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 4 integers on one line:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();

        System.out.print("The smallest of these is:");
        System.out.print(min4(num1, num2, num3, num4));
        sc.close();
    }

    public static int min4(int num1, int num2, int num3, int num4){
        return min2(min2(num1, num2), min2(num3, num4));
    }


    public static int min2(int num1, int num2){
        if (num1 <= num2){
            return num1;
        }
        else{
            return num2;
        }
    }



}
