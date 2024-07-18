import java.util.Scanner;
public class Salary {

    public static void corporateWorker(){
        Scanner sc1 = new Scanner(System.in);

        System.out.print("Enter weekly salary:");
        double weeklySalary = sc1.nextDouble();
        System.out.printf("Gross pay: $%.2f%n", weeklySalary);

        double tax = weeklySalary*(0.125);
        System.out.printf("Taxes: $%.2f%n", tax);

        double netPay = weeklySalary - tax;
        System.out.printf("Net pay: $%.2f%n", netPay);

        sc1.close();
    }

    public static void hourlyEmloyee(){
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Enter hourly wage:");
        double hourlyWage = sc2.nextDouble();

        System.out.print("Enter hours woked:");
        double hoursWorked = sc2.nextDouble();

        double wage;
        if (hoursWorked <= 40){
            wage = (hourlyWage*hoursWorked);
            System.out.printf("Gross pay: $%.2f%n", wage);

            double tax = wage*(0.125);
            System.out.printf("Taxes: $%.2f%n", tax);

            double netPay = wage - tax;
            System.out.printf("Net pay: $%.2f%n", netPay);
        }
        else if (hoursWorked > 40){
            wage = (hourlyWage*40) + (hourlyWage*1.5*(hoursWorked-40));
            System.out.printf("Gross pay: $%.2f%n", wage);

            double tax = wage*(0.125);
            System.out.printf("Taxes: $%.2f%n", tax);

            double netPay = wage - tax;
            System.out.printf("Net pay: $%.2f%n", netPay);
        }
        sc2.close();
    }

    public static void salesEmployee(){
        Scanner sc3 = new Scanner(System.in);

        System.out.print("Enter weekly sales:");
        double weeklySales = sc3.nextDouble();

        double wage = 1000 + 0.12*weeklySales;
        System.out.printf("Gross pay: $%.2f%n", wage);

        double tax = wage*(0.125);
        System.out.printf("Taxes: $%.2f%n", tax);

        double netPay = wage - tax;
        System.out.printf("Net pay: $%.2f%n", netPay);

        sc3.close();
    }

    public static void main(String[] args) {

        Scanner sc4 = new Scanner(System.in);

        System.out.print("Select employee type: (c) corporate (h) hourly (s) sales:");
        char employeeType = sc4.next().charAt(0);

        //System.out.println(employeeType);

        if (employeeType == 'c'){
            corporateWorker();
        }
        else if (employeeType == 'h'){
            hourlyEmloyee();
        }
        else if (employeeType == 's'){
            salesEmployee();
        }
        sc4.close();
    }
}
