package ex_june_01_set;

import java.util.*;

public class lab0169 {
    public static void main(String[] args) {

        //Type of map
       // Map<String,Object> student_data =new HashMap<>();
        //Map<String,Object> student_data =new WeakHashMap<>();
        Map<String,Object> student_data =new LinkedHashMap<>();
        student_data.put("Firstname", "Karamjeet");
        student_data.put("lastname", "kaur");
        student_data.put("id" , 8872682);
        System.out.println(student_data);
        System.out.println(student_data.get("Firstname"));

        Map<String,Object> student_data1 =new LinkedHashMap<>();
        student_data1.put("Firstname", "Aakash");
        student_data1.put("lastname", "saini");
        student_data1.put("id" , 882);
        System.out.println(student_data1);
        System.out.println(student_data.get("Firstname"));

        List maplist =new ArrayList();   //maping with array list
        maplist.add(student_data);
        maplist.add(student_data1);
        System.out.println(maplist);
    }
}
