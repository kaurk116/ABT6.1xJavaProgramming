package ex_May_7;

public class lab0099 {
    public static void main(String[] args) {
        System.out.println("start");
        //Same function call multiple times
        f1();
        f2();
        f3();
        f4();
        f1();
        f2();
    }
    static void f1() {
        System.out.println("FF1");}
    static void f2(){
        System.out.println("FF2");}
    private static void f3() {
        System.out.println("FF3");}
    private static void f4() {
        System.out.println("FF4");}
}
