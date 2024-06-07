package ex_june_01_set;

public class lab0172_Generic {

    public static void main(String[] args) {
        temp(23);
        temp(2.3);
        temp("karam");
        temp(37424728647l);
        temp(true);


    }

    public static <T> void temp (T a){
        System.out.println(a);
    }
}
