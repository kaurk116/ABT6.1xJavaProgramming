package ex_May_2;

import java.util.Optional;

public class lab0080 {
    public static void main(String[] args) {
        //Program to create == and .equal function use in array with for loop
        int [] age ={21,22,23,24,24};
        int [] age1 =new int[4];
        age[0]=21;
        age[1]=22;
        age[2]=23;
        age[3]=24;

        for (int i = 0; i <age.length ; i++) {
            System.out.println("1");
            System.out.println(age[i]==age1[1]);
            System.out.println("2");
            System.out.println(age.equals(age1));
            System.out.println("3");
            System.out.println(age[0]==age1[0]);

        }
    }
}
