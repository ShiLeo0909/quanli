package QuanLiSach;
import java.util.ArrayList;
import java.util.Scanner;

public class BookManagement {
    /* Thứ tự nhập
        +) Số lượng các cuốn sách

        +) 1 số nguyên 0 hoặc 1 (nếu 0 là sách tham khảo, 1 là sách giáo khoa)

        +)  id (mã sách), name (tên sách), quantity (số lượng), publisher (NXB), price (giá)

        +)  status (trạng thái) với sách giáo khoa,  tax (thuế) đối với sách tham khảo.
    */
	public Book[] readData(Scanner sc) {
		int n = sc.nextInt();
        double tax;
        boolean status;
		QuanLiSach.Book [] books = new QuanLiSach.Book [n];
		for(int i = 0 ; i < n ; i++){
		    int type = sc.nextInt();
		    sc.nextLine();
		    String id = sc.nextLine();
		    String name = sc.nextLine();
		    int quantity = sc.nextInt();
            sc.nextLine();
            String publisher = sc.nextLine();
            Double price = sc.nextDouble();
		    if (type == 0){
		         tax = sc.nextDouble();
		        books[i] = new ReferenceBook(id, name, quantity, publisher, price,tax);

		    }else if (type == 1){
		         status = sc.nextBoolean();
		        books[i] = new TextBook(id, name, quantity, publisher,price,status );
		    }
		}
		return books;
	}
    // In thong tin các cuốn sách
	public void printBooks(Book[] books) {
		for(QuanLiSach.Book c : books){
			System.out.println(c);
		}

	}
    // Tìm các cuốn sách của nhà xuất bản publisher
	public ArrayList<Book> findBooks(Book[] books, String publisher) {
	    ArrayList<Book> list = new ArrayList<>();
	    for(int i =0 ; i < books.length ;i++){
	        if(books[i].getPublisher().equals(publisher)){
	            list.add(books[i]);
	        }
	    }
		return list;

	}
    // Tính giá trị trung bình của các cuốn sách thuộc thể loại typeOfBooks
	public double computeAverage(Book[] books, String typeOfBooks) {
	    double sum = 0;
	    int count = 0;
	    for(Book c : books){
	        if(c.getClass().getName().equals(typeOfBooks)){
	            sum += c.getAmount();
	            count++;
	        }
	    }

        return sum/count;
	}
    // Sắp xếp các cuốn sách tăng dần về giá tiền
	public void sortByPrice(Book[] books) {
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = i + 1; j < books.length; j++) {
                if (books[i].getPrice() > books[j].getPrice()) {
                    Book tmp = books[j];
                    books[i] = books[j];
                    books[j] = tmp;

                }
            }
        }
    }
	public static void main(String[] args){
	    BookManagement bookManagement = new BookManagement();
	    Scanner sc = new Scanner(System.in);
            Scanner in;
            Book[] books = bookManagement.readData(sc);
        System.out.println("Read Data");
	    bookManagement.printBooks(books);
	    ArrayList<Book> arrayList = bookManagement.findBooks(books,"Nha Xuat Ban Giao Duc");
        System.out.println("Tim sach cua nxb giao duc : \n" + arrayList);
		//System.out.println("avg sgk" + bookManagement.computeAverage(books,);
        bookManagement.sortByPrice(books);
        bookManagement.printBooks(books);

    }
}