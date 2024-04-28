package exApril_23;

import java.util.Scanner;

public class lab0037 {
    public static void main (String [] args) {
        System.out.println("enter the number is");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.println("Enter the number is");
        int b = sc.nextInt();
        if (a >b) {
            System.out.println("mai num is" + a);
        }else{
            System.out.println("max nimber is" +b);
        }
        }
    }
