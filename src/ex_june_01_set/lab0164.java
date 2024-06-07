package ex_june_01_set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class lab0164 {
    public static void main(String[] args) {
        TreeSet trades = new TreeSet();  //sort the list automatically  only allow one type of data type
        trades.add(10);
        trades.add(3);
        trades.add(20);
        trades.add(5);
        trades.add(15);
        trades.add("karamjit");   //java.lang.ClassCastException
        //trades.add(null);  //Null pointer exception

        System.out.println(trades);

    }
}