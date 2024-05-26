package ex_May_21_abstract_keyword.ex_May_21_abstract_car_eg;

public class car extends engine{
    @Override
    void startengine() {
        System.out.println("Engine start");

    }

    @Override
    void stopengine() {
        System.out.println("Engine stop");

    }

    @Override
    void gearplats() {
        System.out.println("implement gearbox");

    }

    @Override
    void key() {
        System.out.println("give key");

    }
}
