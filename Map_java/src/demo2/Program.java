package demo2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		
		
		Map<String, String> cookies = new LinkedHashMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "13-991999124");
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());
		System.out.println("ALL COOKIES:");
		
		for (String key : cookies.keySet()) {
		System.out.println(key + ": " + cookies.get(key));
		}
		

	}

}
