package model.entities;

import model.exception.ExcecoesConta;

public class Conta {
	
	private Integer num;
	private String titular;
	private Double saldo;
	private Double lmt_saque;
	
	public Conta() {
	}

	public Conta(Integer num, String titular, Double saldo, Double lmt_saque) {
		this.num = num;
		this.titular = titular;
		this.saldo = saldo;
		this.lmt_saque = lmt_saque;
	}

	public Integer getNum() {
		return num;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLmt_saque() {
		return lmt_saque;
	}

	public void setLmt_saque(Double lmt_saque) {
		this.lmt_saque = lmt_saque;
	}
	
	
	public void Saque(double valor_saque)
	{		
		if (valor_saque > this.lmt_saque)
		{
			throw new ExcecoesConta("O valor do saque não pode ser maior que o limite de saque!");
		}
		
		if (valor_saque > this.saldo)
		{
			throw new ExcecoesConta("O valor do saque não pode ser maior que o saldo!");
		}
		
		double saldo = this.saldo - valor_saque;
		this.saldo = saldo;
		
	}
	

}
