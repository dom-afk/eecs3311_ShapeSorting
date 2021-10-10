package eecs3311_project1;

import java.awt.Color;
import java.awt.Graphics;

public class Rectangle extends Shape implements Comparable<Shape> {
	
	public Rectangle(int w,int h, Color color) {
		super.width = w;
		super.height = h;
		super.color = color;
		super.area = width * height;
	}

	protected void drawShape(Graphics form) {
		form.fillRect(upperX, upperY, width, height);
	}

	@Override
	public int compareTo(Shape o2) {
		if((this.area - o2.area) > 0) { return 1;}  //swap shapes
		else return 0;      //do not swap
	}
	
	/*
	@Override
	public String toString() {
	    return "Rect a:"+ super.area + " w: "+ width + " h: " + height+ " \n" ;
	} */

}
