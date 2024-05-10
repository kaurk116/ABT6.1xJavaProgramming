package ex_May_4;

import java.util.Scanner;

public class lab0091 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the number we will check pladroom or not");
        String user_input = scanner.next();

        StringBuilder stringbuffer= new StringBuilder(user_input);
        String rev_user_input =stringbuffer.reverse().toString();
        if(user_input.equalsIgnoreCase(rev_user_input)) {
            System.out.println("Palindrom" + user_input);
        }else {
            System.out.println("nope");
        }
    }
}
