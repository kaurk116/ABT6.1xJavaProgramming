package ex_May_18_public_protected;

public class Inspactor2 {
    public static void main(String[] args) {
        inspector inspector =new inspector(20);
       // inspector.shoothim1();  not use method its private
        inspector.shoothim2(); //protected use in same package
    }
}
