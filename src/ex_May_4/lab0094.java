package ex_May_4;

public class lab0094 {
    public static void main(String[] args) {

//Program to reverse the array
        int[][] arrray = new int[][]{
                {2, 3,9},
                {5, 6,7},
                {1, 0,4}
        };
        //i=row
        //j =colum
        for (int i = 0; i < arrray.length; i++) {
            for (int j = 0; j < arrray[i].length; j++) {
                //System.out.println(arrray[i][j]);
                   System.out.println("reverse" +arrray[j][i]);
                }

                }
            }
}
