package ex_May_18_Encapsulation;

public class Axisbank {
    public static void main(String[] args) {
        Axisbank AS = new Axisbank("AXIS123", 2000);
        String IFSCCODE = AS.getIFSCCODE(true);
        System.out.println(AS.IFSCCODE);
        AS.setIFSCCODE("AS123",true);
        int balance = AS.getBalance();
    }

    private String IFSCCODE;
    private int balance;

    Axisbank(String IFSCCODE, Integer balance) {
        this.balance = balance;
        this.IFSCCODE = IFSCCODE;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getIFSCCODE(boolean isAuth) {
        if (isAuth) {
            return IFSCCODE;
        } else {
            return "not allow";
        }
    }

    public void setIFSCCODE(String IFSCCODE, boolean isAuth) {
        if (isAuth) {
            this.IFSCCODE = IFSCCODE;
        } else {
            System.out.println("not allow");
        }
    }
}