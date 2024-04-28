package exApril_25;

import java.util.Scanner;

public class lab0053 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enetr your marks");
        int marks =scanner.nextInt();
        marks =marks/10;
         switch (marks){
             case 9: {
                 System.out.println("Grade A");
             }
             break;
                 case 8:
                 {
                     System.out.println("Grade B");
                 }
                 break;
             case 7:
             {
                 System.out.println("Grade c");
             }
             break;
             default:
                 System.out.println("Fail");

             }
         }
    }