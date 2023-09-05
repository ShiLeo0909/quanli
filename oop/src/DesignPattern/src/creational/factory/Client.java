package creational.factory;

public class Client {
    public static void main(String[] args) {
        creational.factory.Bank bank = creational.factory.BankFactory.getBank(creational.factory.BankType.TPBANK);
        System.out.println(bank.getBankName()); // TPBank
    }
}
