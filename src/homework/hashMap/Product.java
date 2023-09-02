package homework.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Product {

	private String productName;
	private double price;
	
	public Product(String name, double price) {
		this.productName = name;
		this.price = price;
	}
	
	public static void main(String[] args) {
		
		Map<String , Double> productMap = new HashMap<>();
		
		Product product1= new Product("Matte Lipstick", 20000);
		Product product2= new Product("Gloss Lipstick", 25000);
		Product product3= new Product("Foundation", 40000);
		Product product4= new Product("Mascara", 20000);
		
		productMap.put(product1.getProductName(), product1.getPrice());
		productMap.put(product2.getProductName(), product2.getPrice());
		productMap.put(product3.getProductName(), product3.getPrice());
		productMap.put(product4.getProductName(), product4.getPrice());
		
		double totalPrice = caculateTotalPrice(productMap);
		System.out.println("The total price = " + totalPrice);
		
	}
	
	public static double caculateTotalPrice(Map<String, Double> productMap) {
		double result=0.0;
		
	 //productMap.forEach((name, price)-> result += price);
	 
	 for(Map.Entry<String, Double> pm : productMap.entrySet()) {
		 result += pm.getValue();
	 }
		
		return result;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
