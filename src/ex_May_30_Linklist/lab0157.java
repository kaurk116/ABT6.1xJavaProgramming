package ex_May_30_Linklist;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class lab0157 {
    public static void main(String[] args) {

        List<Integer> Mymarks =new ArrayList();
        Mymarks.add(98);
        Mymarks.add(79);
        Mymarks.add(88);
        System.out.println(Mymarks);
        Collections.sort(Mymarks); //short the array list
        System.out.println(Mymarks);

        List <Integer> Mymarks1 =new Vector<>();
        Mymarks1.add(69);
        Mymarks1.add(49);
        Mymarks1.add(55);
        System.out.println(Mymarks1);
         Collections.sort(Mymarks1);
        System.out.println(Mymarks1);

    }
}
