package ex_May_30_Linklist;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class lab0158 {
    public static void main(String[] args) {
        List<String> Mymarks = new Stack();
        ((Stack<String>) Mymarks).push("A");
        Mymarks.add("A");
        Mymarks.add("B");
        Mymarks.add("C");
        System.out.println(Mymarks);
        ((Stack<String>) Mymarks).pop();   //remove the last
        System.out.println(Mymarks);
        ((Stack<String>) Mymarks).push("D");  //to pust in the last of the list
        System.out.println(Mymarks);
        ((Stack<String>) Mymarks).peek();  //to display the list
        System.out.println(Mymarks);

    }
}
