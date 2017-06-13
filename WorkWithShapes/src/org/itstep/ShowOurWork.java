package org.itstep;

import java.util.ArrayList;

public class ShowOurWork {

	public static void main(String[] args) {
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		Square square = new Square();
		
		circle.setRadius(10);
		circle.setArea((int)(Math.PI*circle.getRadius()*circle.getRadius()));
		
		triangle.setHeigh(8);
		triangle.setBaseLine(6);
		triangle.setArea((triangle.getBaseLine()*triangle.getHeigh())/2);
		
		square.setSide(13);
		square.setArea(square.getSide()*square.getSide());
		
		ArrayList<Shape> listOfShapes = new ArrayList<>();
		listOfShapes.add(square);
		listOfShapes.add(triangle);
		listOfShapes.add(circle);
		
		for(int i=0; i<listOfShapes.size(); i++){
			System.out.println("Area of shape is - " + listOfShapes.get(i).getArea());
			
			
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
