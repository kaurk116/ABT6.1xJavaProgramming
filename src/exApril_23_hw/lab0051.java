package exApril_23_hw;

import java.util.Scanner;

public class lab0051 {
    public static void main(String[] args){
        //prime number  2,3,5,7,9,11,13,17,29.
       //Scanner scanner =new Scanner(System.in);
        //System.out.println("Please enter the number");
        //int number =scanner.nextInt();

        //Add the bellow condition correct
        for (int i=2; i < 50; i++) {
            if (((i%5==0 || i==5) || (i%3==0 || i==3)) || ((i%5==0 || i==5) || (i%3==0 || i==3))){
                System.out.println("prime number" +i);
                //System.out.println("not a prime number");
                }
            }
        }

         }

