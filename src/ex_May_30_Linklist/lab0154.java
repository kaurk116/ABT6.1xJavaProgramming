package ex_May_30_Linklist;

import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.List;

public class lab0154 {

    //list -Array list, Linked list, Vector list
//add the both list
    public static void main(String[] args) {

        List <String> Coursename = new ArrayList();
        Coursename.add("ATB");
        Coursename.add("MTB");
        Coursename.add("AI");

    List amount = new ArrayList();
    amount.add(12000);
    amount.add(10000);
    amount.add(7999);

    Coursename.addAll(amount);
        System.out.println(Coursename);
    }
}
