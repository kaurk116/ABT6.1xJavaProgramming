package ex_May_25_enum;

import static javax.swing.text.StyleConstants.Size;

public class lab0141 {
    public static void main(String[] args) {
        size t_shirt_size = size.LARGE;
        System.out.println("the size of t-shirt is" + t_shirt_size.getSize());

        for (size Size : size.values());
            System.out.println("size" + Size + "dscdcd" + size.values());
        }
    }

    enum size{
        SMALL("S"), MIDIUM("M"), LARGE("L"), EXLARGE("XL"), EXXLARGE("XXL");
        private String Size;


        size(String s) {
            this.Size = s;
        }

        public String getSize() {
            return Size;
        }

        public void setSize(String size) {
            Size = size;
        }
    }

