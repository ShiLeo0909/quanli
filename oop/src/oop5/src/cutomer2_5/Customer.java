package cutomer2_5;

public class Customer {
    private int id;
    private String name;
    private char gender;

    public Customer(int id , String name , char gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    public String toString(){
        return  name +"("+ id +")";
    }
}
