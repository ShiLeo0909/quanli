package oop8;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {
    public int compare(Movie left , Movie right){
        if(left.getRating() < right.getRating()){
            return -1;
        }else if(left.getRating()> right.getRating()){
            return 1;
        }
        return 0;
    }
}
