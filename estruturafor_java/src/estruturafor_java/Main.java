package estruturafor_java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N, i = 0, x, soma = 0;
		
		N = sc.nextInt();
		for (x = 0; x < N; x++)
		{
			i = sc.nextInt();
			soma = soma + i ;
		}
		System.out.println(soma);
		sc.close();
	}

}
