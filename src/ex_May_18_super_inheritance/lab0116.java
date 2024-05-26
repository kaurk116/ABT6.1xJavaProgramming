package ex_May_18;

public class lab0116 {

    //Program to use super keyword in variable
    //this. keyword only use in variable not use in constructor
    public static void main(String[] args) {
        //vechile v=new vechile();
        //v.maxspeed();

        car c =new car();
       c.maxspeed();

    }
}
        class car extends vechile{
         int maxspeed =100;
         void maxspeed(){
             System.out.println("car speed is super "+super.maxspeed);
             System.out.println("car speed is " + this.maxspeed);
    }
}
        class vechile {
        int maxspeed =60;
          // void maxspeed() { //default constructor
            //   System.out.println("vechile speed is "+maxspeed);
            //}
        }

