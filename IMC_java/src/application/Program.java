package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu peso: ");
		double peso = sc.nextDouble();
		System.out.println("Digite sua altura: ");
		double altura = sc.nextDouble();
		double imc = peso/Math.pow(altura, 2);	
		
		if (imc < 17) {
			System.out.println("Muito abaixo do peso.");
		}
		else if(imc >= 17 && imc <= 17.49) {
			System.out.println("Abaixo do peso.");
		}
		else if(imc >= 18.50 && imc <= 24.44) {
			System.out.println("Peso normal");
		}
		else if(imc >= 25 && imc <= 29.99){
			System.out.println("Acima do peso.");
		}
		else if(imc >= 30 && imc <= 34.99) {
			System.out.println("Obesidade I");
		}
		else if(imc >=35 && imc <=39.99) {
			System.out.println("Obesidade II");
		}
		else {
			System.out.println("Obesidade III");
		}
		
		sc.close();
		

	}

}
