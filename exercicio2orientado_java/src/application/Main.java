package application;

import java.util.Scanner;

import entities.Funcionario;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Funcionario funcionario = new Funcionario();
		
		System.out.println("Digite o nome do funcionário(a): ");
		funcionario.nome = sc.next();
		System.out.println("Digite o salário bruto dele(a): ");
		funcionario.salbruto = sc.nextDouble();
		System.out.println("Digite a taxa que é descontada no salario bruto: ");
		funcionario.taxa = sc.nextDouble();
		System.out.println("Salario descontado: "+funcionario.salDescontado());
		
		System.out.println("Digite a porcentagem que o funcionario ganhou a mais no salário: ");
		double porcentagem = sc.nextDouble();
		funcionario.salComPorcentagem(porcentagem);
		System.out.println(funcionario);
		
		sc.close();
		
		
	}

}
