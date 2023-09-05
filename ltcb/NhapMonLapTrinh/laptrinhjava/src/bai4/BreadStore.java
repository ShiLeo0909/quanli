package bai4;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class BreadStore {
    private List<Bread> breads;

    public BreadStore() {
        breads = new LinkedList<>();
    }

    /**
     * Giả sử bánh mỳ được làm không cho một loại gia vị nhiều hơn một lần.
     * Bắt đầu, tạo ra và cho vào cửa hàng:
     * 5 bánh mỳ ThickcrustBread chỉ có cheese,
     * 5 bánh mỳ ThickcrustBread chỉ có olives,
     * 5 bánh mỳ ThickcrustBread có cả cheese và olives,
     * 5 bánh mỳ ThincrustBread chỉ có cheese,
     * 5 bánh mỳ ThincrustBread chỉ có olives,
     * 5 bánh mỳ ThincrustBread có cả cheese và olives.
     */
    public void init() {
        /* TODO */
        // 5 bánh mì ThickcrusBread chỉ có cheese
        for (int i = 0; i < 5; i++) {
            breads.add(new Cheese(new ThickcrustBread()));
        }
        for (int i = 0; i < 5; i++) {
            breads.add(new Olives(new ThickcrustBread()));
        }
        for (int i = 0; i < 5; i++) {
            breads.add(new Cheese(new Olives(new ThickcrustBread())));
        }
        for (int i = 0; i < 5; i++) {
            breads.add(new Cheese(new ThincrustBread()));
        }
        for (int i = 0; i < 5; i++) {
            breads.add(new Olives(new ThincrustBread()));
        }
        for (int i = 0; i < 5; i++) {
            breads.add(new Cheese(new Olives(new ThincrustBread())));
        }
    }

    /**
     * Thêm bánh mỳ vào cửa hàng.
     */
    public void add(Bread bread) {
        /* TODO */
        breads.add(bread);
    }

    /**
     * Giả sử cửa hàng bán một cái bánh mỳ nào đó,
     * Bánh mỳ được lấy ra để bán là bánh mỳ đầu tiên có giá bằng giá
     * bánh mỳ yêu cầu.
     * Nếu còn bánh mỳ để bán thì trả về giá trị true,
     * nếu không còn trả về giá trị false.
     */
    public boolean sell(Bread bread) {
        /* TODO */
        for (int i = 0; i < breads.size(); i++) {
            if (breads.get(i).getDescription().equals(bread.getDescription())){
                breads.remove(i);
                return true;
            }
        }
        return false;
    }

    /**
     * In ra những bánh mỳ còn trong cửa hàng.
     */
    public void print() {
        /* TODO */
        for (int i = 0; i < breads.size(); i++) {
            System.out.println(breads.get(i).getDescription() + " " + breads.get(i).cost());
        }
    }

    /**
     * Sắp xếp các bánh mỳ còn lại theo thứ tự được cho bởi order,
     * nếu order là true, sắp xếp theo thứ tự tăng dần,
     * nếu order là false, sắp xếp theo thứ tự giảm dần.
     * Việc sắp xếp không làm thay đổi thứ tự của bánh mỳ trong cửa hàng.
     */
    public List<Bread> sort(boolean order) {
        /* TODO */
        List<Bread> breadSort = new LinkedList<>();
        breadSort.addAll(breads);
        for (int i = 0; i < breadSort.size()-1 ; i++) {
            for (int j = i +1; j < breadSort.size() ; j++) {
                if(breadSort.get(i).cost() > breadSort.get(j).cost()){
                    Bread temp = breadSort.get(i);
                    breadSort.set(i , breadSort.get(j));
                    breadSort.set(j , temp);
                }
            }
        }
        if(order){
            return breadSort;
        }else{
            Collections.reverse(breadSort);
            return breadSort;
        }
    }

    /**
     * Lọc ra howMany cái bánh mỳ có giá cao nhất hoặc thấp nhất,
     * nếu order là true thì lọc ra bánh mỳ có giá cao nhất,
     * nếu order là false thì lọc ra bánh mỳ có giá thấp nhất.
     */
    public List<Bread> filter(int howMany, boolean order) {
        /* TODO */
        List<Bread> bread1 = new LinkedList<>();
        List<Bread> bread2 = sort(order);
        for (int i = 0; i < howMany; i++){
            bread1.add(bread2.get(i));
        }
        return bread1;
    }

    public static void main(String args[]) {
        BreadStore breadStore = new BreadStore();
        breadStore.init();

        /*
         * Sau khi khởi tạo số bánh mỳ cho cửa hàng, viết chương trình demo:
         * - Thêm một số bánh mỳ vào cửa hàng
         * - Bán một số bánh mỳ từ cửa hàng
         * - In ra số bánh mỳ còn lại theo thứ tự giá tăng dần.
         * - In ra nhiều nhất 10 cái bánh mỳ có giá thấp nhất còn trong cửa hàng.
         */
        /* TODO */
        Bread bread = new Cheese(new ThickcrustBread());
        breadStore.add(bread);
        System.out.println("Vừa Thêm--------");
        breadStore.print();
        breadStore.sell(bread);
        System.out.println("Vừa Bán---------");
        breadStore.print();
        System.out.println("Vua SX--------");
        List<Bread> breadSort = breadStore.sort(true);
        BreadStore breadStore1 = new BreadStore();
        for (int i = 0; i < breadSort.size(); i++) {
            breadStore1.add(breadSort.get(i));
        }
        breadStore1.print();

        System.out.println("-----");
        List<Bread> breadFilter = breadStore.filter(3, true);
        BreadStore breadStore2 = new BreadStore();
        for (int i = 0; i < breadFilter.size(); i++) {
            breadStore2.add(breadFilter.get(i));
        }
        breadStore2.print();
    }
}



