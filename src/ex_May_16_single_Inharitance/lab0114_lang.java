package ex_May_16;

public class lab0114_lang {
    public static void main(String[] args) {
        Programming lang = new Programming("james", "Bond");
            System.out.println(lang.author);
            System.out.println(lang.version);
            lang.printinfo();
            
        Programming pjava = new Programming("Java 22 released in March 2024", "James Gosling");
            Java java = new Java("lamda");
                System.out.println("java itself " +java.newfeature);
                System.out.println("java extend from programming  " + pjava.author);
                System.out.println("java extend from programming  " + pjava.version);
                pjava.printinfo();
                java.printinfo1();
                pjava.bhk3();
                pjava.bhk3();

        Programming PPaython = new Programming ("3.12.3 / 9 April 2024", "Guido van Rossum");
            paython p = new paython("AS", 23);
                System.out.println(p.version);
                System.out.println(p.number);
                System.out.println("java extend from programming ppp " + PPaython.version);
                PPaython.printinfo();
                p.printinfo2();
            }
    }
