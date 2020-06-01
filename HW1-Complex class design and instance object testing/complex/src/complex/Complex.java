package complex;

public class Complex {
	private int RealPart;
	private int ImaginPart;

	Complex() {
		this.RealPart = 0;
		this.ImaginPart = 0;
	}

	Complex(int r, int i) {
		this.RealPart = r;
		this.ImaginPart = i;
	}

	public int getReal() {
		return this.RealPart;
	}

	public int getImagin() {
		return this.ImaginPart;
	}

	public void setReal(int r) {
		this.RealPart=r;
	}
	
	public void setImagin(int i) {
		this.ImaginPart=i;
	}
	
	public Complex complexAdd(Complex a) {
		int i = this.ImaginPart + a.ImaginPart;
		int r = this.RealPart + a.RealPart;
		return new Complex(r, i);
	}

	public String toString() { //Remember to pay attention to the naming of method
		return this.RealPart + "+" + this.ImaginPart + "i";
	}

	public static void main(String[] args) {
		//test the constructor without parameter
		Complex c1=new Complex();
		System.out.println("c1="+c1.toString());
		
		//test the constructor with given i and r
		Complex c2=new Complex(1,2);
		Complex c3=new Complex(3,4);
		System.out.println("c2="+c2.toString());
		System.out.println("c3="+c3.toString());
		
		//test complexAdd method
		Complex result=c2.complexAdd(c3);
		System.out.println();
		System.out.println("result="+result.toString());
		
		//During the above test process, it can be seen that the 'toString' method is also correct.
	}

}
