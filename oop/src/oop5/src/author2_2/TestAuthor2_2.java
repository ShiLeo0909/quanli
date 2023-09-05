package author2_2;

public class TestAuthor2_2 {
    public static void main(String[] args) {
        Author [] author = new Author[2];
        author[0] = new Author ("Tan Ah Teck" , "AhTeck@someWhere.com", 'm');
        author[1] = new Author("Paul Tau" , "Paul@nowhere.com" , 'm');

        Book javaDummy = new Book("Java for Dummy" , author , 19.99 , 99);
        System.out.println(javaDummy);
    }
}
