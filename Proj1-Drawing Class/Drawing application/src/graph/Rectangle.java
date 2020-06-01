package graph;

public class Rectangle extends Shape{
	private Point a;
	private Point b;
	private float width;
	private float height;
	
	public Rectangle() //constructor without arguments
	{
		a=new Point("a");
		b=new Point("b");
		width=0;
		height=0;
	}
	
	public int getCN() //return the type of imagine
	{
		return 2;
	}
	Rectangle(Point at, Point bt, float w, float h) //constructor initialing
	{
		a=at;
		b=bt;
		width=w;
		height=h;
	}
	
	Rectangle(float x1, float y1, float z1, float x2, float y2, float z2, float w, float h) //constructor initialing
	{
		a=new Point("a",x1,y1,z1);
		b=new Point("b",x2,y2,z2);
		width=2;
		height=h;
	}
	
	
	public Point getPoint(String pointname)//gets
	{
		Point err=new Point("err");
		if(pointname=="a") return a;
		else if(pointname=="b") return b;
		else return err;
	}

	public float getWidth()//gets
	{
		return width;
	}
	
	public float getHeight()
	{
		return height;
	}
	
	public void setPoint(String pointname, float xt, float yt, float zt)//sets
	{
		if(pointname=="a") a.set(xt, yt, zt);
		else if(pointname=="b") b.set(xt, yt, zt);
		else
		{
			System.out.println("Wrong input, Please call again.");
			return;
		}
	}
	
	public void setWidth(float w)
	{
		if(w<=0)
		{
			System.out.println("Wrong input, Please call again.");
			return;
		} 
		width=w;
	}
	
	public void setHeight(float h)
	{
		if(h<=0)
		{
			System.out.println("Wrong input, Please call again.");
			return;
		}
		height=h;
	}
	
	public void reshape(Point p1, Point p2, float w, float h)
	{
		a=p1;
		b=p2;
		width=w;
		height=h;
	}
	
	public void draw()
	{
		System.out.println("\nI'm drawing the renctangle.");
		System.out.println("Point:a"+"("+a.getx()+","+a.gety()+","+a.getz()+")");
		System.out.println("width"+width);
		System.out.println("Height"+height);
		System.out.println("Point:b"+"("+b.getx()+","+b.gety()+","+b.getz()+")");
	}

}
