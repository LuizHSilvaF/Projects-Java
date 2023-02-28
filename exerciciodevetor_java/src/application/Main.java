package application;

import java.util.Scanner;

import entities.Altura;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas são digitadas? ");
		int n = sc.nextInt();
		Altura[] vetor = new Altura[n];
		double soma = 0.0;
		
		
		for(int c=0; c<vetor.length; c++)
		{
			System.out.println("Digite o nome: ");
			String nome = sc.next();
			System.out.println("Digite a idade: ");
			int idade = sc.nextInt();
			System.out.println("Digite a altura: ");
			double altura = sc.nextDouble();
			vetor [c] = new Altura(nome,idade,altura);
			soma = soma + vetor[c].getAltura();
		}
		double media = soma / vetor.length;
		System.out.printf("A media de altura entre as pessoas é de: %.2f ",media);
		for (int c=0;c<n;c++)
		{
			if (vetor[c].getIdade()< 18)
			{
				System.out.println(vetor[c].getNome());
			}
		}
		
		sc.close();
		
	}

}
