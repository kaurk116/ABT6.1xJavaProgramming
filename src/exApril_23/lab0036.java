package exApril_23;

import java.util.Scanner;

public class lab0036 {
    public static void main (String[] args){
        //odd and even number
        // 7 is odd number 4 is even number
        // num%2 ==0  is modular  7/2 reminder == 1 is odd number
        //Scanner class user enter this
        System.out.println("Enrter the number is");
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
       // int Num2 =11;
        //if (Num2%2 ==0) {
        if (Num%2 ==0) {
            System.out.println("A is even number");
        }else {
            System.out.println("A ia odd number");

        }
    }
}
