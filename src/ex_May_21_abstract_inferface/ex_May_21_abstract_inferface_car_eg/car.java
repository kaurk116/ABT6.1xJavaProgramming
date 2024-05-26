package ex_May_21_abstract_inferface.ex_May_21_abstract_inferface_car_eg;

public class car implements engine, brake {
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
