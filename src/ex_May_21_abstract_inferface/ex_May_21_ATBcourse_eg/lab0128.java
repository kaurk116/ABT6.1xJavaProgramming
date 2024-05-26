package ex_May_21_abstract_inferface.ex_May_21_ATBcourse_eg;

public class lab0128 {
    public static void main(String[] args) {
        karamjeet k =new karamjeet();
        k.Manualtestingcourse();
        k.Automationtestingcouser();
        k.github();
    }

}
 class karamjeet extends course1 implements course{

     @Override
     public void Manualtestingcourse() {
         System.out.println("guthub");
     }

     @Override
     void github() {

     }
 }

abstract class course1 implements course{
    void Automationtestingcouser() {
        System.out.println("Automationtestingcouser");   //complete metho


    }
    abstract  void github();  //incomplete method
}

interface  course {
    void Manualtestingcourse();
}
