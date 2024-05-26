package ex_May_18_super_inheritance;

public class lab0117 {

    //Program to use super keyword in void instance method
    public static void main(String[] args) {
        student s =new student();
        //s.message();
        s.display();

    }
}

class student extends teacher{
    void message() {
        System.out.println("Today is class or not");
    }
        void display() {
           // this.message();
            super.message();
        }
    }
class teacher {
    void message(){
        System.out.println("I am in the class");
    }
}

