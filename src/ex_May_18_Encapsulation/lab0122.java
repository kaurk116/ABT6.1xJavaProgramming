package ex_May_18_Encapsulation;

public class lab0122 {
    public static void main(String[] args) {

    vizitorlogin v1 = new vizitorlogin("admin", "admin123");
    System.out.println(v1.username);
       // System.out.println(v1.password);  not allow bcz private
}

}
class vizitorlogin{
    public String username;
    private String password;

    //parameter constructor
    public vizitorlogin(String username,String password){
        this.password =password;
        this.username=username;
    }
}
