package ex_May_16_Inharitance;

public class lab0115 {
    public static void main(String[] args) {



        grandfather GF =new grandfather();
        GF.home();

        father F =new child();
        F.home1();

        child c =new child();
         c.home();

        //Dynamic Dispatch  if those object are created oup put is showing him
        grandfather gf1=new father();
        gf1.home();

        grandfather gf2 =new child();
        gf2.home();

        father gf3 =new child();
        gf3.home();

          ///not possible  asume child not born
        //child ch =new father();
        //ch.home();


    }
}
