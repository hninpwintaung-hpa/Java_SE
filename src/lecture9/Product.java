package lecture9;

import java.util.ArrayList;
import java.util.List;

public class Product {
	private String name;
	private double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<>();

		products.add(new Product("Matte Lipstick", 20000));
		products.add(new Product("Gloss Lipstick", 25000));
		products.add(new Product("Cushion", 20000));

		double total = calculateTotalPrice(products);
		System.out.println("Total price of all products: $" + total);
	

	}

	public static double calculateTotalPrice(ArrayList<Product> productList) {
		double total = 0.0;

		for (Product product : productList) {
			total += product.getPrice();
		}

		return total;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
