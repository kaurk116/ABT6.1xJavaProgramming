package ex_May_16_single_Inharitance;

public class Java extends Programming{
    String newfeature;

    public Java() {
        System.out.println("dc");

    }
    Java(String newfeature)
    {

        this.newfeature=newfeature;
    }

    void printinfo1(){
        System.out.println("java new feature  --" +this.newfeature);
    }
}
