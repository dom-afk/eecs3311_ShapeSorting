package eecs3311_project1;

import java.util.ArrayList;

public class InsertionSort {

	public InsertionSort(ArrayList<Shape> shapes) {

		Shape key;
		int i,j;
		
		for (j = 1 ; j < shapes.size(); j++) {
			key = shapes.get(j); 
			i = j-1;
			while ( i >= 0 && shapes.get(i).compareTo(key) > 0 ) {
				shapes.set(i+1, shapes.get(i));
				i = i -1;
			}
			shapes.set(i+1, key);
		}
	}
}
	
	

