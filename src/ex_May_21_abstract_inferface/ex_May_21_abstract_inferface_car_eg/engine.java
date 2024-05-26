package ex_May_21_abstract_inharitance_inferface;

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

