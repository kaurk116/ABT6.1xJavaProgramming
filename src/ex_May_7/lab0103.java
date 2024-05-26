package ex_May_7;

import java.util.Scanner;

public class lab0103 {
    public static void main(String[] args) {
        //calculatar
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number 1:");
        int num1 = scanner.nextInt();
        System.out.println("Enter the number 2:");
        int num2 = scanner.nextInt();

        int sum =sum_is(num1 ,num2);
        int sub =sub_is(num1 ,num2);
        int div =div_is(num1 ,num2);
        int mult =mult_is(num1 , num2);

        System.out.println("sum is " +sum);
        System.out.println("Sub is " +sub);
        System.out.println("Div is" +div);
        System.out.println("Mult is " +mult);

    }
    static int sum_is(int num1,  int num2 ) {
        return num1 +num2;}
    static int sub_is(int num1, int num2) {
        return  num1 - num2;
    }
    static int div_is(int num1,  int num2) {
        return  num1 / num2;
    }
    private static int mult_is(int num1,  int num2) {
        return num1 * num2;
    }
}
