package application;

import java.util.Date;
import entities.Pedidos;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		
		Pedidos pedidos = new Pedidos(1080, new Date(), OrderStatus.PAGAMENTO_PENDENTE );
		
			System.out.println(pedidos);
			
			OrderStatus s01 = OrderStatus.ENTREGUE;
			OrderStatus s02 = OrderStatus.valueOf("ENTREGUE");
			
			System.out.println(s01);
			System.out.println(s02);

	}

}
