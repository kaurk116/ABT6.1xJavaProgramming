package ex_May_30_Linklist;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class lab0156 {


    public static void main(String[] args) {

        List v =new Vector();
        v.add("Full stack");
        v.add("Front developer");
        v.add("Web Designer");
        v.add("Automation Tester");
        v.add(200);
        v.add(true);

        Enumeration vector = ((Vector<?>) v).elements();
        while (((Vector<?>) v).elements().hasMoreElements());
        System.out.println(vector.nextElement());
            }
        }
