package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entitites.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 80.0));
		list.add(new Product("Celular", 1000.0));
		list.add(new Product("Fone", 90.0));
		
		double min = 100;
		//Predicate<Product> pred = p -> p.getPrice() >= 100;
		
		list.removeIf(p -> p.getPrice() >= min);
		//list.removeIf(pred);
		//list.removeIf(Product::NonStaticProductPredicate);
		//list.removeIf(Product::StaticProductPredicate);
		//list.removeIf(new ProductPredicate());
	
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
