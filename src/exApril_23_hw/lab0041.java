package exApril_23_hw;

import java.util.Scanner;

public class lab0041 {
    //Program to fine the largest Amoung Three Number
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        if (number1 > number2 && number1 > number3) {
            System.out.println("Frist number is largest number" + number1);
        } else if (number2 > number1 && number2 > number3) {
            System.out.println("Second number is largest number" + number2);
        } else {
            System.out.println("Third number is largest number" + number3);
        }
        sc.close();
        //int largest =(number1 > number2) ? (number1>number3)?number1: number3:(number2>number3)?number2: number3; ternary operators
        //System.out.println("large number is " +largest);
    }

}
