package ex_May_2;

public class lab0075 {
    public static void main(String[] args) {
        //Program to create == and .equal function use in array
        int [] age ={25,35,45,55,65};
        int [] age2=new int[5];
        age[0]=25;
        age[1]=35;
        age[2]=45;
        age[3]=55;
        age[4]=65;

         int [] age3 =age2;
        // in non-primitive(array ,string) data type


        System.out.println(age == age2);  //ref...  both are same output
        System.out.println(age.equals(age2)); // value... both are same  output  objection.java
        System.out.println(age3 == age2);

        //In which primitive data type
        String name ="karamjeet";
        String name1= "karamjeet";

        System.out.println(name==name1);
        System.out.println(name.equals(name1)); //string.java


    }
}
