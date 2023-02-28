package application;

import java.util.Scanner;

import unit.Conversor;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o preço do dolar?");
		double dol = sc.nextDouble();
		System.out.println("Qunatos dolares você deseja comprar?");
		double com = sc.nextDouble();
		double total = Conversor.pagoReais(dol,com);
		System.out.println("Você pagará em reais "+ Conversor.pagoReais(dol,com));
		sc.close();
	}

}
