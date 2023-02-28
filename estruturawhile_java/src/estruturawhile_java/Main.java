package estruturawhile_java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, soma;
		
		x = sc.nextInt();
		soma = 0;
		
		while(x != 0)
		{
			soma = soma + x;
			x = sc.nextInt();
		}
		
		sc.close();

	}

}
