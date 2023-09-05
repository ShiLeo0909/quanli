package oop11.iterrator;

public class Client {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();

        for (Iterator iter = catalog.getIterator();iter.hasNext();) {
            String name = (String)iter.nex();
            System.out.println("Name : " + name);
        }
    }
}
