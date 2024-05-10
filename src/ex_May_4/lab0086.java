package ex_May_4;

public class lab0086 {
    public static void main(String[] args) {
        int[] array={12,23,24}; // 1D array
    //Program to create  print the array is 3(R)*3(C)
        int[] [] array2d= { ///2D array
                {12,13,14},
                {22,23,24},
                {32,33,34}
        };
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 0; j < array2d[i].length; j++) {
                System.out.println(array2d[i][j]);
              //  System.out.println(array2d.length);
                //System.out.println(array2d[j].length);

            }

        }
    }
}
