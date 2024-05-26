package ex_May_21_abstract_inharitance_carex;

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
