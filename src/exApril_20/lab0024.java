package exApril_20;

public class lab0024 {
    public static void main (String[] args){
        //jvm contain the ram for store the value when assing.
        String life ="I Love too much my life";
        life.toLowerCase();
        // value only store as "I Love too much my life" not in lower case
        System.out.println(life);

        String life2 ="I Love too much my life";
        //In which reassign the value of life2;
        life2 = life2.toLowerCase();
        System.out.println(life2);

    }

}
