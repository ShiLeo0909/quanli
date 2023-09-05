package cutomer2_4;

public class Customer {
    private int id;
    private String name ;
    private int discount;

    public Customer(int id , String name , int discount){
        this.id = id ;
        this.name = name;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getDiscount() {
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public String toString(){
        return "Name= " + name +",id = " + id + ",discount = " + discount + "%";
    }
}
