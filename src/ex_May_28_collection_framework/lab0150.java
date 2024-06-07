package ex_May_28_collection_framework;

import java.util.List;

public class lab0150 {
    public static void main(String[] args) {

        List shopping_list = List.of("milk", "bread", "suger");

        System.out.println(shopping_list);
        System.out.println(shopping_list.isEmpty());
        System.out.println(shopping_list.get(1));
        System.out.println(shopping_list.contains("milk"));
    }
}
