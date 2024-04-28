package exApril_20;

public class hw_lab0031 {
    public static void main (String [] args) {
        //pre and post -- Increment operators
        int a = 10;
        int result = ++a + a++ + a++;
        //a is       11 12 13
        //result is  11  11 12
        System.out.println(a); //11 +11 +12=34  value of a =13

        System.out.println(result);
        //Pre and Post Decrement operators
        int b = 10;
        int result2 = --b + ++b + b++;  // 9 +10 + 10 =   b=11
        System.out.println(b);
       System.out.println(result2);
    }
}
