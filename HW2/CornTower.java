import java.util.Scanner;

public class CornTower {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of Dome and cylinder (in meters): ");
        int radius = sc.nextInt();

        System.out.print("Enter height of cylinder (in meters): ");
        int height = sc.nextInt();

        double cylinderVolume = (3.14)*(radius*radius)*height;
        double hemisphereVolume = (4*(3.14)*(radius*radius*radius))/(2*3);
        double finalVolume = cylinderVolume + hemisphereVolume;

        System.out.printf("Volume of elevator (in cubic meters): %.2f ", finalVolume);
        sc.close();


    }

}
