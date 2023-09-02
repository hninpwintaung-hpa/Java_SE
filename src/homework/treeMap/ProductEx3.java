package homework.treeMap;

import java.util.Map;
import java.util.TreeMap;

public class ProductEx3 {
	public static void main(String[] args) {
		Map<String, Double> product = new TreeMap<>();
		
		product.put("Hair Dryer", 35000.0);
		product.put("Iron", 80000.0);
		product.put("Fan", 75000.0);
        
		double totalPrice = caculateTotalPrice(product);
		System.out.println("Total price :" + totalPrice);
	}

	public static double caculateTotalPrice(Map<String, Double> products) {
		double totalPrice = 0.0;
		for (Map.Entry<String, Double> product : products.entrySet()) {
			totalPrice += product.getValue();
		}
		return totalPrice;
	}
}
