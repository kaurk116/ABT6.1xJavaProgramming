package ex_May_14;

public class Bankbranch {
    public static void main(String[] args) {

        RBI objecrreff1 = new RBI("HDFC", 10001, "HDFC0001");
        {
            System.out.println(objecrreff1.bankcode);
            System.out.println(objecrreff1.bankname);
            System.out.println(objecrreff1.branch);
        }
        System.out.println("----different branch-------");
        RBI objecrreff2 = new RBI("ICIC", 10002, "HDFC0002");
        {
            System.out.println(objecrreff2.bankcode);
            System.out.println(objecrreff2.bankname);
            System.out.println(objecrreff2.branch);

        }
    }
}
