package exApril_25;

import java.util.Scanner;

public class lab0054_HW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number");
        int number2 = scanner.nextInt();
        System.out.println("Enter the at one operator  only +,-,*,/");
        char op = scanner.next().charAt(0);

        switch (op) {
            case '+':
                int result = number1 + number2;


        System.out.println("sum of two number is" + result);

            break;
            case '-':
                result = number1 - number2;

                System.out.println("sum of two number is" + result);

            break;
            case '*':
                result = number1 * number2;

                System.out.println("sum of two number is " + result);

            break;
            case '/':
                result = number1 - number2;

                System.out.println("sum of two number is" + result);

            break;
            default:
                System.out.println("none");

            break;
        }
        scanner.close();
    }
}
