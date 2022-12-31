/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projo;

import java.util.Scanner;

/**
 *
 * @authors Osama, Khizer, Hamza
 */
public class Projo {

	public static void lgbill(double amt, int pqty, String pname) {
		double totalAmt = amt + (amt * 0.14);
		System.out.println();
		System.out.println("----------- YOUR BILL -----------");
		System.out.println("You have ordered: " + pname);
		System.out.println("Quantity: " + pqty);
		System.out.println("Amount (Rs.): " + amt);
		System.out.println("Tax (Rs.): " + amt * 0.14);
		System.out.println("Total Amount to pay (Rs.): " + totalAmt);
		System.out.println("---------------------------------");
		System.out.println();
	}
	
	public static void smbill(int pqty, String pname) {
		System.out.println();
		System.out.println("----------- YOUR ORDER -----------");
		System.out.println("You have ordered: " + pname);
		System.out.println("Quantity: " + pqty);
		System.out.println("----------------------------------");
		System.out.println();
	}
	
	public static void revenue(double amount) {
		double amt = amount + (amount * 0.14);
		System.out.println();
		System.out.println("----------- REVENUE -----------");
		System.out.println("Total Revenue (Rs.): " + amt);
		System.out.println("-------------------------------");
		System.out.println();
	}
	
	public static void showTip(int amount) {
		System.out.println();
		System.out.println("------ Total Tip Collected ------");
		System.out.println("Amount (Rs.): " + amount);
		System.out.println("----------------------------------");
		System.out.println();
	}
	
	public static void main(String[] args) throws Exception {
		
		editMenu menu = new editMenu();
		editOrder orders = new editOrder();
		Inventory inventory = new Inventory();
		Order order = new Order();
		//
		double amt = 0;
		double tamt = 0;
		String pname = "";
		int pqty = 0;
		int tipAmt = 0;
		
		Scanner input = new Scanner(System.in);
		double profit = 0;
		double revenue = 0;
		boolean flag = true;
		String answer = "yes";

		System.out.println("\t\t\t\t--------------------------------------------");
		System.out.println("\t\t\t\t******* WELCOME TO KING BURGER SHOP *******");
		System.out.println("\t\t\t\t--------------------------------------------");
		System.out.println();
		System.out.println("Press 1 for Employee and 2 for Customer");

		int login = input.nextInt();

		do {
			while (login == 1) {
				do {
					System.out.println("ans 1: Add Inventory");
					System.out.println("ans 2: Show Inventory");
					System.out.println("ans 3: Show Orders");
					System.out.println("ans 4: Show Total revenue");
					System.out.println("ans 5: Show Total profit");
					System.out.println("ans 6: Show Total Tip");
					int ans = input.nextInt();

					if (ans == 1) {
						System.out.println("Add Items From The Following");
						System.out.println("1- Burger");
						System.out.println("2- Fries");
						System.out.println("3- SoftDrinks");
						int resp = input.nextInt();

						if (resp == 1) {
							System.out.println("---Add Burger---");
							System.out.print("Enter name: ");
							String name = input.next();
							System.out.print("Enter quantity: ");
							int quantity = input.nextInt();
							System.out.print("Enter Price per unit: ");
							double price = input.nextDouble();
							System.out.print("Enter Cost per unit: ");
							double cost = input.nextDouble();
							//

							Item product = new Burger(name, quantity, price, cost);
							inventory.addInventory(product);
							menu.addItem("Burger", name, quantity, cost, price);
						} else if (resp == 2) {
							System.out.println("---Add Fries---");
							System.out.print("Enter name: ");
							String name = input.next();
							System.out.print("Enter quantity: ");
							int quantity = input.nextInt();
							System.out.print("Enter Price per unit: ");
							double price = input.nextDouble();
							System.out.print("Enter Cost per unit: ");
							double cost = input.nextDouble();
							Item product = new Fries(name, quantity, price, cost);
							inventory.addInventory(product);
							menu.addItem("Fries", name, quantity, cost, price);
						} else if (resp == 3) {
							System.out.println("---SoftDrinks---");
							System.out.print("Enter name: ");
							String name = input.next();
							System.out.print("Enter quantity: ");
							int quantity = input.nextInt();
							System.out.print("Enter Price per unit: ");
							double price = input.nextDouble();
							System.out.print("Enter Cost per unit: ");
							double cost = input.nextDouble();
							Item product = new SoftDrinks(name, quantity, price, cost);
							inventory.addInventory(product);
							menu.addItem("SoftDrinks", name, quantity, cost, price);
						}
					} else if (ans == 2) {
						// System.out.println(inventory);
						System.out.println("------Burgers------");
						menu.readItem("Burger");
						System.out.println();
						System.out.println("------Fries------");
						menu.readItem("Fries");
						System.out.println();
						System.out.println("------SoftDrinks------");
						menu.readItem("SoftDrinks");
						System.out.println();
					}

					else if (ans == 3) {
						System.out.println(order);
						System.out.println("------Burgers------");
						orders.readOrder("Burger");
						System.out.println();
						System.out.println("------Fries------");
						orders.readOrder("Fries");
						System.out.println();
						System.out.println("------SoftDrinks------");
						orders.readOrder("SoftDrinks");
						System.out.println();
					}

					else if (ans == 4) {
//						System.out.println("Total revenue is " + revenue);
						revenue(tamt);
					}

					else if (ans == 5) {
						System.out.println();
						System.out.println("----------- PROFIT -----------");
						System.out.println("Total Profit (Rs.): " + profit);
						System.out.println("-------------------------------");
						System.out.println();
					}
					
					else if (ans == 6) {
						showTip(tipAmt);
					}

					System.out.println("Would you like to perform any other task?");
					answer = input.next();

				} while (answer.contains("yes"));
// do while ends

				System.out.println("Press 1 for Employee and 2 for customer and any other number to exit");
				login = input.nextInt();

				if (login != 1 && login != 2) {
					flag = false;
				}

			}

			while (login == 2 && flag == true) {
//				System.out.println("What is your name?");
				String customer = "abc";
//				pname = customer;
//				System.out.println("How many tables?");
				int table = 5;
				TicketCounter ticketCounter = new TicketCounter();
				Booking t1 = new Booking(ticketCounter, customer, table);
//				t1.run();
				flag = ticketCounter.check();
				if (flag == true) {			//If seats available n
					do {
						System.out.println("ans 1: Add Order");
						System.out.println("ans 2: Show Bill");
						int ans = input.nextInt();

						if (ans == 1) {
							boolean invalid = true;
							do {

								System.out.println("Choose what to add in your cart from the following: ");
								System.out.println(inventory);
								System.out.print("Enter name: ");
								String name = input.next();
								pname = name;
								for (int i = 0; i < inventory.item.size(); i++) {
									if (inventory.item.get(i).name.equals(name)) {
										invalid = false;
										System.out.print("Enter Quantity: ");
										int quantity = input.nextInt();
										pqty = quantity;
										if (inventory.item.get(i) instanceof Burger) {
											while (quantity > inventory.item.get(i).quantity) {
												System.err.println(
														"You have chosen an invalid quantity, please input a correct one.");
												System.out.print("Enter quantity: ");
												quantity = input.nextInt();

											}

											order.addItem(new Burger(name, quantity, inventory.item.get(i).price,
													inventory.item.get(i).cost));
											inventory.item.get(i).updateQuantity(quantity);
											order.orderTotal = order.orderTotal
													+ (inventory.item.get(i).price * quantity);
											//Filing
											orders.addOrder("Burger", name, quantity);
//											revenue = revenue + order.orderTotal;
											profit = profit + ((inventory.item.get(i).price * quantity)
													- (inventory.item.get(i).cost * quantity));
											inventory.removeInventory(order);
											amt = inventory.item.get(i).price * quantity;
											tamt = tamt + (inventory.item.get(i).price * quantity);
											System.out.println("added to cart");
										}

										else if (inventory.item.get(i) instanceof Fries) {

											while (quantity > inventory.item.get(i).quantity) {
												System.err.println(
														"You have chosen an invalid quantity, please input a correct one.");
												System.out.print("Enter quantity: ");
												quantity = input.nextInt();

											}

											order.addItem(new Fries(name, quantity, inventory.item.get(i).price,
													inventory.item.get(i).cost));
											inventory.item.get(i).updateQuantity(quantity);
											order.orderTotal = order.orderTotal
													+ (inventory.item.get(i).price * quantity);
											//Filing
											orders.addOrder("Fries", name, quantity);
//											revenue = revenue + order.orderTotal;
											profit = profit + ((inventory.item.get(i).price * quantity)
													- (inventory.item.get(i).cost * quantity));
											inventory.removeInventory(order);
											amt = inventory.item.get(i).price * quantity;
											tamt = tamt + (inventory.item.get(i).price * quantity);
											System.out.println("added to cart");
										} else if (inventory.item.get(i) instanceof SoftDrinks) {

											while (quantity > inventory.item.get(i).quantity) {
												System.err.println(
														"You have chosen an invalid quantity, please input a correct one.");
												System.out.print("Enter quantity: ");
												quantity = input.nextInt();
											}

											order.addItem(new SoftDrinks(name, quantity, inventory.item.get(i).price,
													inventory.item.get(i).cost));
											inventory.item.get(i).updateQuantity(quantity);
											order.orderTotal = order.orderTotal
													+ (inventory.item.get(i).price * quantity);
											//Filing
											orders.addOrder("SoftDrinks", name, quantity);
//											revenue = revenue + order.orderTotal;
											profit = profit + ((inventory.item.get(i).price * quantity)
													- (inventory.item.get(i).cost * quantity));
											inventory.removeInventory(order);
											amt = inventory.item.get(i).price * quantity;
											tamt = tamt + (inventory.item.get(i).price * quantity);
											System.out.println("added to cart");
										}

									}

								}
								if (invalid) {
									System.err.println("Name not Found");
									continue;
								}
							} while (invalid == true);

							System.out.println("Would you like to give $5 tip?");
							String tip = input.next();
							if (tip.contains("yes")) {
								order.addTip();
								tipAmt = tipAmt + 5;
							}
//							System.out.println("Your Order :");
//							System.out.println("-------------------");
//							System.out.println(order);
							smbill(pqty, pname);
							
						} else if (ans == 2) {
//							System.out.println(order);
							if(amt==0) {
								System.out.println("You have no orders");
							}else {
								lgbill(amt, pqty, pname);
							}
						}
						System.out.println("Would you like to perform any other task?");
						answer = input.next();
					} while (answer.contains("yes"));
					order.clearItem();

					System.out.println("Press 1 for Employee and 2 for customer and any other number to exit");
					login = input.nextInt();
					if (login != 1 && login != 2) {
						flag = false;
					}
				}
			}
		} while (flag == true);
		System.out.println("Have a good day");
	}
}
