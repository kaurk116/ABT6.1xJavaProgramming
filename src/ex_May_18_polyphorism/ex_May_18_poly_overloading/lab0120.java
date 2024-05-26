package ex_May_18_polyphorism.ex_May_18_poly_overloading;

public class lab0120 {
    public static void main(String[] args) {
        lab0120 lab0120=new lab0120("njn");
        lab0120.gift(12);
    }
    //method over loading --method name is same but different args---

    void gift(String name){
        System.out.println("This is name" +name);
    }

    void gift(int x){
        System.out.println("This is x " +x);
    }
    void  gift (double y){
        System.out.println("This is Y " +y);
    }

    void  gift (float Z){
        System.out.println("This is z " +Z);
    }


    //same as constructor overloading

    lab0120(int a){
        System.out.println(10);
    }

   lab0120(String ab){
        System.out.println("name");

    }

}
