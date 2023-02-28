package entitites;

public class Banco {

	private int numconta;
	private String nomeconta;
	private double saldo;
	
	public Banco(int numconta, String nomeconta) {
		this.numconta = numconta;
		this.nomeconta = nomeconta;
	}
	public Banco(int numconta, String nomeconta, double inicialdeposito) {
		this.numconta = numconta;
		this.nomeconta = nomeconta;
		deposito(inicialdeposito);
	}
	public int getNumconta() {
		return numconta;
	}
	public String getNomeconta() {
		return nomeconta;
	}
	public void setNomeconta(String nomeconta) {
		this.nomeconta = nomeconta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void saque(double saque)
	{
	    saldo = (saldo - saque) - 5;
	}
	public void deposito(double deposito)
	{
		saldo = saldo + deposito;
	}	
	
	
	
}
