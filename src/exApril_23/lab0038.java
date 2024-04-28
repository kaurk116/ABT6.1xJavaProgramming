package exApril_23;

import java.util.Scanner;

public class lab0038 {
    // Add the multiple condition 20 >20                                                                                                                                                                                               <20 ==a
    public static void main(String[] args){
        System.out.println("enter the number");
        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();

        if(number >= 20) {
            System.out.println("big number");
        }else if (number >= 10){
            System.out.println("number between 10 to 20");
            }else{
            System.out.println("small number");
        }

    }
}
