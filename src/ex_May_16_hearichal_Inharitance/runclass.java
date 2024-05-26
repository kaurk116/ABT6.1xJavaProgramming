package ex_May_16_hearichal_Inharitance;

public class runclass {

    public static void main(String[] args) {

        vechile v1 = new vechile();
        //v1.engin = "engingdcd";
        System.out.println(v1.engin);


        v1.body("vechilebody");
        System.out.println(v1.body);

        vechile v2 = new vechile();
        car c1 = new car();
        v2.body("vechilebody");
        System.out.println(v2.body);
        c1.millage(1200);
        System.out.println(c1.millage);
        System.out.println(c1.enginfeature);
    }

}