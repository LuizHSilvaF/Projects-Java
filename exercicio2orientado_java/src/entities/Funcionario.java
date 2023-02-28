package entities;

public class Funcionario {
	
	public String nome;
	public double salbruto;
	public double taxa;
	
	public double salDescontado()
	{
		double descontado = salbruto - taxa;
		return descontado;
	}
	public void salComPorcentagem(double porcent)
	{
		salbruto = salbruto + salbruto * porcent/100;
		
	}
	public String toString()
	{
		return "Salário atualizado: " + salDescontado();
	}

}
