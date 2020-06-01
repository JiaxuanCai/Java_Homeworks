package graph;

public class Triangle extends Shape{
	private Point a;
	private Point b;
	private Point c;
	
	public Triangle() //constructor without arguments
	{
		a=new Point("a");
		b=new Point("b");
		c=new Point("c");
	}
	
	public int getCN() //return the imagine type
	{
		return 1;
	}
	public Triangle(Point at, Point bt, Point ct)//constructor initialing
	{
		a=at;
		b=bt;
		c=ct;
	}
	
	
	Triangle(float x1,float y1,float z1,float x2,float y2,float z2,float x3,float y3,float z3)//constructor initialing
	{
		a=new Point("a",x1,y1,z1);
		b=new Point("b",x2,y2,z2);
		c=new Point("c",x3,y3,z3);
	}
	
	
	public Point getPoint(String pointname) //gets
	{
		Point err=new Point("err");
		if(pointname=="a") return a;
		else if(pointname=="b") return b;
		else if(pointname=="c") return c;
		else return err;
	}
	
	public void setPoint(String pointname, float xt, float yt, float zt)//sets
	{
		if(pointname=="a") a.set(xt, yt, zt);
		else if(pointname=="b") b.set(xt, yt, zt);
		else if(pointname=="c") c.set(xt, yt, zt);
		else
		{
			System.out.println("Wrong input, Please call again.");
			return;
		}
	}
	
	public void reshape(Point p1, Point p2, Point p3)//reshape the imagine
	{
		a=p1;
		b=p2;
		c=p3;
	}
	
	public void draw() //draw method
	{
		System.out.println("I'm drawing the triangle.");
		a.connect(b);
		b.connect(c);
		c.connect(a);
	}
}
