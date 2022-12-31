package projo;

public class Burger extends Item {

	public Burger(String name, int quantity, double price, double cost) {
		super(name, quantity, price, cost);
	}

	public void updateQuantity(int newQuantity) {
		this.quantity = quantity - newQuantity;
	}

	public double getCost() {
		return cost;
	}

	public String toString() {
		return "\nType: Burger, Product Name: " + name + ", Quantity: " + quantity + ", Price: " + price;
	}

}
