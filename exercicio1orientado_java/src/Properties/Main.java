package Properties;

import java.util.Scanner;

import Entities.Retangulo;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a altura e a largura do retângulo: ");
		Retangulo retangulo = new Retangulo();
		retangulo.altura = sc.nextDouble();
		retangulo.largura = sc.nextDouble();
		System.out.println(retangulo);
		sc.close();

	}

}
