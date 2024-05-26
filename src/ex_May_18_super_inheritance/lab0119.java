package ex_May_18;

public class lab0119 {
    public static void main(String[] args) {
        dog d = new dog();
        dog d1 =new dog("labra");
        d1.display();
        dog d2 =new dog("gold", "dog it");
        d2.display();
    }
}
class Animal {// parameter constructor channing
    String type;
    Animal (){
        System.out.println("Animal DC");
    }
    Animal(String type){
        this.type=type;
        System.out.println("Animal PC");
    }
}
class dog extends Animal{
    String bread;
    int a;
    dog(){
        //this.bread =bread;
      System.out.println("This is Dog");
    }
     public dog(String bread){
        super("dog type");
        this.bread=bread;
        System.out.println("Parametter constructor with one arg");
    }

    public dog(String bread, String type){
        this("bread");
        this.type=type;
        System.out.println("Parametter constructor with two arg");
    }

    public dog(String bread, String type, int a){
        this("white","gold");
        this.a=a;
        System.out.println("Parametter constructor with two arg");
    }



    void display(){
        System.out.println("This all values dog type " +type+ "bread " +bread);

    }

}
