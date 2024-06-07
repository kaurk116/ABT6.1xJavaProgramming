package ex_june_01_set;

import java.time.Duration;

public class lab0173_THW1 {
    public static void main(String[] args) {
        Thread th =new Thread("worker1");
        //thread no 1 -calling run method line 37
        wrkerth1 w1 = new wrkerth1("threadGroup", "worker2");
        w1.start();
        w1.run();

// thread no 2  call run method line 37
        wrkerth1 w2 = new wrkerth1("thread1","worker3");
        w2.start();
        w2.run();

 //main thread
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
    wrkerth1(String threadGroup, String name){
              // super(threadGroup,name);
    }

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
