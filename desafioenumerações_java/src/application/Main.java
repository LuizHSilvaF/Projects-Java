package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com os dados do cliente");
		System.out.println("Nome:");
		String nome = sc.next();
		System.out.println("Email:");
		String email = sc.next();
		System.out.println("Data de nascimento:");
		Date datanascimento = sdf.parse(sc.next());
		
		Client client = new Client(nome, email, datanascimento);
		
		System.out.println();
		System.out.println("Entre com dado do pedido");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		Order order = new Order(new Date(),status, client);
		
		System.out.println("Quantos items para esse pedido?");
		int n = sc.nextInt();
		
		for(int c = 1; c < n+1; c++)
		{
			System.out.println("Entre com os dados do item "+c);
			System.out.println("Nome do produto:");
			String nomeproduto = sc.next();
			System.out.println("Entre com o preço do preduto:");
			double precoproduto = sc.nextDouble();
			
			Product product = new Product(nomeproduto,precoproduto);
			
			System.out.println("Quantidade:");
			int quantidade = sc.nextInt();
			
			OrderItem orderitem = new OrderItem(quantidade, precoproduto, product);
			order.addItem(orderitem);
		}
		System.out.println(order);
		
		sc.close();

	}

}
