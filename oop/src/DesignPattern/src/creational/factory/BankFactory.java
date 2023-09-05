package creational.factory;

public class BankFactory {
    private BankFactory(){}

    public static final creational.factory.Bank getBank(creational.factory.BankType bankType){
        switch (bankType) {

            case TPBANK:
                return new creational.factory.TPBank();

            case VIETCOMBANK:
                return new creational.factory.VietcomBank();

            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
}
