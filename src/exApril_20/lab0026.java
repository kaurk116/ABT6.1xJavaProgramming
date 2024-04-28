package exApril_20;

public class lab0026 {
    public static void main (String[] args) {
        String name = "Automation Tester"; //store in same place
        String name1= "Automation Tester";  //store in same place
        String name2 = new String("Automation Tester"); //store in different place
        String name6 = new String("Automation Tester");  //store in different place


        System.out.println(name + name1 +name2);
        // same value assign in different variable
        //only one value store by JVM bcz all are the same
        System.out.println(name == name1);
        System.out.println(name1 == name2); //this is checking the storage place assign new or existing
        System.out.println(name1.equals(name2));  //this is checking the content text
        System.out.println(name2.equals(name6));
        System.out.println(name2 == name6);
        System.out.println( "-------------");

        String name3 = "Automation";
        String name4= " Tester";
        String name5 = "Automation Tester";
        String name7 = name3.concat(name4);
        //Three values are store by JVM
        System.out.println(name3.equals(name4));
        System.out.println(name4.equals(name5));
        System.out.println(name5.equals(name7));







    }
}
