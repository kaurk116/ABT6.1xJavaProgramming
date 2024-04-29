package exApril_27;

public class lab0066 {
    public static void main(String[] args) {
        //Program to create mani example of loop
        for (int i = 0; i <10; i=i+1) {//same as i++
            System.out.println(i);
            for (int j = 0; j <10 ; j=j*2) {  //i=1 1*2
                System.out.println(j);
                for (int k = 10; k <0 ; k--) {
                    System.out.println(k);
                    for (int l = 1; l <10 ; l=l/2) {
                        System.out.println(l);



                    }

                }


            }

        }
    }
}
