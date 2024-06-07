package ex_june_01_set;

import java.util.*;

public class lab0162 {
    public static void main(String[] args) {
        Set trades = new HashSet<>();
        trades.add("Computer");
        trades.add("IT");
        trades.add("Eivil");
        trades.add("Electronic");
        trades.add("Mechinical");


        System.out.println(trades);

        System.out.println("iterator");
        Iterator lt = trades.iterator();
        while (lt.hasNext()) {
            System.out.println(lt.next());
        }
        System.out.println("for object");
        for (Object o : trades)
            System.out.println(o);


        Set number = new HashSet<>();  //sort the list automatically
        number.add(10);
        number.add(3);
        number.add(20);
        number.add(5);
        number.add(15);
        number.add("karamjit");
        number.add(null);

        System.out.println(number);
    }
    }
