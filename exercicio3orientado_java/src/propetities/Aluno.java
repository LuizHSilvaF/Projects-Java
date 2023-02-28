package propetities;

public class Aluno {
	
	public String nome;
	public double tri1;
	public double tri2;
	public double tri3;
	
	public double media()
	{
		double media = (tri1 + tri2 + tri3)/3;
		return media;
	}
	public double perdaDePontos()
	{
		double pontos = 60 - media();
		return pontos;
	}
	
	
}
