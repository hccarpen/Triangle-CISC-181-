package quiz3;

public class Triangle extends GeometricObject {
	
	private double side1 = 1.0,
		side2 = 1.0,
		side3 = 1.0;
	
	public Triangle() {
	}

	public Triangle(double s1, double s2, double s3) {
		this.side1 = s1;
		this.side2 = s2;
		this.side3 = s3;
	}
	
	public double getSide1() {
		return side1;
	}
	
	public double getSide2() {
		return side2;
	}
	
	public double getSide3() {
		return side3;
	}
	
	@Override
	public double getArea() {
		double p = (this.getPerimeter() / 2);
		return Math.sqrt(p * (p - side1) * (p - side2) * (p -side3));
	}

	@Override
	public double getPerimeter() {
		return (this.side1 + this.side2 + this.side3);
	}
	
	@Override
	public String toString() {
		return "This triangle has sides of lengths " + side1 + ", " + side2 + ", " + side3 + " (area: " + this.getArea() + ", perimeter: " + this.getPerimeter() + ")";
	}

}
