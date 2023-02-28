package estruturadowhile_java;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char D;
		do {
		System.out.println("Digite a temperatura em Celcius: ");
		double C = sc.nextDouble();
		double F = 9.0 * C / 5.0 + 32.0;
		System.out.printf("Equivalente em Fahrenheit: %.2f%n ",F);
		System.out.println("Deseja continuar? (s/n)");
		D = sc.next().charAt(0);
		}while (D == 's');
		
		sc.close(); 
	}

}
