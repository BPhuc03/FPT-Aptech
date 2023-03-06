package Secssion2_2;

import java.util.ArrayList;
import java.util.List;

public class SearchElementInArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jonh");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");
        names.add("John");
        names.add("Steve");
        names.add("Maria");

        System.out.println("Does names array contain \"Bob\"? : " + names.contains("Bob"));


        System.out.println("indexOf \"Steve\": " + names.indexOf("Steve"));
        System.out.println("indexOf \"Mark\": " + names.indexOf("Mark"));

        System.out.println("lastIndexOf \"John\": " + names.indexOf("John"));
        System.out.println("lastIndexOf \"Bill\": " + names.indexOf("Bill"));


    }
}
