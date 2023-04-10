package application;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = 0;
		do {
			System.out.println("1- Programa fatorial");
			System.out.println("2- Programa Bubble Sort");
			System.out.println("3- Progrrama Fibonacci");
			System.out.println("4- Programa números primos");
			System.out.println("5- Finalizar");
			do {
				System.out.println("Opção: ");
				op = sc.nextInt();
				if (op < 1 || op > 5) {
					System.out.println("Opção inválida!");
				}
			} while (op < 1 || op > 5);

			switch (op) {
			case 1:
				System.out.println("Digite um número: ");
				int num = sc.nextInt();
				int fatorial = 1;
				for (int i = num; i > 0; i--) {
					fatorial *= i;
				}
				System.out.println("O fatorial de " + num + " é " + fatorial);
				break;

			case 2:
				Random ran = new Random();
				int[] value = new int[10];

				System.out.println("Vetor não ordenado");
				for (int i = 0; i <= 9; i++) {
					value[i] = ran.nextInt(100) + 1;
					System.out.println(value[i]);
				}
				for (int fim = 8; fim >= 0; fim--) {
					for (int i = 0; i <= fim; i++) {
						if (value[i] > value[i + 1]) {
							int aux = value[i];
							value[i] = value[i + 1];
							value[i + 1] = aux;

						}
					}
				}
				System.out.println("Vetor ordenado");
				for (int i = 0; i <= 9; i++) {
					System.out.println(value[i]);
				}
				break;
				
			case 3:
				System.out.println("Digite quanto será o limite de números de Fibonacci: ");
				int limit = sc.nextInt();
				Stream<Long> st4 = Stream.iterate(new Long[]{0L , 1L}, p -> new Long[] {p[1], p[0] + p[1] }).map(p -> p[0]); 
				System.out.println(Arrays.toString(st4.limit(limit).toArray()));
				break;
				
			case 4: 
				System.out.print("Digite um número para saber se ele é primo: ");
				int n = sc.nextInt();
				double raiz = Math.sqrt(n);
				int valor = (int)raiz;
				
				if(n == 2) {
					System.out.println("Número primo");
				}
				else if(n % 2 == 0 || valor * valor == n) {
					System.out.println("Número não primo");
				}
				else {
					System.out.println("Número primo");
				}
			}
		} while (op != 5);

	}
	
	
}
