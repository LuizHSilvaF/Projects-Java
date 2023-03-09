package demo1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {
		
		//* na ordem em que são adicionados
		Set<String> set1 = new LinkedHashSet<>();
		set1.add("TV");
		set1.add("Notebook");
		set1.add("Tablet");
		

		// em ordem
		Set<String> set2 = new TreeSet<>();
		set2.add("TV");
		set2.add("Notebook");
		set2.add("Tablet");
		
		// não ordenados 
		Set<String> set3 = new HashSet<>();
		set3.add("TV");
		set3.add("Notebook");
		set3.add("Tablet");
		
		System.out.println(set1.contains("Notebook"));
		
		for (String p : set1) {
			System.out.println(p);
		}

	}

}
