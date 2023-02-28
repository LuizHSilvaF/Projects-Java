package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Luiz");
		list.add("Ana");
		list.add("Rita");
		list.add("Luiza");
		list.add(2,"joão");
		
		System.out.println(list.size());
;		for (String x : list)
		{
			System.out.println(x);
		}

		System.out.println("----------------------");
		list.removeIf(x -> x.charAt(0)== 'M');
		for (String x : list)
		{
			System.out.println(x);
		}
		System.out.println("----------------------");
		System.out.println("Index of Luiz: " + list.indexOf("Luiz"));
		System.out.println("Maria: "+ list.indexOf("Maria"));
		System.out.println("----------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0)== 'L').collect(Collectors.toList());
		for (String x : result)
		{
			System.out.println(x);
		}
		System.out.println("----------------------");
		String nome = list.stream().filter(x -> x.charAt(0)== 'R').findFirst().orElse(null);
		
			System.out.println(nome);
		
		
	}

}
