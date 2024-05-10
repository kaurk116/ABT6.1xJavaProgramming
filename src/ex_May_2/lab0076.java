package ex_May_2;

public class lab0076 {
    public static void main(String[] args) {
        //Program to use final in array.
       final int [] age ={11,22,33,44,55};
        final int []age1 =new int[5];  //final  is use for final the size of array not value
        age1[0]=11;
        age1[1]=22;
        age1[2]=33;
        age1[3]=44;
        age1[4]=55;
        age1[3]=77;
        age[2]=88;

        final int age2 =10;  //if non primitive data type values are final  10
       //age2 =15; not change
        System.out.println(age1[3]);
        System.out.println(age[2]);
    }
}
