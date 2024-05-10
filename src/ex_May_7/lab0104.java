package ex_May_7;

public class lab0104 {
    public static void main(String[] args) {
        //program example friend and begar
        int money =givemoneytofriend(1000);
        System.out.println(money);
        givemoneytobeger();
    }
    private static int givemoneytofriend(int i) {
        return i+10;
    }
    private static void givemoneytobeger() {
        System.out.println("blessing only");
    }
}
