package ex_May_2;public class lab0082 {
    public static void main(String[] args) {
        //int [] number =new int[100];
        for (int i = 1; i <= 100; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println("this is fizzbuzz");
            }
            else if (i%3==0) {
                System.out.println("This is fizz");
            }
            else if (i % 5 == 0) {
                    System.out.println("This is buzz");
                }

            else {
                System.out.println(i);
            }

        }
    }
}
