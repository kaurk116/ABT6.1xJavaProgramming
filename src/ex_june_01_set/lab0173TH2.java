package ex_june_01_set;

public class lab0173TH2 {
    public static void main(String[] args) {
//main thread run
        Thread th2 =Thread.currentThread();
        for (int i = 0; i < 5; i++) {
            System.out.println(th2.getName() + i+ "----" + th2.getThreadGroup()+i+ "----" +th2.getPriority());

        }
    }
}
