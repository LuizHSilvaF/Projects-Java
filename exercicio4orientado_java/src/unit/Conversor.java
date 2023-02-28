package unit;

public class Conversor {

	
	
	public static double pagoReais(double dolar, double comprado)
	{
		double total = dolar * comprado;
		double dife = (total * 6)/100;
		total = total + dife;
		return total;
	}
	
}
