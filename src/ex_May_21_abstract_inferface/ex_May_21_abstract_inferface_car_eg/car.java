package ex_May_21_abstract_inharitance_inferface;

public class car implements engine,brake{
    @Override
    public void applybrake() {
        System.out.println("Apply brake");
    }

    @Override
    public void startengine() {
        System.out.println("start engine");

    }

    @Override
    public void stopengine() {
        System.out.println("start engine");

    }
}
