package ex_May_Nested_class;

public class lab0133 {
    public static void main(String[] args) {
    car c =new car("issuz");
    car.engine engine = c.new engine("1500cc");c.new engine("2000cc");
    car.engine.gearbox gear= engine.new gearbox("ghair");
    gear.display();
    engine.starts();
    c.drive();

}
}

class car {
    String make;

    public car(String make) {
        this.make = make;
    }

    void drive (){
        System.out.println("drive a carr   ");
    }

    class engine{
        String housepower;

        public engine(String housepower) {
            this.housepower = housepower;
        }

        void  starts(){
            System.out.println("engine is starting   " +make);
        }

        class gearbox{
            String parts;

            public gearbox(String parts) {
                this.parts = parts;
            }
                void display(){
                    System.out.println("engine power is " +housepower+ "car" +make+ "garbox" +parts);
                }
            }


        }
    }
