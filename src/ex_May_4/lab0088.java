package ex_May_4;

public class lab0088 {
    public static void main(String[] args) {
        // Program to print array  those 3(Row)*4(Column)

        int [] [] array2d= {
                {12,13,14,15},
                {22,23,24,25},
                {32,33,34,35},

        };
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.println(array2d[i][j]);

            }

        }

    }
}
