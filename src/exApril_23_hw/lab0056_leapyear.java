package exApril_23_hw;

import java.util.Scanner;

public class lab0056_leapyear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = scanner.nextInt();
        //Program to find the leap  year 2000,2004.2008,2012,2016   ----2010  2000
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("leap year");
        }
            else
            System.out.println("not leap year");
        }

        }


