package ex_May_2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class lab0081 {
    public static void main(String[] args) {
        float marks[] =new float[5];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the marks of subject English" +marks[0]);
        marks[0] =scanner.nextFloat();
        System.out.println("Enter the marks of subject Hindi" +marks[1]);
        marks[1] =scanner.nextFloat();
        System.out.println("Enter the marks of subject Math" +marks[2]);
        marks[2] =scanner.nextFloat();
        System.out.println("Enter the marks of subject Science" +marks[3]);
        marks[3] =scanner.nextFloat();
        System.out.println("Enter the marks of subject Socile science" +marks[4]);
        marks[4] =scanner.nextFloat();


        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 30) {
                System.out.println("you are fail in this subject" + marks[i]);
            }
            System.out.println(marks[i]);
        }

            scanner.close();
        }
    }

