package exApril_23;

import java.util.Scanner;

public class lab0039 {
    public static void main (String [] args){
        //fin out the Grade of Students.
        //if(multiple condition){---}
        //else if(multiple condition){----}
        //else if(multiple condition){----}
        //else {-------}
        char Grade = 'Z';
        System.out.println("enter the score=");
        Scanner sc =new Scanner(System.in);
        int score = sc.nextInt();
         if (score >= 80 && score <=100){
             Grade = 'A';
         }
         else if(score >= 60 && score <= 79) {
             Grade = 'B';
         }
         else if (score >= 40 && score <=59) {
             Grade = 'C';
         }
         else {
             Grade = 'F';
         }
         System.out.println("The student grade score is " +Grade);
        }

    }

