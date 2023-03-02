package entites;

import entities.Shape;

public class Circle implements Shape {

	private Double radius;

	public Circle(Double radius) {
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}
	
	@Override
	public double area() {
		double area = Math.pow(radius, 2) * Math.PI;
		return area;
	}
}
