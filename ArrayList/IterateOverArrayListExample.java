package Secssion2_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverArrayListExample {

    public static void main(String[] args) {
        List <String> tvShows = new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game Of Thrones");
        tvShows.add("Friends");
        tvShows.add("Prision break");

        System.out.println("\n=== Iterate using an iterator() ===");
        Iterator<String> tvShowInterator = tvShows.iterator();
        while (tvShowInterator.hasNext()) {
            String tvShow = tvShowInterator.next();
            System.out.println(tvShow);

        }

        System.out.println("\n=== Iterate using a listIterator() to traverse in both directions ===");
        ListIterator<String> tvShowListIterator = tvShows.listIterator(tvShows.size());
        while (tvShowListIterator.hasPrevious()) {
            String tvShow = tvShowListIterator.previous();
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using simple for-each loop ===");
        for (String tvShow: tvShows) {
            System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using for loop with index ===");
        for (int i = 0;i < tvShows.size(); i++) {
            System.out.println(tvShows.get(i));
        }
    }
}
