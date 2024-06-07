package ex_May_30_Linklist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.Collection.*;

public class lab0159_student  {
    public static void main(String[] args) {
        List student =new ArrayList();

        student student1 =new student (10, "simni");
        student student2 =new student(16, "Sumit");
        student student3 =new  student(13, "Suman");
        student student4 =new student (17, "Ruman");

        List<student> students =new ArrayList<>();
        student.add(student1);
        student.add(student2);
        student.add(student3);
        student.add(student4);
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);



    }
}
