package exApril_23_hw;

import java.util.Scanner;

public class lab0051 {
    public static void main(String[] args){
        //prime number  2,3,5,7,9,11,13,17,29.
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter the number");
        int number =scanner.nextInt();
        //Add the bellow condition correct
         if ((number%2==1) && (number%3==0))
         {
             System.out.println("Prime number");
        }
         else
            System.out.println("not a prime number");

         }
    }

