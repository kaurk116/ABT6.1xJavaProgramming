package exApril_23_hw;

import java.util.Scanner;

public class lab0042 {
    public static void main(String[] args) {
        System.out.println("Enter the Alphabets:");
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        if(ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u") || ch.equals("A") || ch.equals("E") || ch.equals("I") || ch.equals("O") || ch.equals("U"))
         //if(ch == "a" || ch == "e" || ch == "i" || ch == "o" || ch == "u" || ch == "A" || ch == "E" || ch == "I" || ch == "O" || ch == "U")not working
        {
            System.out.println("This is vowel");
        }
          else {
            System.out.println("Cotonents");
        }
    }
}
