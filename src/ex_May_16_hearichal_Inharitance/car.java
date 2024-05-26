package ex_May_16_hearichal_Inharitance;

public class car  extends vechile{
    String enginfeature ="400CC";
    int millage;

    car() {
        System.out.println("This car housepower   " +enginfeature);
    }
    void  millage(int millage){
            this.millage=millage;
        }
    }
