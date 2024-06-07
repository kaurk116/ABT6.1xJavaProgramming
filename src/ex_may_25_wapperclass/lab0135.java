package ex_may_25_wapperclass;

import java.util.logging.SocketHandler;

public class lab0135 {
    public static void main(String[] args) {

        // Primitive to wrapper
        int a =10;
        String s1 =String.valueOf(a);
        System.out.println(s1);


        //wrapper to Primitive
        Character ch ='A';
        char ch1 =ch;

        Double d=12.2;
        Long l=349289845l;
        Boolean b=true;
        Float f=12f;


        Integer intobject =Integer.valueOf(5);
        System.out.println(intobject);

        Integer a2 =89;  //Automatically convert to wapper to primitive

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.max(1,2));
        System.out.println(Integer.min(4,7));

        Integer i = Integer.valueOf(5);
        System.out.println(i);
            
        }


    }