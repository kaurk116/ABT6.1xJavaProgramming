package ex_May_4;

public class lab0093 {
    public static void main(String[] args) {
        //Program to check the element to find the value
        int[][] array = new int[][]{
                {2, 3, 4},
                {5, 6, 8},
                {7, 5, 9}
        };
        boolean present = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 1) {
                    System.out.println("Present");
                }
                else {
                    System.out.println("not present");
                }
            }
        }
    }
}
