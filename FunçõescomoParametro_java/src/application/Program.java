package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product;
import util.ProductService;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 80.0));
		list.add(new Product("Tablet", 1000.0));
		list.add(new Product("Fone", 90.0));
		
		ProductService ps = new ProductService();
		
		double sum = ps.filteredSum(list, p -> p.getName().charAt(0)== 'T');
		
		System.out.println("Sum = "+String.format("%.2f", sum));

	}

}
