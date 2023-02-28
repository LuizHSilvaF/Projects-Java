package condicao_java;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double num;
		System.out.println("Digite um número");
		num = sc.nextDouble();
		if (num % 2 ==0)
		{
			System.out.println("Esse número é par");
		}
		else 
		{
			System.out.println("Esse número é ímpar");
		}
		
		
		System.out.println("Digite os minutos");
		int minutos = sc.nextInt();
		int conta = 50;
		if (minutos > 100)
		{
			conta =  conta + (minutos - 100)*2;
			System.out.println("O valor da conta mudou para: "+conta);
		}
		else
		{
			System.out.println("Valor padrão a ser pago!");
		}
		
		
		
		
		
		sc.close();

	}

}
