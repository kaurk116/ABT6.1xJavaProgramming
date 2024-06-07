package ex_june_01_set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class lab0163 {

    public static void main(String[] args) {
        Set trades = new LinkedHashSet(10, 8);
        trades.add("Computer");
        trades.add("IT");
        trades.add("Eivil");
        trades.add("Electronic");
        trades.add("Mechinical");
        trades.add("IT");
        trades.add("ABC");

        System.out.println(trades);
        System.out.println(trades.size());
    }
}
