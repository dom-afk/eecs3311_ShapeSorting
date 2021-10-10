package eecs3311_project1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Gui extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	protected JPanel panel ;
	protected JFrame frame ; 
	protected JButton loadButton ;
	protected JButton sortButton;
	protected ShapeFactory shapeFactory;
	protected Shape shape;
	protected ArrayList<Shape> shapeList= new ArrayList<Shape>();;
	protected static int shapeCount = 6;
	protected static int OFFSET= 60;

	
	public Gui() {
		 frame = new JFrame("sort shapes by their area");
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	     frame.add(this);
	     frame.setSize(600, 600);
	     frame.setLocationRelativeTo(null);
	     frame.setVisible(true);
	     
		loadButton = new JButton("Load");
		sortButton = new JButton("Sort");
		this.add(loadButton);
		this.add(sortButton);
		loadButton.addActionListener(this);
		sortButton.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		shapeFactory = new ShapeFactory();
	
		if (e.getSource()== loadButton) {
			shapeList.clear();	//clears previous list
			for (int i = 0; i < shapeCount ; i++ ) {	//generates 6 random shapes and stores in a list
				shape = shapeFactory.getRandomShape();
				shapeList.add(shape);
			}
		frame.repaint();
		}		
		
		if (e.getSource()== sortButton) {
			new InsertionSort(shapeList);
			frame.repaint();
		}
	}
	
	  public void paintComponent(Graphics g) {
	      super.paintComponent(g);
	      Graphics2D g2d = (Graphics2D) g;
		  int x = 10 , y= 10; //x,y coordinates 
		  
			for (Shape shape : shapeList) {
				
		    	g2d.setColor(shape.getColor());
		    	shape.setUpperX(x);
		    	shape.setUpperY(y);
	            shape.drawShape(g2d);    
	            x += OFFSET; y += OFFSET;
			}
	      }
	  
	  public static void main(String[] args) {
			 new Gui();
		  	}
			
	   } 
	





