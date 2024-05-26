package ex_May_14;

import com.sun.tools.javac.Main;

public class lab0112 {
    public static void main(String[] args) {


        //oops -object -orinted programming
        //Class - Attribute ( data veriable and Behaviours (data members /method))
        //method - function present in the class
        //object - Instance of the class,real entity ,runtime entity

        //constructors
        //default ,parametters,copy constructors (<1% use in automation)
        //this ,super - keywords
        //oops -inhaetance ,pely,Encap,abstraction (interface,obstrac class)
        //practical project-Course website -by oops concept
        //opps applied in the live programming
        // default constructor
        ATBpesron person = new ATBpesron();
        ATBpesron person2 = new ATBpesron();

        //Parameter constructor
        ATBpesron Rohit = new ATBpesron("Rohit");
        {
            System.out.println("Information of Rohit is " +Rohit.name);

        }

        ATBpesron objreff1 = new ATBpesron("rahul", 1000, "2447A", true, "ATB", 45345545434434l);
        {
            System.out.println("Information of Rahul is " +objreff1.name);
            System.out.println("Information of Rahul is " +objreff1.salary);
            System.out.println("Information of Rahul is " +objreff1.address);
            System.out.println("Information of Rahul is " +objreff1.married);
            System.out.println("Information of Rahul is " +objreff1.course);
            System.out.println("Information of Rahul is " +objreff1.PH);
        }
        ATBpesron objreff2 = new ATBpesron("abnive", 1000, "234A", false, "mtb", 8877665544l);
        {
            System.out.println("Information of Abnive is " +objreff2.name);
            System.out.println("Information of Abnive is " +objreff2.salary);
            System.out.println("Information of Abnive is " +objreff2.address);
            System.out.println("Information of Abnive is " +objreff2.married);
            System.out.println("Information of Abnive is " +objreff2.course);
            System.out.println("Information of Abnive is " +objreff2.PH);


        }
    }
}
