package ex_june_01_set;

import java.time.Duration;

public class lab0_THW1 {
    public static void main(String[] args) {
        Thread th =new Thread();
        wrkerth1 w1 = new wrkerth1();
        w1.start();

        wrkerth1 w2 = new wrkerth1();
        wrkerth1 w21 = w2;
        w21.start();

        for (int i = 0; i < 5; i++) {
            try{
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(Duration.ofMillis(20000));
            } catch (InterruptedException e) {
                //throw new RuntimeException(e);
                e.printStackTrace();
            }

        }
    }
}

    class  wrkerth1 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try{
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(Duration.ofMillis(20000));
                } catch (InterruptedException e) {
                    //throw new RuntimeException(e);
                    e.printStackTrace();
                }

            }
        }
    }
