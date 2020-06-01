package graph;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Graphic {
	public List<Shape> shapes; // holding the shapes objects
	Scanner sc=new Scanner(System.in); //system in from keyboard
	
	public Graphic()
	{
		shapes=new LinkedList<Shape>();
	}
	
	public void add(Shape s) //add shape into the list
	{
		shapes.add(s);
	}
	
	public void draw() //call all the draw methods of the objects in the list
	{
		for(Shape s:shapes)
		{
            s.draw();
        }
	}
	
	public void reshape(int index) //reshaping the selected imagine
	{
		Shape s=shapes.get(index); //choose
		int tp=s.getCN(); //get the type of image
		int tempx,tempy,tempz;
	 
		if(tp==1)  //triangle
		{
			Triangle t=(Triangle)s;
			System.out.println("You are reshaping a triangle.");
			System.out.println("New coordinates of a(x y z):");
			tempx=sc.nextInt(); 
			tempy=sc.nextInt();
			tempz=sc.nextInt();
			Point tempa=new Point("a",tempx,tempy,tempz);
			
			System.out.println("New coordinates of b(x y z):");
			tempx=sc.nextInt();
			tempy=sc.nextInt();
			tempz=sc.nextInt();
			Point tempb=new Point("b",tempx,tempy,tempz);
			
			System.out.println("New coordinates of c(x y z):");
			tempx=sc.nextInt();
			tempy=sc.nextInt();
			tempz=sc.nextInt();
			Point tempc=new Point("c",tempx,tempy,tempz);
			t.reshape(tempa, tempb, tempc);
		}
		
		else if(tp==2) //rectangle
		{
			Rectangle r=(Rectangle)s;
			System.out.println("You are reshaping a Rectangle.");
			System.out.println("New coordinates of a(x y z):");
			tempx=sc.nextInt();
			tempy=sc.nextInt();
			tempz=sc.nextInt();
			Point tempa=new Point("a",tempx,tempy,tempz);
			
			System.out.println("New coordinates of b(x y z):");
			tempx=sc.nextInt();
			tempy=sc.nextInt();
			tempz=sc.nextInt();
			Point tempb=new Point("b",tempx,tempy,tempz);
			
			System.out.println("New value of width");
			tempx=sc.nextInt();
			
			System.out.println("New value of height");
			tempy=sc.nextInt();
			
			r.reshape(tempa, tempb, tempx, tempy);
		}
		
		else if(tp==3) //cube
		{
			Cube c=(Cube)s;
			System.out.println("You are reshaping a Cube.");
			System.out.println("New coordinates of v1(x y z):");
			tempx=sc.nextInt();
			tempy=sc.nextInt();
			tempz=sc.nextInt();
			Point tempv1=new Point("v1",tempx,tempy,tempz);
			
			System.out.println("New value of width:");
			tempx=sc.nextInt();			

			c.reshape(tempv1, tempx);
		}
	}
	
}
