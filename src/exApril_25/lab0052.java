package exApril_25;

import java.util.Scanner;

public class lab0052 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Enter your age");
        int age= scanner.nextInt();
        System.out.println("Enter your salary");
        Double salary = scanner.nextDouble();

        System.out.println("Your name is" +name);
        System.out.println("your age is" +age);
        System.out.println("you salary is" +salary);

    }
}
