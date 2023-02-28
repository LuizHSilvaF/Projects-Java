package entities;

public class Fisica extends Pessoa{

	private Double gastossaude;
	
	public Fisica() {
		super();
	}
	
	public Fisica(String nome, Double renda, Double gastossaude) {
		super(nome, renda);
		this.gastossaude = gastossaude;
	}
	
	public Double getGastossaude() {
		return gastossaude;
	}

	public void setGastossaude(Double gastossaude) {
		this.gastossaude = gastossaude;
	}

	@Override
	public double imposto() {
		if (getRenda() < 20000.00)
		{
			return (getRenda() * 0.15) - (gastossaude * 0.50);
		}
		else
		{
			return (getRenda() * 0.25) - (gastossaude * 0.50);
		}
		
	}

}
