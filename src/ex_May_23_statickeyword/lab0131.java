package ex_May_23_statickeyword;

public class lab0131 {
    public static void main(String[] args) {
        A a =new A();
        A b=new A();

        A.m1();
        a.m1();
        b.m1();


        a.m2();
        b.m2();
        System.out.println(a.age);
    }
}

class A{
    int age =10;
    static{
        System.out.println("SIB--AAA");
    }
    {
        System.out.println("IIB");
    }

    static void m1(){
        System.out.println("MI");
    }

    void m2(){
        System.out.println("BBB");
    }
}
