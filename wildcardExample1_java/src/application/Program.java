package application;

import java.util.ArrayList;
import java.util.List;

import entites.Circle;
import entities.Shape;
import entitites.Rectangle;

public class Program {

	public static void main(String[] args) {

		List<Shape> myshapes = new ArrayList<>();
		myshapes.add(new Rectangle(4.0, 5.0));
		myshapes.add(new Circle(3.0));
		
		List<Circle> mycircles = new ArrayList<>();
		mycircles.add(new Circle(2.0));
		mycircles.add(new Circle(3.0));
		
		System.out.println("Total area: "+totalArea(mycircles)); 
	}
	public static double totalArea(List<? extends Shape> list) { //lista de qualquer tipo que seja um subtipo de shape
		double sum = 0;
		for(Shape shape : list) {
			sum += shape.area();
		}
		return sum;
	}

}
