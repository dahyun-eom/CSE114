import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

    System.out.println("java BMI");

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the person's weight kg:");
    double weight = sc.nextDouble();

    System.out.print("Enter the person's height in meters:");
    double height = sc.nextDouble();

    double bmi = weight / (height*height);

    System.out.printf("BMI: %.2f ", bmi);
    sc.close();

    }
}
