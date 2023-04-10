package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 80.0));
		list.add(new Product("Celular", 1000.0));
		list.add(new Product("Fone", 90.0));
		
		double factor = 1.1;
		
		//Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
		
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
		//list.forEach(cons);
		//list.forEach(Product::NonstaticPriceUpdate);
		//list.forEach(Product::staticPriceUpdate);
		//list.forEach(new PriceUpdate());
		
		list.forEach(System.out::println);
	}

}
