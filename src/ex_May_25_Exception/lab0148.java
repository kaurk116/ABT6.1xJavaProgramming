package ex_May_25_Exception;

public class lab0148_1 {
    public static void main(String[] args) {
        bank sbi=new bank("INR", 100);
        bank swice =new bank("USD", 10);
        Integer total = sbi.add(swice);
        System.out.println(total);

    }
}
