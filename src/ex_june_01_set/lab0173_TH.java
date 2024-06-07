package ex_june_01_set;

import java.time.Duration;

public class lab0173_TH {

    //main thread run
    public static void main(String[] args) throws InterruptedException {
        Thread th =Thread.currentThread();
        System.out.println(th);
        for (int i = 0; i < 5; i++) {
            System.out.println(i+ "----" +th.getName());
            System.out.println(i+ "----" +th.getPriority());
            Thread.sleep(Duration.ofMillis(5000));
        }

    }
}
