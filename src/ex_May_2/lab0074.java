package ex_May_2;

public class lab0074 {
    public static void main(String[] args) {
        int [] age ={20,30,40,50,60};
        int [] age2 = new int[5];
        age2[0] =20;
        age2[1] =30;
        age[2] =40;
        age[3]= 50;
        age[4] =60;

        System.out.println(age);  //print refrence location the where are stores in jvm
        System.out.println(age[0]);  // print the value of array
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);
        System.out.println(age[4]);
       // System.out.println(age[5]); //.ArrayIndexOutOfBoundsException
    }
}
