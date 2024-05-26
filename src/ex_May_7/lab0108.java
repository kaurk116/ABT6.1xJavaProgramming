package ex_May_7;

public class lab0108 {
    public static void main(String[] args) {
        // We have four types of functions
        // no return no parameters
         saysomethingsgood();
        //no return with parameters
        saysomethingsgoodname("karamjeet");
        //returns no parameters
        sumoftowbad(3 , 5);
        //returns with parameters
        int result = sumoftowgood(6,8);
        System.out.println(+result);

    }
    private static void saysomethingsgood() {
        System.out.println("Your are the best");
    }
    private static void saysomethingsgoodname(String name) {
        System.out.println("my name is :" +name);
    }
    private static void sumoftowbad(int a , int b) {
        System.out.println(a+b);
    }

    private static int sumoftowgood(int x, int y) {
        return x+y;
    }



}
