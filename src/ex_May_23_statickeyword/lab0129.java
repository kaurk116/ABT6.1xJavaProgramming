package ex_May_23_statickeyword;
//static is a keyword belongs to class //load with the class

//common to the multiple object refference

public class lab0129 {
    public static void main(String[] args) {
        thetestingacademy karam=new thetestingacademy(8872682291l);
        karam.display();
        System.out.println(thetestingacademy.course);

        thetestingacademy astitave=new thetestingacademy(9996644027l);
        astitave.display();
        System.out.println(thetestingacademy.course);
    }
}

class thetestingacademy {

    static {
        System.out.println("SIB static initialization block print the details of student"); //call only one time
    }
    {
        System.out.println("ILB  instance initialization  block");  //call object has been created
    }
    static String course ="ATB";// static instance variable
    long phone_number;


    public thetestingacademy(long phone_number) {
        this.phone_number = phone_number;
    }
    public void display(){
        System.out.println("Display details " +phone_number);
    }
    static void sc(){
        System.out.println("the course is "  +course);
    }

}