package ex_May_28_collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class lab0152 {
   //specify the data type in the array list
    public static void main(String[] args) {
        ArrayList <String>mylist =new ArrayList<>();

        mylist.add("karam");
        mylist.add("Aakash");
        mylist.add("ramu");

        ArrayList <Integer> mylist1=new ArrayList();
        mylist1.add(123);
        mylist1.add(456);

        for(Integer ob : mylist1){
            System.out.println(ob);
        }

        Iterator <String> it = mylist.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
