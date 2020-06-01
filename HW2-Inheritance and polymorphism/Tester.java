package homeworkChap5;

interface CalcArea {
	double getArea();
}

class Circle implements CalcArea {
	double radius;

	Circle(double r) {
		this.radius = r;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}
}

class Rectangle implements CalcArea {
	double length;
	double width;

	Rectangle(double l, double w) {
		this.length = l;
		this.width = w;
	}

	public double getArea() {
		return length * width;
	}

}

public class Tester {
	static CalcArea[] shapes = { new Circle(1.0), new Rectangle(3.0, 4.0), new Circle(8.0) };

	public static double sumArea(CalcArea[] shapes) {
		double result = 0;
		for (int i = 0; i < shapes.length; i++) {
			result = result + shapes[i].getArea();
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("total area = " + sumArea(shapes));
	}

}