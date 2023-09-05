package oop11.iterrator;

public class ProductCatalog implements Iterable{
    private String [] productCatalog = {"Robert" , "John" ,"Julie" , "Lora"};

    @Override
    public Iterator getIterator() {
        return new Productlterator();
    }
    private class Productlterator implements Iterator{
        int index;
        @Override
        public boolean hasNext() {
            if(index < productCatalog.length ) {
                return true;
            }
            return false;
        }

        @Override
        public Object nex() {
            if(this.hasNext()){
                return productCatalog[index++];
            }
            return null;
        }
    }
}
