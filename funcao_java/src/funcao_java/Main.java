package funcao_java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("Digite 3 números para saber o maior deles");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int maior = max(a,b,c);
		showResult(maior);
		sc.close();
	}

	public static int max (int x, int y, int z)
	{
		int aux;
			if (x > y && x > z)
			{
				aux = x;
			}
			else if (y > z)
			{
				aux = y;
			}
			else
			{
				aux = z;
			}
			return aux;
	}
	
	public static void showResult(int value)
	{
		System.out.println("O maior é: "+value);
	}
	
}
