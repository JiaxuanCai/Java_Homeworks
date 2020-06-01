package app;

import java.util.Scanner;

import graph.*;

public class OpenGLApp {

	public Graphic graphic;
	
	public void initGL() //initializing the graphic object
	{
		graphic=new Graphic();
	}
	
	public void display() //display all images in the list
	{
		graphic.draw();
	}
	
	public void reshape() //choose and reshape the image 
	{
		int size=graphic.shapes.size(); //size of list
		System.out.println("Index of chosen shape"); //reminder of input
		Scanner sc=new Scanner(System.in);
		int index=sc.nextInt(); //in int
		if(index>=size) //exception handling
		{
			System.out.println("Wrong input, please call again");
			sc.close();
			return;
		}
		graphic.reshape(index);
		sc.close();
	} 

	
	public static void main(String args[]) {
 		Triangle t1=new Triangle(); //test subclass of shapes
 		t1.draw();
 		t1.setPoint("a",1,1,1);
 		t1.setPoint("b",2,2,2);
 		t1.setPoint("c",3,3,3);
 		
 		System.out.println("\nAfter update");
 		t1.draw();
		
 		Rectangle r1=new Rectangle();//test subclass of shapes
 		r1.draw();
 		
 		r1.setPoint("a",1,1,0);
 		r1.setPoint("b",2,2,0);
 		r1.setHeight(1);
 		r1.setWidth(1);
 		
 		System.out.println("\nAfter update");
 		r1.draw();

 		Cube c1=new Cube();//test subclass of shapes
 		c1.draw();
 		c1.setPoint(1, 1, 1);
 		c1.setWidth(2);
 		
 		System.out.println("\nAfter update");
 		c1.draw();
		
		Graphic shapes=new Graphic(); //test Graphic class
		shapes.add(t1);
		shapes.add(r1);
		shapes.add(c1);
		shapes.draw();
		
 		OpenGLApp controller=new OpenGLApp(); //test display and reshape
 		controller.initGL();
 		controller.graphic.add(t1);
 		controller.graphic.add(r1);
 		controller.graphic.add(c1);
 		controller.display();
 		controller.reshape();
 		controller.display();
 		
	}
}
