package ex_May_2;

public class lab0084_hw {
    public static void main(String[] args) {
        // program to double in array and store like 1,2,3...  is 2,4,6.....
        int array[] ={12,13,14};
        int array1[]=new int[3];
        for (int i = 0; i <array.length ; i++) {
           array1[i] = array[i]*2;

        }
        System.out.println("Print the array and stored");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array1[j]);

        }

    }
}
