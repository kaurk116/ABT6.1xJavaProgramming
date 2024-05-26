package ex_May_14;

public class ATBpesron {
    String name; //instance variable
    int salary;
    String address;
    boolean married;
    String course;
    long PH;
    

     //create one time but call many times
   ATBpesron(){
        System.out.println("This is a default constructors");
        course="ATB";
    }
     ATBpesron(String name){
    this.name =name;
   }

    ATBpesron(String name,int salary,String address,boolean married,String course, long PH){
       // This is use for assign the value to the object reff
       this.name=name;
       this.salary=salary;
       this.address=address;
       this.married=married;
       this.course=course;
       this.PH=PH;
        
      }
    
}
