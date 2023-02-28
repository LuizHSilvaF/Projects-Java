package Entities;

public class Retangulo {

    public double altura;
	public double largura;
	
	public double area()
	{
		double area = altura * largura;
		return area;
	}
	public double perimetro()
	{
		double perimetro = (largura * 2) + (altura * 2);
		return perimetro;
	}
	public String toString()
	{
		return "Area = "
				+ area() +
				", Perimetro = "
				+ perimetro(); 
	}
}
