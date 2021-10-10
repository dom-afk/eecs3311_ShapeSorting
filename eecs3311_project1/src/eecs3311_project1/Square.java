package eecs3311_project1;

import java.awt.Color;
import java.awt.Graphics;

public class Square extends Shape implements Comparable<Shape>{

	
	public Square(int width, Color color) {
		super.width = width;
		super.color = color;
		super.area = width * width;
		
	}		
	
	protected void drawShape(Graphics	form) {
		form.fillRect(upperX, upperY, width, width);
	}
	
	@Override
	public int compareTo(Shape o2) {
		if((this.area - o2.area) > 0) { return 1;}  //swap shapes
		else return 0;      //do not swap
	}

	/* @Override
	public String toString() {
	    return "Square a: "+ super.area+ " width "+ width+ " \n";
	}
*/

}
