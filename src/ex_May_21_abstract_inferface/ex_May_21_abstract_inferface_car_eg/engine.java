package ex_May_21_abstract_inferface.ex_May_21_abstract_inferface_car_eg;

public interface engine {
    void startengine();
    void  stopengine();
    //use full method/function
    default void haltstartengine(){
        System.out.println("this is haltstartengine");
    }

    static void haltstoptengine(){
        System.out.println("haltstopengine");
    }
    //void test(){//not alow
      //
    //  System.out.println("test");
   // }
}

