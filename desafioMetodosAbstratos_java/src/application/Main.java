package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Fisica;
import entities.Juridica;
import entities.Pessoa;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Pessoa>lista = new ArrayList<>();
		
		System.out.println("Digite o número de pessoas taxadas");
		int num = sc.nextInt();
		for (int c = 1; c <= num; c++)
		{
			System.out.println("Pagador da taxa");
			System.out.println("Pessoa Física ou Jurídica? (f/j)");
			char fj	= sc.next().charAt(0);	
			System.out.print("Nome : ");
			String nome = sc.next();
			System.out.print("Renda : ");
			double renda = sc.nextDouble();
			if (fj == 'f')
			{
				System.out.print("Gastos com saúde : ");
				double gastossaude = sc.nextDouble();
				Pessoa pessoa = new Fisica(nome, renda, gastossaude);
				lista.add(pessoa);
			}
			else
			{
				System.out.print("Número de funcionários : ");
				int numfun = sc.nextInt();
				Pessoa pessoa = new Juridica(nome, renda, numfun);
				lista.add(pessoa);
			}
		}
		
		System.out.println("Taxas pagas : ");
		for (Pessoa ps : lista)
		{
			System.out.println(ps.getNome() + " : $" + ps.imposto());
		}
		
		double soma = 0.0;
		for (Pessoa ps : lista)
		{
			 soma = soma + ps.imposto();
		}
		System.out.printf("Total de taxas : " + soma);
	}

}
