package ex_june_01_set;

public class lab0173_THW2 {
    public static void main(String[] args) {
        Runnable w1 = new workerth4();
        Thread th1 =new Thread();
        th1.start();
        th1.run();
        th1.getPriority();

        Runnable w2 = new workerth4();
        Thread th2 =new Thread();
        th2.start();
        th2.run();
        th1.getPriority();
        for (int i = 0; i < 5; i++) {
            System.out.println(+Thread.currentThread().getPriority());

        }

    }
}
    class workerth4 implements Runnable{

        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getPriority());
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                   // throw new RuntimeException(e);
                    e.printStackTrace();
                }

            }
        }
    }
