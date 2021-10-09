package eecs3311_project1;

import java.awt.Color;
import java.util.Random;

public class ShapeFactory {

	static int maxSizeDifference = 50; //pixels
	static int minSize = 10; 
	Color color;
	Random rand;
	   
	   public Shape getRandomShape() {
		   rand = new Random();
		   int height;
		   int width = (rand.nextInt(maxSizeDifference) + minSize );
		   int red = rand.nextInt(255),green = rand.nextInt(255),blue = rand.nextInt(255);
		   int shape = rand.nextInt(3);
		   color = new Color(red,green,blue);

		   
		   switch(shape) {
		   case 0: //circle
			   return new Circle(width, color);
			   
		   case 1: //square
			   return new Square(width, color);
			   
		   case 2: // rectangle
			   height = (rand.nextInt(maxSizeDifference ) + minSize ); //random height thats != width
			   while (height == width) height = (rand.nextInt(maxSizeDifference ) + minSize ); 
			   return new Rectangle(width, height, color);
		   }
		return null;   
	   }
}
