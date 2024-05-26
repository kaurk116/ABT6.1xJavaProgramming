package ex_May_21_abstract_keyword.ex_May_21_abstract_browser_eg;

public class firefox extends Browser {
    @Override
    String openbrowser() {
        System.out.println("open firefox browser");
        return "";
    }

    @Override
    String closebroswer() {
        System.out.println("close firefox browser");
        return "";
    }
}
