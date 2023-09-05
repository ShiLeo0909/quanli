package cutomer2_4;

public class TestMain {
    public static void main(String[] args) {
        Customer customer = new Customer(88, "Tan Ah Teek" , 10);
        System.out.println(customer);
        customer.setDiscount(8);
        System.out.println(customer);
        System.out.println("id is :" + customer.getId());
        System.out.println("name  is :" + customer.getName());
        System.out.println("discount is :" + customer.getDiscount());

        Invoice invoice = new Invoice(101 , customer , 888.8);
        System.out.println(invoice);

        invoice.setAmount(999.9);
        System.out.println(invoice);
        System.out.println("id is :" + invoice.getId());
        System.out.println("cutomer is :" + invoice.getCustomer());
        System.out.println("amount is :" + invoice.getAmount());
        System.out.println("customer's id is :" + invoice.getCustomer().getId());
        System.out.println("customer's name is" + invoice.getCustomer().getName());
        System.out.println("customer's discount is" + invoice.getCustomer().getDiscount());
        System.out.printf("amount after discount is : %2f.%n" , invoice.getAmountAfterDiscount() );
    }
}
