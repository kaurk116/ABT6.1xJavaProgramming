package exApril_23_hw;

import java.util.Scanner;

public class lab0055_fizzbuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        if (number % 3 == 0 && number % 5 == 0)
        {
            System.out.println("is Fizzbuzz");
        }
        else if (number%3==0)
        {
            System.out.println("is Fizz");
        }
        else if (number % 5 == 0)
        {
            System.out.println("is buzz");
        }
        else
        {
            System.out.println("This number not a FIZZBUZZ");
        }
    }
}
