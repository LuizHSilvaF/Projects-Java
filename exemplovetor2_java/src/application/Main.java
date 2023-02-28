package application;

import java.util.Scanner;

import entities.Produto;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produto[] vetor = new Produto[n];
		double soma = 0.0;
		
		for (int c=0; c<vetor.length;c++)
		{
			System.out.println("Digite o nome do produto: ");
			String nome  = sc.next(); 
			System.out.println("Digite o valor do produto: ");
			double preco = sc.nextDouble();
			vetor[c] = new Produto(nome,preco);
			soma = soma + vetor[c].getPreco();
		}
		double media = soma / vetor.length;
		System.out.printf("A media do valor dos produtos é: %.2f ",media);
		sc.close();
	}

}
