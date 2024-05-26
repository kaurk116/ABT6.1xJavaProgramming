package ex_May_21_abstract_inharitance;

public class firefox extends Baseclass{
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
