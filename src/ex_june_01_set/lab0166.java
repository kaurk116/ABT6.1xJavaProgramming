package ex_june_01_set;

import java.util.HashSet;
import java.util.Set;

public class lab0166 {
    private static int[] duplicates;

    public static void main(String[] args) {
        int [] input = {1,2,2,3,4,4,5,5};
        Set <Integer>uniqueset =new HashSet<>();
        for(int num: input) {
            uniqueset.add(num);
        }
            System.out.println(uniqueset);

        //print the duplicate value in hash set

        }
    }
