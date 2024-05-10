package ex_May_4;

public class lab0090 {
    public static void main(String[] args) {
        //Program to print the string with String bilder and String buffer
        //String buffer is thread control //slower
        //String bulder is not thread control //faster
        String s1 ="karamjeet";
        String s2 =new String("kaur");

        StringBuffer stringBuffer= new StringBuffer("karamjeet");
        stringBuffer.append("kaur");

        StringBuilder stringBuilder=new StringBuilder("Aakash");
        stringBuilder.append("saini");

        StringBuilder stringBuilder1=new StringBuilder("Anavin");
        stringBuilder1.append("saini");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuilder1);
    }
}
