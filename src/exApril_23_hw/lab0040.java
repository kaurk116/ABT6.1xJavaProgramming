package exApril_23_hw;

import java.util.Scanner;

public class lab0040 {
    //Program to check if a Number is Positive,Negative or Zero
    public static void main (String [] args){
        System.out.println("enter the number please:");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        if(number >=1) {
            System.out.println("This number is positive number");
        }
        else if(number <=-1) {
            System.out.println("This number is negitive number");
        }
        else if  (number ==0) {
            System.out.println("This is zero");
        }

    }
}
