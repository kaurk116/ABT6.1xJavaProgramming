package ex_May_16_single_Inharitance;

public class paython extends Programming{
    String version;
    int number;

    public paython(){
        System.out.println("PaythonDC");

    }

    paython (String version,int number){
        this.version=version;
        this.number=number;
    }
    void printinfo2(){
        System.out.println("Information "  +this.version+  "--number--" +this.number);
    }

}
