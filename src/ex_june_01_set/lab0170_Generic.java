package ex_june_01_set;

public class lab0170_Generic {

    //generic is a class to use the place of data type <T>
    //in it not use generic number
    public static void main(String[] args) {
        int maxput = maxvalueof(12, 45, 23);
        System.out.println(maxput);


        System.out.println(maxvalueofG(12, 45, 65));
        System.out.println(maxvalueofG(1.2, 4.5, 6.5));

    }


    public static int maxvalueof(int a, int b, int c) {
        int max = a;
        if (b > max) {
            b = max;

        }
        if (c > max) {
            c = max;

        }
        return max;

    }


    public static <T extends Comparable<T>> T maxvalueofG(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) {
            b = max;

        }
        if (c.compareTo(max) > 0) {
            c = max;

        }
        return max;
    }
}