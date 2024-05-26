package ex_May_21_abstract_keyword.ex_May_21_abstract_browser_eg;

public class chrome extends Browser {
    @Override
    String openbrowser() {
        System.out.println("open chrome browser");
        return "";
    }

    @Override
    String closebroswer() {
        System.out.println("close chrome browser");
        return "";
    }
}
