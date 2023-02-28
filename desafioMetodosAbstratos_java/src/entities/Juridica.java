package entities;

public class Juridica extends Pessoa {

	private int numFun;
	
	public Juridica() {
		super();
	}
	
	public Juridica(String nome, Double renda, int numFun) {
		super(nome, renda);
		this.numFun = numFun;
	}
	
	public int getNumFun() {
		return numFun;
	}

	public void setNumFun(int numFun) {
		this.numFun = numFun;
	}

	@Override
	public double imposto() {
		if (numFun > 10)
		{
			return getRenda() * 0.14;
		}
		else
		{
			return getRenda() * 0.16;
		}
	}

	
}
