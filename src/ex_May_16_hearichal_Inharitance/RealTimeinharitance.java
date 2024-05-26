package ex_May_16_hearichal_Inharitance;

public class RealTimeinharitance {
    public static void main(String[] args) {
        test1 t1 =new test1();
        t1.setBrowser("ff" , true);
        t1.getBrowser();
        t1.openbrowser();
    }

}
    class test1 extends baseclass {
        @Override
        public void setBrowser(String browser, boolean isaunth) {
            super.setBrowser(browser, isaunth);
        }
    }

    class baseclass {
        private String browser;

        void openbrowser() {
            System.out.println("open the browser");
        } //method

        void openbrowser(String browser) {
            this.browser = browser;
            System.out.println("chrome browser");
        }

        public String getBrowser() {
            return browser;
        }

        public void setBrowser(String browser, boolean isaunth) {
            if (isaunth) {
                this.browser = browser;
            } else {
                System.out.println("not allow");
            }

        }
    }



