package ex_May_4;

import java.util.Scanner;

public class lab0096 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter any line here: ");
        String user_input = scanner.nextLine();
        StringBuilder sb =new StringBuilder(user_input);
        String reverse_line = sb.reverse().toString();
        System.out.println(reverse_line);
    }
}
