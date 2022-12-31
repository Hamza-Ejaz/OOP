package projo;

import java.util.ArrayList;

public class Inventory {
	public ArrayList<Item> item = new ArrayList<>();
	public ArrayList<Order> order = new ArrayList<>();

	public void addInventory(Item i) {
		item.add(i);
	}

	public String getInventory() {
		return item.toString();
	}

	public void removeInventory(Order order) {
		item.remove(order);
	}

	public void addInventory(Order o) {
		order.add(o);
	}

	public String getOrder() {
		return order.toString();
	}

	public String toString() {
		return "\nTotal Inventory is " + item.toString();
	}
}
