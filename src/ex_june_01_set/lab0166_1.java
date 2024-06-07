package ex_june_01_set;

import java.util.HashSet;
import java.util.Set;


public class lab0166_1 {
    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 4, 4, 5, 5};
        findAndPrintDuplicates(input);
    }

    public static void findAndPrintDuplicates(int[] input) {
        Set<Integer> dup = new HashSet<>();
       // Set<Integer> duplicates = new HashSet<>();

        for (int number : input) {
            if (!dup.add(number)) {
                dup.add(number);
                System.out.println(dup);
            }
        }

        // Printing the duplicates
        for (int duplicate : dup) {
            System.out.println("Duplicate value: " + duplicate);
        }
    }
}
