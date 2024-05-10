package ex_May_4;

import static java.lang.System.out;

public class lab0092 {
    public static void main(String[] args) {
        //Program to find the maximum value in 2D array
        int[][] array = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int array_max_value = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; i++) {
                out.println("array value" + array[i][j]);
                if (array[i][j] >= array_max_value) {
                    array_max_value = array[i][j];
                    System.out.println("maximum value in array is :" + array_max_value);
                } else {
                    System.out.println("nop");
                }
            }
        }
    }
}