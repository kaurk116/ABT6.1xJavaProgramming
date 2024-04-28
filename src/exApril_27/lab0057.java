package exApril_27;

import java.util.Scanner;

public class lab0057 {
    //Program to solve the mathmatical calculation
    public static void main (String[] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the value of x");
        double x = scanner.nextDouble();
        System.out.println("Enter the value of y");
        double y = scanner.nextDouble();
        System.out.println("Enter the value of z");
        double z = scanner.nextDouble();
        double result;
        result = Math.cbrt((Math.pow(x,2)+Math.pow(y,2)-Math.abs(z)));
        System.out.println(result);
    }
}