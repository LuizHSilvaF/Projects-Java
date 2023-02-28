package application;

import java.util.Scanner;

import model.entities.Conta;
import model.exception.ExcecoesConta;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try
		{
		System.out.println("Entre com os dados da conta");
		System.out.print("Número: ");
		int num = sc.nextInt();
		System.out.print("Títular: ");
		String titular = sc.next();
		System.out.print("Saldo inicial: ");
		double saldo = sc.nextDouble();
		System.out.println("Limite de saque: ");
		double lmt_saque = sc.nextDouble();
		
		Conta conta = new Conta(num, titular, saldo, lmt_saque);
		
		System.out.println();
		System.out.println("Digite o valor do saque: ");
		double valor_saque = sc.nextDouble();
		conta.Saque(valor_saque);
		System.out.println(conta.getSaldo());
		
		sc.close();
		}
		
		catch (ExcecoesConta e)
		{
			System.out.println("Erro no saque: " + e.getMessage());
		}
		catch (RuntimeException e)
		{
			System.out.println("Erro inesperado!");
		}
	}

}
