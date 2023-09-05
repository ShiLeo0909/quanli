package oop8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTest {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awaken", 8.3, 2015));
        list.add(new Movie(" Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi ", 8.4, 1983));

        Collections.sort(list);

        System.out.println("Movies after sorting");
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }

        SeclectionSort(list);

    }

    public static void SeclectionSort(List<Movie> list) {
        for (int i = 1; i < list.size(); i++) {
            int min = i;
            for (int j = i + 1; j < list.size() - 1; j++) {
                if (list.get(j).getYear() < list.get(i).getYear()) {
                    min = j;
                }
                Movie temp = list.get(i);
                list.set(i, list.get(min));
                list.set(min, temp);
            }
        }

        System.out.println("Movies after Seclection sort");
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());

        }
    }
}
