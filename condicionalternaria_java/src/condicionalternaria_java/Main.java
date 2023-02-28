package condicionalternaria_java;

public class Main {

	public static void main(String[] args) {
		  
		double preco = 35;
		double desconto = (preco>=20) ? preco * 0.1 : preco * 0.05;
		System.out.println(desconto);

	}

}
