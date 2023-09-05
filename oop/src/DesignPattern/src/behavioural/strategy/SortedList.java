package behavioural.strategy;

import java.util.ArrayList;
import java.util.List;

public class SortedList {
   private List<String> items = new ArrayList<>();
   private behavioural.strategy.SortStrategy sortStrategy;

   public void setSortStrategy(behavioural.strategy.SortStrategy sortStrategy){
       this.sortStrategy = sortStrategy;
   }
   public void add(String name ){
       items.add(name);
   }
   public void sort(){
       sortStrategy.sort(items);
   }
}
