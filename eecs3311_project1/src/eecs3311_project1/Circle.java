package eecs3311_project1;

import java.awt.Color;
import java.awt.Graphics;

public class Circle extends Shape implements Comparable<Shape>{

	double radius;
	
	public Circle(int width, Color color){
		super.width = width ;
		radius = width/2;
		super.area = Math.pow(radius, 2) * Math.PI;
		super.color = color;
	}

	public  void drawShape(Graphics	form) {
		form.fillOval(super.upperX, super.upperY, width , width);
	}

	@Override
	public int compareTo(Shape o2) {
		if((this.area - o2.area) > 0) { return 1;}  //swap shapes
		else return 0;      //do not swap
	}
	
	/*
	@Override
	public String toString() {
	    return "Circle a:"+ super.area + " diameters: "+ width + " \n";
	} */
}
