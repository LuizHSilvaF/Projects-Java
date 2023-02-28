package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circulo;
import entities.Forma;
import entities.Retângulo;
import entities.enums.Cor;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Forma>lista = new ArrayList<>();
		
		System.out.println("Entre com o número de formas");
		int num = sc.nextInt();
		for (int c = 1; c <= num; c++)
		{
			System.out.println("Forma "+c+" dados:");
			System.out.println("Retângulo ou Circulo ? (r/c)");
			char rc = sc.next().charAt(0);
			System.out.println("Cor (PRETO/ AZUL/ VERMELHO)");
			Cor cor = Cor.valueOf(sc.next());
			if (rc == 'r')
			{
				System.out.println("Digite a altura: ");
				double altura = sc.nextDouble();
				System.out.println("Digite a largura: ");
				double largura = sc.nextDouble();
				Forma retangulo = new Retângulo(cor, altura, largura);
				lista.add(retangulo);
			}
			else
			{
				System.out.println("Digite o raio: ");
				double raio = sc.nextDouble();
				Forma circulo = new Circulo(cor, raio);
				lista.add(circulo);
			}
		}
		
		System.out.println("Areas das formas");
		for (Forma formas : lista)
		{
			System.out.println(formas.area());
		}
		
		
		
		
		sc.close();

	}

}
