import java.util.Scanner;
public class WhatDay{
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the year (e.g. 1968): ");
    int year = sc.nextInt();


    System.out.print("Enter month: ");
    int month = sc.nextInt();

    if (month==1){
        month = 13;
    }
    else if (month==2){
        month = 14;
    }

    System.out.print("Enter the day of the month (1-31): ");
    int dayOfTheMonth = sc.nextInt();


    int dayOfTheWeek = (dayOfTheMonth + (13*(month+1)/5) + (year%100) + ((year%100)/4) + ((year/100)/4) + 5*(year/100)) % 7;

    if (dayOfTheWeek == 0){
        System.out.println("The day of the week is Saturday");
    }
    else if (dayOfTheWeek == 1){
        System.out.println("The day of the week is Sunday");
    }
    else if (dayOfTheWeek == 2){
        System.out.println("The day of the week is Monday");
    }
    else if (dayOfTheWeek == 3){
        System.out.println("The day of the week is Tuesday");
    }
    else if (dayOfTheWeek == 4){
        System.out.println("The day of the week is Wednesday");
    }
    else if (dayOfTheWeek == 5){
        System.out.println("The day of the week is Thursday");
    }
    else{
        System.out.println("The day of the week is Friday");
    }

    sc.close();


    }

}
