package ex_june_01_set;

import java.util.HashSet;
import java.util.Set;

public class lab0161 {
    public static void main(String[] args) {
        Set fruit =new HashSet();  //hash not contain the duplicate value in list
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Banana");
        fruit.add("Apple");
        fruit.add("apple");
        System.out.println(fruit);
        fruit.remove("Orange");
        System.out.println(fruit);
        fruit.clear();
        System.out.println(fruit);
        fruit.add("Water mellion");

    }
}
