import java.util.Scanner;

public class Distance {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("First distance: Enter Fitbits:");
        int firstFitbits = sc.nextInt();

        System.out.print("First distance: Enter Qubits:");
        int firstQubits = sc.nextInt();

        System.out.print("First distance: Enter Pings:");
        int firstPings = sc.nextInt();

        System.out.print("Second distance: Enter Fitbits:");
        int secondFitbits = sc.nextInt();

        System.out.print("Second distance: Enter Qubits:");
        int secondQubits = sc.nextInt();

        System.out.print("Second distance: Enter Pings:");
        int secondPings = sc.nextInt();

        int overallPings = (firstFitbits*6*20) + (firstQubits*20) + firstPings +
                           (secondFitbits*6*20) + (secondQubits*20) + secondPings;

        int finalFitbits = overallPings / (6*20);
        int finalQubits = (overallPings-(finalFitbits*6*20)) / 20;
        int finalPings = overallPings-(finalFitbits*6*20)-(finalQubits*20);

        System.out.println(" " + firstFitbits + " fitbits, " + firstQubits + " qubits, " + firstPings + " pings + \n " +
                           secondFitbits + " fitbits, " + secondQubits + " qubits, " + secondPings + " pings = \n " +
                           finalFitbits + " fitbits, " + finalQubits + " qubits, " + finalPings + " pings. ");

        sc.close();

    }

}
