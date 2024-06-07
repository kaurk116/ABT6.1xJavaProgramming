package ex_May_25_Exception;

public class lab0145 {
    public static void main(String[] args) {
        try {
            String sc = args[0];  //ArrayIndexOutOfBoundsException
            Integer b = Integer.parseInt(sc);
            int x = b / 10;
            System.out.println(+x);
            System.out.println(+b);
            //handel the all types of exception
        }catch(ArrayIndexOutOfBoundsException | NumberFormatException ArithmeticException){
            System.out.println("enter the number");


            //type of exception
            //NumberFormatException.forInputString
            //.ArrayIndexOutOfBoundsException
        }
    }

}
