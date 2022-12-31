package projo;

public class SoftDrinks extends Item {

	public SoftDrinks(String name, int quantity, double price, double cost) {
		super(name, quantity, price, cost);
	}

	public void updateQuantity(int newQuantity) {
		this.quantity = quantity - newQuantity;
	}

	public double getCost() {
		return cost;
	}

	public String toString() {
		return "\nType: SoftDrinks, Product Name: " + name + ", Quantity: " + quantity + ", Price: " + price;
	}

}
