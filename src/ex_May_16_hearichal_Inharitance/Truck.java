package ex_May_16_hearichal_Inharitance;

public class Truck extends vechile {
    String enginefeature ="1200CC";
    int millage;

    Truck(){
        System.out.println("The truck house power is  " +enginefeature);
    }

    void  millage(int millage){
        this.millage=millage;
    }
}
