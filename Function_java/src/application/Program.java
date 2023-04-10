package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.0));
		list.add(new Product("Mouse", 80.0));
		list.add(new Product("Celular", 1000.0));
		list.add(new Product("Fone", 90.0));
		
		Function<Product, String> func = p -> p.getName().toUpperCase();
		
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		//List<String> names = list.stream().map(func).collect(Collectors.toList());
		//List<String> names = list.stream().map(Product::NonstaticUpperCaseName).collect(Collectors.toList());
		//List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		names.forEach(System.out::println);

	}

}
