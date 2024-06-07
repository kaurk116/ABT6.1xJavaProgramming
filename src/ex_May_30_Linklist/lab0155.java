package ex_May_30_Linklist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class lab0155 {
    public static void main(String[] args) {
        List course =new ArrayList<>();
        course.add("Full stack");
        course.add("Front developer");
        course.add("Web Designer");
        course.add("Automation Tester");
        course.add(200);
        course.add(true);

        Iterator iterator = course.iterator();
        iterator.hasNext();
        Object obj= iterator.next();
        if(obj instanceof String) {
            System.out.println("this is string");
        }
        else {
            System.out.println("not string");
        }

        for(Object ccc : course )
        System.out.println(course);

        for (int i = 0; i < course.size(); i++) {
            System.out.println(course.get(i));

            ListIterator lt= course.listIterator();
          while(  iterator.hasNext());
            System.out.println(lt);

            ListIterator lt1 =course.listIterator();
            while (lt1.hasPrevious());
            lt1.add("new course");
            System.out.println(lt1);
          }

        }
    }
