package math_java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double num=-9,num1 , num2 , num3;
		double A,B,C,D,E;
		
		num1 = sc.nextDouble();
		num2 = sc.nextDouble();
		num3 = sc.nextDouble();
		A = Math.sqrt(num1);
		B = Math.sqrt(num2);
		C = Math.sqrt(num3);
		D = Math.pow(A, B);
		E = Math.abs(num);
		System.out.println("A raiz de num1 é: "+A);
		System.out.println("A raiz de num2 é: "+B);
		System.out.println("A raiz de num3 é: "+C);
		System.out.println("A potência de num1 sobre num2: "+D);
		System.out.println(E);

		
		
		sc.close();

	}

}
