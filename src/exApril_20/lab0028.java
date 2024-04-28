package exApril_20;

public class lab0028 {
    public static void main (String[] args){
        String password = "Karam@1990";
        String password1 = password.toLowerCase();
        System.out.println(password == password1);
        System.out.println(password.equals(password1));
        System.out.println(password.equalsIgnoreCase(password1));
        char c= password.charAt(2);
        System.out.println(c);
        boolean d = password.contains("r");
        System.out.println(d);


    }
}
