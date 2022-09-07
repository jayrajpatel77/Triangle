
public class Triangle {
	
	
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle() {
		this.side1=0;
		this.side2=0;
		this.side3=0;
	}
	
	public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
		
		if((side1+side2<=side3)||(side2+side3<=side1)|| (side3+side1<=side2)){
			
			new  IllegalTriangleException("The triangle cannot be created");
			
		}else
			System.out.println("The triangle created");
		
		
		
	}
	public double setSide1() {
	    return side1;
	    }

	public double setSide2() {
	    return side2;
	    }

	public double setSide3() {
	    return side3;
	    }

	public void setSide1(double side1) {
	    this.side1 = side1;
	    }

	public void setSide2(double side2) {
	    this.side2 = side2;
	    }

	public void setSide3(double side3) {
	    this.side3 = side3;
	    }
	public double getPerimeter() {
		return side1+side2+side3;
	}
	
	public String toString() {
		return "Triangle side1 is "+ side1+" side2 is "+side2+" side3 is"+side3+" and the perimeter is";
		
	}
}

