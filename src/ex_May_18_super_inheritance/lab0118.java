package ex_May_18_super_inheritance;

public class lab0118 {
    //Child class extends parents class automatically the super keyword---
    //it's display the default constructor
    public static void main(String[] args) {
        student1 s1 =new student1();
    }
    }
class student1 extends teacher1{
    student1(){
       // super();
        //super("karamjeet");
       super(229, "Aakash");
        System.out.println("this is student dc");
    }
}
class teacher1 {
    teacher1() {
        System.out.println("This is  teacher dc");
    }

    teacher1(String name) {
        System.out.println("This is pc of name is  ");
    }
        teacher1(int id,String name2){
            System.out.println("This is also pc id and number is ");
        }
    }