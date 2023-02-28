package application;

import java.util.Scanner;

import entitites.Banco;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double saldo = 0;
		
		Banco banco;
		System.out.println("Digite o número da conta: ");
		int numconta = sc.nextInt();
		System.out.println("Digite o nome do titular: ");
		String nome = sc.next();
		System.out.println("Você deseja fazer um deposito inicial ?()s/n");
		char s_n = sc.next().charAt(0);
		if (s_n != 'n' )
		{
			System.out.println("Digite o valor do saldo");
			saldo = sc.nextDouble();
			banco = new Banco(numconta,nome,saldo);
		}
		else
		{
			banco = new Banco(numconta,nome);
		}
		System.out.println("Conta: "+ banco.getNumconta()+ ", Titular: " + banco.getNomeconta() + ", Saldo: " + banco.getSaldo());
		
		System.out.println("Digite o valor do deposito: ");
		double deposito = sc.nextDouble();
		banco.deposito(deposito);
		System.out.println("Conta: "+ banco.getNumconta()+ ", Titular: " + banco.getNomeconta() + ", Saldo: " + banco.getSaldo());
		
		System.out.println("Digite o valor do saque: ");
		double saque = sc.nextDouble();
		banco.saque(saque);
		System.out.println("Conta: "+ banco.getNumconta()+ ", Titular: " + banco.getNomeconta() + ", Saldo: " + banco.getSaldo());
		sc.close();
	}

}
