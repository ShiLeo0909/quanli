package cutomer2_5;

public class TestMain {
    public static void main(String[] args) {
        Customer customer1 = new Customer(12345, "Vi", 'f');
        Acount account1 = new Acount(987, customer1, 50.569);
        System.out.println(account1);
        System.out.println("id is: " + account1.getId());
        System.out.println("customer is: " + account1.getCustomer());
        System.out.println("balance is: " + account1.getBalance());
        System.out.println("balance after deposit: " + account1.deposit(15.2));
        System.out.println("balance after withdraw is: " + account1.withdraw(25.1));
    }
}
