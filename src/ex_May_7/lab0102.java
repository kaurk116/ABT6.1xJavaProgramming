package ex_May_7;

public class lab0102 {
    public static void main(String[] args) {
        int r1 = sumoftwonumber( 10 , 20);
        String r2 =myname( "Karamnjeet" ,  20);
        //void not return
        hey();
        System.out.println(r1);
        System.out.println(r2);
    }




    static int sumoftwonumber(int a , int b) {
        return a+b;
            }
    static String myname(String a ,int b) {
        return a +b;}
    private static void hey() {
        System.out.println("use void");
    }
}
