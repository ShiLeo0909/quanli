package invoiceItem1_5;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    public InvoiceItem(String id , String desc , int qty , double unitPrice){
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    public double getTotal(){
        return unitPrice * qty;
    }
    public String toString(){
        return "InvoiceItem[id="+ id +",desc=" + desc +",qty=" + qty + ",unitPrice=" + unitPrice +"]";
    }
}
