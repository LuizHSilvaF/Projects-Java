package curso_java2;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		String nome = "Luiz";
		int idade = 18;
		double salario = 10.000;
		double nm = 10.647972;
		int x = 32;
		
		System.out.println("Hello World");
		System.out.printf("%.2f%n", nm);
		System.out.printf("%.4f%n", nm);
		Locale.setDefault(Locale.US);	 
		System.out.printf("%.2f%n", nm);
		System.out.printf("%.4f%n", nm);
		System.out.println("Olá "+ nm);
		System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome,idade,salario);
		System.out.println("Hello World");
		
		
	}

}
