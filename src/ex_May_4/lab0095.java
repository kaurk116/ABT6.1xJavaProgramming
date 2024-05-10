package ex_May_4;

import java.util.Scanner;

public class lab0095 {
    //Program to reverse the content line without using loop
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name here:");
        String user_input = scanner.next();
        StringBuilder stringBuilder= new StringBuilder(user_input);
        String rev_user_input =stringBuilder.reverse().toString();
       // if(user_input.equalsIgnoreCase(rev_user_input)) {
            System.out.println("reverse : " +rev_user_input);
       // }
      //  System.out.println("nop");
    }
}
