package graph;

public class Point {
	private float x;
	private float y;
	private float z;
	private String name;
	
	Point(String n) //constructor without arguments
	{
		x=0;
		y=0;
		z=0;
		name=n;
	}
	
	Point(String n,float xt, float yt, float zt) //constructor initialling
	{
		x=xt;
		y=yt;
		z=zt;
		name=n;
	}
	
	public String getname() {return name;} //get method
	public float getx() {return x;}//get
	public float gety() {return y;}
	public float getz() {return z;}
	
	public void set(float xt,float yt,float zt) //set point
	{
		x=xt;
		y=yt;
		z=zt;
	}
	
	public void connect(Point p1) // simulation drawing
	{ 
		System.out.print(name+"("+x+","+y+","+z+")"+"------>"+p1.getname()+"("+p1.getx()+","+p1.gety()+","+p1.getz()+");");
	}
}
