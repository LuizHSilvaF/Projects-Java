package application;

import java.util.Scanner;

import entities.Pensionato;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Pensionato[] vetor = new Pensionato[10];
		System.out.println("Quantos quartos serão reservados?");
		int reserva = sc.nextInt();
		int quarto = 0;
		
		for (int c = 0; c < reserva; c++)
		{
			System.out.println("Cadastro: ");
			System.out.println("Nome: ");
			String nome = sc.next();
			System.out.println("Email: ");
			String email = sc.next();
			System.out.println("Quarto: ");
			quarto = sc.nextInt();
			vetor[quarto] = new Pensionato(nome,email,quarto);
		}
		
		System.out.println("Quartos ocupados: ");
		for (int c=0;c<10;c++)
		{
		if (vetor[c] != null)
			{
		System.out.println(vetor[c].getQuarto()+": "+vetor[c].getNome()+ ", "+vetor[c].getEmail());
			}
		}
		
		
		sc.close();

	}

}
