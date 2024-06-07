package ex_May_23_statickeyword;

public class lab0130 {
    public static void main(String[] args) {
        person p1=new person("amit");
        person p2 =new person("robin");
        System.out.println(person.ff);
        //static method call by clas as well as by obje reff
        person.m1();
        p1.m1();
        p2.m1();


        //non-static method call only by obej reff
        //static are variable /method and block
        //Static are call with clas name
        //person.m2();
        p1.m2();
        p2.m2();
    }
    }
        class person {
            static String ff = "footbolclub";

             static void m1(){
                 System.out.println("common function");
             }
             void  m2(){
                System.out.println("person is  :"+this.name);
            }

            static {
                System.out.println("person id");
            }

            String name;

            public person(String name) {
                this.name = name;
            }
              void display(){
                    System.out.println("person is :"  +name);
                }
            }
