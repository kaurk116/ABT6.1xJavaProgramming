package ex_May_21_abstract_inharitance;

public class chrome extends Baseclass{
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
