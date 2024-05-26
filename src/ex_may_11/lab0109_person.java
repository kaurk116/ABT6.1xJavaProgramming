package ex_may_11;

public class lab0109_person {
    public static void main(String[] args) {
        System.out.println("Hello");
        //Classname object_reff= object() or class name();
        //Class --> blue print of class A B not real
        //Real entities -- class A Behaviour and function

        //use person class for differsnt person name
        person amit =new person();
        amit.name="Aakas";
        System.out.println(amit.name);

        person karam =new person();
        karam.name="karamjeet";
        System.out.println(karam.name);

        //not Assign the value always null
        person kanika=null;
        System.out.println(kanika);

        person radeka =new person();
        radeka.name="radharani";
        System.out.println(radeka.name);


        //Attrubute name 2 used  //output is Amit bcz reff name 2 is "amit"
        person romi =new person();
        romi.name2=romi.name2;
        System.out.println(romi.name2);

        //Attrubute name 2 used //output is Amit bcz reff name 2 is "amit"
        person reeta =new person();
        romi.name2=reeta.name2;
        System.out.println(romi.name2);

        //weight
        person Aakashweight=new person();
        Aakashweight.weight=78;
        System.out.println(Aakashweight.weight);

        person annaweight=new person();
        System.out.println(13);


        //behaviours walk
        person aakashwalk =new person();
        aakashwalk.walk();
        System.out.println("20 km in one day");

        person karamwalk =new person();
         karam.walk();
        System.out.println("6 km in one day");





    }

}
