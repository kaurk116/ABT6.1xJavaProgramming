package exApril_25;

import java.util.Scanner;

public class lab0043 {
    public static void main (String[] args){
        //if else / else condition multiple use in it
        //switch multiple condition use the loop
        // Program to enter the number -- we will tell the day of week in switch condition
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number we will tell the day of week");
        int day =scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("mon!");
                break;
            case 2:
                System.out.println("tue!");
                break;
            case 3:
                System.out.println("wed!");
                break;
            case 4:
                System.out.println("Thu!");
                break;
            case 5:
                System.out.println("fri!");
                break;
            case 6:
                System.out.println("sat!");
                break;
            case 7:
                System.out.println("sun!");
                break;
            default:
                System.out.println("enter only 1-7 number");
        }
        System.out.println("end of program");
    }
}
