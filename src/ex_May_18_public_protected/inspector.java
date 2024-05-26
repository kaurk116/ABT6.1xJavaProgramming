package ex_May_18_public_protected;

public class inspector {

    //Progran to use Default |public | private |protect|
    public int gun =10;
    private  int entry_id =1234;

    public inspector(int gun){
        this.gun=gun;   //pc
    }
     public void shoothim(){
         System.out.println("yes");  //method|function

     }

    private void shoothim1(){
        System.out.println("yes");  //method|function

    }

    protected void shoothim2(){
        System.out.println("yes");  //method|function

    }

}
