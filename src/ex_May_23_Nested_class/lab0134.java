package ex_May_Nested_class;

public class lab0134 {
    public static void main(String[] args) {

        //  mother m=new mother();
        mother.child cc = new mother.child();
        cc.m2();
    }
}
class mother {
    static int o=10;
    int b=12;

   static class child{
        void m2(){
            System.out.println(o);
        }
    }
}
