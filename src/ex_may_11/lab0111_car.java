package ex_may_11;

public class lab0111_car {
    public static void main(String[] args) {
        car tesla =new car();
        tesla.color ="red";
        tesla.modle= "xsd90";
        tesla.name="polo";
         tesla.reverse();
         tesla.topspeed();

        car xuv =new car();
        xuv.color ="gray";
        xuv.modle= "xuv100";
        xuv.name="xuv";
        xuv.reverse();
        xuv.topspeed();

        System.out.println(tesla.color);
        System.out.println(tesla.modle);
        System.out.println(xuv.modle);

    }
}
