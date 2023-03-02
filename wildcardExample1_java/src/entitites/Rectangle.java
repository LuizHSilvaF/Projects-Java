package entitites;

import entities.Shape;

public class Rectangle implements Shape{

	private Double height;
	private Double width;
	
	public Rectangle(Double height, Double width) {
		this.height = height;
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}
	
	@Override
	public double area() {
		double area = height * width;
		return area;
	}
}
