package projo;

import java.util.ArrayList;

public class Order {
	public String ProductName;
	public double orderTotal;
	public ArrayList<Item> orderItems = new ArrayList<>();
	public double tax;

	public Order() {
	}

	public void addItem(Item item) {
		orderItems.add(item);
	}

	public void clearItem() {
		orderItems.clear();
	}

	public void removeItem(Item item) {
		orderItems.remove(item);
	}

	public double getTax() {
		return orderTotal * 0.14;
	}

	public void addTip() {
		orderTotal += 5;
	}

	public String toString() {
		return "\nOrder Total is " + (orderTotal + getTax()) + " Tax is " + getTax() + "\nTotal Items are "
				+ orderItems.toString();
	}
}