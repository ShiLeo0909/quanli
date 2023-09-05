package QuanLiSach;

import QuanLiSach.Book;

public class ReferenceBook extends Book {
    private double tax;
	public ReferenceBook(String id, String name, int quantity, String publisher, double price) {
		super(id, name, quantity, publisher, price);
        this.tax=tax;
		// TODO Auto-generated constructor stub
	}
	
	public ReferenceBook(String id, String name, int quantity, String publisher, double price,
			double tax) {
	
	}

	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		//super la tim yoi hamf cha 
		// this la tim hamf dung trong class
        return getPrice() *getQuantity() + tax;
	}

	@Override
	public String toString() {
		return "QuanLiSach.ReferenceBook [tax=" + tax + ", getId()=" + getId() + ", getName()=" + getName() + ", getQuantity()="
				+ getQuantity() + ", getPublisher()=" + getPublisher() + ", getPrice()=" + getPrice()+ ", getAmount()=" + getAmount() +  "]";
	}
}
