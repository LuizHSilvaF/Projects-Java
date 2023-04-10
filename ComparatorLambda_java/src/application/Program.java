package application;

import java.util.ArrayList;
import java.util.List;

import entitites.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Celular", 1500.0));
		list.add(new Product("Tablet", 2000.0));
		
		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for(Product p : list) {
			System.out.println(p);
		}
		
	}

}
