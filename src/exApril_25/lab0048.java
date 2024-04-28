package exApril_25;
public class lab0048 {
    public static void main(String[] args) {
        char ch = 'A';
        int val = switch (ch) {
            case 'A':
                yield 60;
            case 'B':
                yield 70;
            default: {
                System.out.println("default");
            }
            throw new IllegalStateException("error");


        };
    }
}


