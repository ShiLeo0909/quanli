package invoiceItem1_5;

public class TestInvoiceItem {
    public static void main(String[] args) {
        InvoiceItem invoice1 = new InvoiceItem( "A101" , "" +
                "Pen Red" , 888 , 0.09);
        System.out.println(invoice1.toString());
        invoice1.setQty(999);
        invoice1.setUnitPrice(0.99);
        System.out.println(invoice1);
        System.out.println(invoice1.getId());
        System.out.println(invoice1.getDesc());
        System.out.println(invoice1.getQty());
        System.out.println(invoice1.getUnitPrice());
        System.out.println(invoice1.getTotal());
    }
}
