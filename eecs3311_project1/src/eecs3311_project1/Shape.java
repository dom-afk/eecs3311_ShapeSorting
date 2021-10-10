package eecs3311_project1;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {
	protected double area;
	protected Color color;
	protected int upperX; 
	protected int upperY;
	protected int width;
	protected int height;
	protected Color shapeColor;
	
	public Shape() {
	}
	
	//setters
	protected void setUpperX(int x) {
		 this.upperX = x;
	}
	protected void setUpperY(int y) {
		 this.upperY = y;
	}
	
	//getter
	protected Color getColor() {
		return color;
	}
	
	protected abstract void drawShape(Graphics form);
	
	protected abstract int compareTo(Shape other);
	
	//public abstract String toString();

}
