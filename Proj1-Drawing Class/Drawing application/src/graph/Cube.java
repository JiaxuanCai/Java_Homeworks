package graph;

public class Cube extends Shape{
	private Point v1;
	private float width;
	
	public Cube()//constructor without arguments table
	{
		v1=new Point("v1");
		width=0;
	}
	
	public int getCN() //return type of image
	{
		return 3;
	}
	
	Cube(Point v, float w)  //constructor initialing
	{
		v1=v;
		width=w;
	}
	
	Cube(float xt,float yt,float zt,float w) //constructor initialing
	{
		v1=new Point("v1",xt,yt,zt);
		width=w;
	}
	
	public Point getPoint()//gets
	{
		return v1;
	}
	
	public float getWidth()//gets
	{
		return width;
	}
	
	public void setPoint(float xt,float yt,float zt)//sets
	{
		v1.set(xt, yt, zt);
	}
	
	public void setWidth(float w)//sets
	{
		width=w;
	}
	
	public void reshape(Point p1, float w)//reshaping the image
	{
		v1=p1;
		width=w;
	}
	
	public void draw()
	{
		System.out.println("I'm drawing the Cube.");
		System.out.println("Point:v1"+"("+v1.getx()+","+v1.gety()+","+v1.getz()+")");
		System.out.println("width"+width);
	}
}
