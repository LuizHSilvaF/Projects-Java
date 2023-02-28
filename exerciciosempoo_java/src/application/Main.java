package application;

import java.util.Scanner;

import entities.Triangle;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		
		System.out.println("Digite os lados do triângulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();  
		x.c = sc.nextDouble();
		System.out.println("Digite os lados do triângulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();  
		y.c = sc.nextDouble();
		
		
		double areax = x.area();
		double areay = y.area();
		
		System.out.printf("A área do triangulo X é: %.4f%n",areax);
		System.out.printf("A área do triangulo Y é: %.4f%n",areay);
		
		if (areax > areay)
		{
			System.out.println("Maior area: Triângulo X");
		}
		else
		{
			System.out.println("Maior área: Triângulo Y");
		}

		sc.close(); 
		
		
		
	}

}
