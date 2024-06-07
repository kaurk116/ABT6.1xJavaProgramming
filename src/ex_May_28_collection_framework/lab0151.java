package ex_May_28_collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lab0151 {
    private static int ArrayList;

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        List list = new ArrayList();  //is allow is dynamic dispatch

        //List list1 =new list();   not allow bcz List is an interface.In interface create object not allow
        //Add,Remove ,Contain ,Clear ,IndexOf,IsEmpty ,Get
        //AddAll , RemoveAll  ClearAll ,RetrainAll,ContainsAll

        arrayList.add("karamjeet");
        arrayList.add("Aakash");
        arrayList.add("Annavia");
        arrayList.add("Aakash");

        System.out.println(arrayList);
        System.out.println(arrayList.size());
        System.out.println(arrayList.remove("Aakash"));
        System.out.println(arrayList);
        arrayList.add("Annavia saini");
        System.out.println(arrayList);
        arrayList.set(3,"annavia saini");
        System.out.println(arrayList);

        //type of print array list
        System.out.println("print -------1");


        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));

            System.out.println("print----2");

            for(Object obj : arrayList) {
                System.out.println(obj);
            }

            System.out.println("print---3");

            Iterator it =arrayList.iterator();
                while (it.hasNext()){
                System.out.println(it.next());
            }

        }

    }
}
