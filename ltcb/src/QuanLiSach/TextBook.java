package QuanLiSach;

import QuanLiSach.Book;

public class TextBook extends Book {

	private boolean status;

	public TextBook(String id, String name, int quantity, String publisher, double price, boolean status) {
		super(id, name, quantity, publisher, price);
		this.status=status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public double getAmount() {
		// TODO Auto-generated method stub
		if (status == true){
			return getPrice() * getQuantity();
		
		}else{
			return getPrice() * getQuantity() *50 / 100;
		}
	}

	@Override
	public String toString() {
		return "QuanLiSach.TextBook [status=" + status + ", getId()=" + getId() + ", getName()=" + getName() + ", getQuantity()="
				+ getQuantity() + ", getPublisher()=" + getPublisher() + ", getPrice()=" + getPrice() + ", getAmount()="
				+ getAmount() + "]";
	}
}
