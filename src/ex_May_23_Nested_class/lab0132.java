package ex_May_23_Nested_class;

public class lab0132 {
    public static void main(String[] args) {
     OC outclass =new OC();
     OC.IC inside=outclass.new IC();
     inside.m1();

    }

}
class OC {   //parents class
    int age = 10;
    class IC {   //child class
        void m1() {
            System.out.println(+age);
        }

    }
}


