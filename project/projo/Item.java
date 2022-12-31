package projo;

public class Item {
	public String name;
	public double price;
	public double cost;
	public int quantity;

	public Item() {
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getCost() {
		return cost;
	}

	public Item(String name, int quantity, double price, double cost) {
		this.name = name;
		this.price = price;
		this.cost = cost;
		this.quantity = quantity;
	}

	public void setquantity(int quantity) {
		this.quantity = quantity;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getquantity() {
		return quantity;
	}

	public double getPrice() {
		return price;
	}

	public void updateQuantity(int newQuantity) {
		this.quantity = quantity - newQuantity;
	}

	public String toString() {
		return "The Product is: " + name + " total Quantity " + getquantity() + " total price is " + getPrice();
	}
}
