package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionarios;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Lista do tipo Funcionarios 
		
		List<Funcionarios> list = new ArrayList<>();
		System.out.println("Quantos funcionários serão registrados?");
		int qtdfun = sc.nextInt();
		for (int c = 0; c < qtdfun; c++)
		{
			System.out.println("Digite o Id: ");
			int id = sc.nextInt();
			System.out.println("Digite o nome: ");
			String nome = sc.next();
			System.out.println("Digite o salário: ");
			double salario = sc.nextDouble();
			list.add(new Funcionarios(id, nome, salario));
		}
		System.out.println("----------------------");
		System.out.println("Entre com o Id para alterar o salario: ");
		int id = sc.nextInt();
		Funcionarios fun = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (fun == null)
		{
			System.out.println("Esse id não existe.");
		}
		else
		{	
			System.out.println("Digite a porcentagem: ");
			double porcentagem = sc.nextDouble();
			fun.aumentoSalarial(porcentagem);
		}
		for (Funcionarios obj : list)
		{
			System.out.println(obj);
		}
		
		sc.close();
		
	}
	

}
