package application;

import java.util.Scanner;
import entities.Products;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Nome: ");
		String nome = sc.next();
		System.out.println("Digite o preço: ");
		double preco = sc.nextDouble();
		System.out.println("Digite a quantidade no estoque: ");
		int qtd = sc.nextInt();
		Products products = new Products(nome,preco,qtd);
		products.setNome("Computer");
		products.setPreco(5000.00);
		
		System.out.println(products.toString());
		System.out.println("Entre com o número de produtos para se adicionado da quantidade: ");
		int quantidade = sc.nextInt();
		products.adicionarProdutos(quantidade);
		System.out.println("Dados atualizados: "+products);
		
		System.out.println("Entre com o número de produtos para se retirado da quantidade: ");
		quantidade = sc.nextInt();
		products.removerProdutos(quantidade);
		System.out.println("Dados atualizados: " + products);
		
		
		
		sc.close();

	}

}

