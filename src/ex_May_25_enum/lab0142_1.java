package ex_May_25_enum;

public class lab0142_1 {
    public static void main(String[] args) {
        testpage t= testpage.registration;
        switch ((t)) {
            case login -> System.out.println("login");
            case registration -> System.out.println("reg ");
        }

            testpage t1=testpage.login;
        System.out.println(t1.getUrl());
        System.out.println(t1.getPage());
    }
}
