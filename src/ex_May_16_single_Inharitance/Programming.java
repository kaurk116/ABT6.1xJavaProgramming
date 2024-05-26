package ex_May_16_single_Inharitance;

public class Programming{
    //public Programming() {
    //}
    String version;
    String author;

    Programming(){
        System.out.println("dc");

    }

    Programming(String version , String author){
        this.author=author;
        this.version=version;
    }


    void printinfo(){
        System.out.printf("Programming info--%sAuthor--%sversion%n", this.author, this.version);
    }
    void bhk3(){
        System.out.println("Programming bhk3   ---" +this.version);
    }
}
