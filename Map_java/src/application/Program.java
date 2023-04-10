package application;

import java.util.HashMap;
import java.util.Map;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Map<Product, Double> stock = new HashMap<>();
		
		Product p1 = new Product("Tv", 900.00);
		Product p2 = new Product("Smartphone", 1500.00);
		Product p3 = new Product("Tablet", 2000.00);
		
		stock.put(p1, 10000.0);
		stock.put(p2, 5000.0);
		stock.put(p3, 3000.0);
		
		Product ps = new Product("Tv", 900.00);
		
		System.out.println("Contais 'ps' key: "+ stock.containsKey(ps));
		
	}

}
