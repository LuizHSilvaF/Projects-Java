package entities;

import java.util.Date;

import entities.enums.OrderStatus;


public class Pedidos {
	
	private Integer id;
	private Date momento_pedido;
	private OrderStatus status;
	
	public Pedidos(){
	}

	@Override
	public String toString() {
		return "Pedidos [id=" + id + ", momento_pedido=" + momento_pedido + ", status=" + status + "]";
	}

	public Pedidos(Integer id, Date momento_pedido, OrderStatus status) {
		this.id = id;
		this.momento_pedido = momento_pedido;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMomento_pedido() {
		return momento_pedido;
	}

	public void setMomento_pedido(Date momento_pedido) {
		this.momento_pedido = momento_pedido;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	
	

}
