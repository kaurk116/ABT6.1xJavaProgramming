package ex_june_01_set;

public class lab0171_generic {
    public static void main(String[] args){
        System.out.println(maxvalue(12,45,65));
        System.out.println(maxvalue(1.2, 1.3, 1.4 ));
        System.out.println(maxvalue('a','s','d'));
        System.out.println(maxvalue("AB", "AC","AC"));
    }

    public static <T extends Comparable<T>> T  maxvalue(T a, T b, T c) {
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
