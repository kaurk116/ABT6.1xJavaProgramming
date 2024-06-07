package ex_May_28_collection_framework;

import java.util.*;

public class lab0153 {

    public static void main(String[] args) {
        List mylist =new ArrayList();
        mylist.add("Gurmit");
        mylist.add("suman");
        mylist.add("Dheru");

        System.out.println("Print list 1");
        System.out.println(mylist);

        List mylist1 =new Vector();
        mylist1.add("Amit");
        mylist1.add("bahnu");
        mylist1.add("sharda");

        System.out.println("Print list 2");
        System.out.println(mylist1);

        List mylist2=new LinkedList();
        mylist2.add("Aakash");
        mylist2.add("Rutivk");
        mylist2.add("ragave");

        System.out.println("Print list 3");
        System.out.println(mylist2);
        mylist2.remove("Rutivk");
        System.out.println(mylist2);

        System.out.println("Print object");
          for(Object obj : mylist) {
            System.out.println(obj);
        }
        System.out.println("Print for i++");

         for (int i = 0; i <mylist1.size() ; i++) {
            System.out.println(mylist1);

             System.out.println("Print iterator");

            Iterator iterator = mylist2.iterator();
            while (iterator.hasNext());
            System.out.println(iterator.next());

        }


    }
}
