package bank;

public class TestAccount {
    public static void main(String[] args) {
        Account<String> account = new Account<>("1234", "Leo", "0384148005", "male");
        System.out.println("Name acccount :" + account.getName() );

        Account<Integer> account1 = new Account<>(0, 0, 0, 0);
        System.out.println("Name acccount1 :" + account1.getName() );

        Account<Double> account2 = new Account<>(2.0, 2.0, 2.0, 2.0);
        System.out.println("Name acccount2 :" + account2.getName() );
    }
}
