package ex_May_7;

public class lab0107 {
    public static void main(String[] args) {
       //Program to  create function for all type of data type

        intf();  //calling function
        bytef();
        pief();
        stringf();
        String [] name ={"karam" ,"kaur" ,"Aakash" ,"saini"};
        System.out.println(intf());
    }

       //define function
        static int intf () {
            return 10;
    }

        static byte bytef () {
            return 127;
        }
        static double pief () {
            return 1.2;
        }
        static String stringf(){
            return "karamjeet";
        }
        static String [] name(){
        return name();
    }
    }