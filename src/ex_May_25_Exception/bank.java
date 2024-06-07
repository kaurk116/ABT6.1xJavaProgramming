/* package ex_May_25_Exception;

public class bank{
      private String currency;
     private  Integer amount;

    public bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }
}
public Integer add(bank bankname) throws Exception{
      Integer sum = this.amount + bankname.amount;
    if (!bankname.currency.equalsIgnoreCase("INR")){
        throw new Exception("CURRENCY NOT MATCH");
    }
    Integer sum;
   sum = this.amount + bankname.amount;
    return sum;
    }



    public  Integer add1(bank bankname1) {
    try{
        if (!bankname1.currency.equalsIgnoreCase("INR")) {
            throw new Exception("CURRENCY NOT MATCH");
        }
     }catch (Exception e){
    throw new RuntimeException(e);
    }
    Integer sum =this.amount + bankname1.amount;
    return sum;
    } */
