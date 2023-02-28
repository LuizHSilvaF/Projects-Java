package application;

import java.util.Scanner;

import propetities.Aluno;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		System.out.println("Digite seu nome): ");
		aluno.nome = sc.next();
		System.out.println("Digite a nota do seu primeiro trimestre: ");
		aluno.tri1 = sc.nextDouble();
		System.out.println("Digite a nota do seu segundo trimestre: ");
		aluno.tri2 = sc.nextDouble();
		System.out.println("Digite a nota do seu terceiro trimestre: ");
		aluno.tri3 = sc.nextDouble();
		System.out.println("Sua nota final é: "+aluno.media());
		if (aluno.media() >= 18)
		{
			System.out.println("APROVADO!");
		}
		else
		{
			System.out.println("REPROVADO!");
			System.out.print(aluno.perdaDePontos());
		}
		sc.close();	}

}
