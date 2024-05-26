package ex_May_21_abstract_inharitance;

public class lab0127 {
    public static void main(String[] args) {

        viithiisys4 v4 = new viithiisys4();
        v4.mst();

        viithiisys2 v2 = new viithiisys2();
        v2.employee();
    }
}
    class viithiisys4 extends viithiisys1{

        @Override
        public void mst() {
            System.out.println("full stack developer");

        }
    }
    class viithiisys2 extends viithiisys3 {

        @Override
        void employee() {
            System.out.println("number of employee");

        }
    }

      abstract class viithiisys1 implements viithiisys{

    }

        interface viithiisys{
           abstract void mst();
        }
        abstract class viithiisys3 {
            abstract void employee();
        }
