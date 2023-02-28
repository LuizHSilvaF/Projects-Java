package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int n = sc.nextInt();
		double[] vetor = new double [n];
		double soma = 0.0;
		
		for (int c=0;c<n;c++)
		{
			System.out.println("Digite a altura");
			vetor[c] = sc.nextDouble();
			soma = soma + vetor[c];
		}
		double media = soma/n;
		System.out.printf("Media: %.2f",media);
		
		sc.close();

	}

}
