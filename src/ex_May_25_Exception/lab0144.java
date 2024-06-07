package ex_May_25_Exception;

public class lab0144 {
    public static void main(String[] args) {

try {
    //Exception type  --1.Check exception 2.Runtime exception
    //NullPointerException error


    String s1 = null; // NullPointerException
    s1.trim();

    int a = 10;
    int b = 10 / 0; //ArithmeticException
}catch(Exception e){
    System.out.println("get message");
    System.out.println("enter the input in array");
}
    }
}
//get message
//enter the input in array --- output