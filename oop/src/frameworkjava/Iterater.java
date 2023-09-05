package frameworkjava;

import java.util.*;

public class Iterater {
    //hasNext(): Phương thức này trả về giá trị boolean, cho biết collection còn phần tử tiếp theo hay không.
    //
    //next(): Phương thức này trả về phần tử tiếp theo trong collection.
    //
    //remove(): Phương thức này được sử dụng để loại bỏ phần tử hiện tại khỏi collection.
    //
    //forEachRemaining(Consumer<? super E> action): Phương thức này được sử dụng để lặp lại tất cả các phần tử còn lại trong collection và thực hiện hành động được chỉ định trong tham số Consumer.
    //
    //hasPrevious(): Phương thức này được sử dụng để kiểm tra xem collection có phần tử trước đó không.
    //
    //previous(): Phương thức này được sử dụng để lấy phần tử trước đó trong collection.
    //
    //nextIndex(): Phương thức này được sử dụng để trả về chỉ mục của phần tử tiếp theo trong collection.
    //
    //previousIndex(): Phương thức này được sử dụng để trả về chỉ mục của phần tử trước đó trong collection.
    public static void main(String[] args) {
        ArrayList listLanguages = new ArrayList(Arrays.asList("Java", "C", "C++", "Python", "Javascrip", "Java","Julia"));
        //Hien thi phan tu cua mang
        System.out.println("Danh sach ngon ngu lap trinh");
        Iterator itr = listLanguages.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element);
        }
        // Sua noi dung phan tu trong list
        ListIterator litr = listLanguages.listIterator();
        while (litr.hasNext()) {
            Object element = litr.next();
            litr.set(element + " Pass");
        }
        //Hien thi phan mang vua duoc sua
        System.out.println("Noi dung phan tu duoc sua trong listLanguages");
        itr = listLanguages.iterator();
        while(itr.hasNext()){
            Object element = itr.next();
            System.out.println(element);
        }
        System.out.println();
        // Hien thi phan tu theo thu tu nguowc lai
        System.out.println("Noi dung phan tu theo thu tu ngowc lai");
        while (litr.hasPrevious()){
            Object element = litr.previous();
            System.out.println(element);
        }
        System.out.println();
        // Xoa phan tu C
        litr = listLanguages.listIterator();
        while (litr.hasNext()){
            Object element = litr.next();
            if("C Pass".equals(element.toString())){
                litr.remove();
            }
        }
        System.out.println("Noi dung da duoc xoa cua listLanguages: ");
        itr = listLanguages.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.println(element);
        }
        System.out.println();
    }
}

