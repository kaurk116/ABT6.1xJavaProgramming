package ex_june_01_set;

import java.util.HashMap;
import java.util.Map;

public class lab0168 {
    public static void main(String[] args) {
        Map<String,Object> student_data =new HashMap<>();
        student_data.put("Firstname", "Karamjeet");
        student_data.put("lastname", "kaur");
        student_data.put("id" , 8872682);
        System.out.println(student_data);
        System.out.println(student_data.get("firstname"));


    }
}
