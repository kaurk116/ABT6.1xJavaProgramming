package ex_May_25_Exception;

public class lab0146 {
    public static void main(String[] args) {
        int a=0;
        try {
            a = Integer.parseInt(args[0]);
        }catch (NumberFormatException e){
            System.out.println("Number");
        }
        try {
            a = 10 / a;
        }catch (ArithmeticException e){
            System.out.println("Arithmetic");
        }
        try {
            String n = "null";
        }catch(NullPointerException e) {
            System.out.println("NULL");
        }
        finally{
            System.out.println("final error");
        }
    }
}
