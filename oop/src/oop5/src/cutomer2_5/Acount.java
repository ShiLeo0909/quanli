package cutomer2_5;

public class Acount {
    private int id;
    private Customer customer;
    private double balance = 0.0;

    public Acount(int id , Customer customer , double balance){
        this.id = id ;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public Acount deposit ( double amount){
        double  balance = getBalance() + amount;
       return new Acount(getId() , getCustomer() , balance);
    }
    public Acount withdraw(double amount){
        if(balance >= amount ){
            balance = balance -amount;
        }else{
            System.out.println("amount withdraw exceeds the current balance!");
        }
        return new Acount(getId() , getCustomer() , balance);
    }
    public String toString() {
        double balance1 = Math.round((balance*100.0)/100);
        return customer.toString() + " " + balance1;
    }
}
