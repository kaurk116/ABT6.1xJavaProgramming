package ex_May_2;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class lab0085_hw {
    public static void main(String[] args) {
        //Program to fine the max salary in the array
        int salary[] ={30,50,80,60,90,120,-10,150,-20};
       int max_salary =Integer.MIN_VALUE;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i]>max_salary){
            max_salary=salary[i];
        }
        }
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
            System.out.println("Maximum salary   : " +max_salary);
        }
    }
