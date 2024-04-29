package exApril_27;

import java.util.Scanner;

public class lab0070 {
    public static void main(String[] args) {
        //Program to factoreal number
        //2!= 2*1-2
        //3!=3*2*1=6
        //4!=4*3*2*1=24
        //5!=5*4*3*2*1=120
        Scanner scanner =new Scanner(System.in);
        long num = scanner.nextLong();
        //System.out.println(num);
        long fact = 1;
        for (long i = 1; i <= num; i++) {
            fact = fact * i;
        }
           System.out.println(fact);

        }


}
