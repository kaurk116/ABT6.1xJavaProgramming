package ex_May_18_polyphorism.ex_May_18_overriding;

public class lab0121 {
    public static void main(String[] args) {
        //programming to method overriding class dog and husky
        dog d =new dog();
        d.bark();

        husky h =new husky();
        h.bark();

        dog dh =new husky();
        dh.bark();
    }
}
