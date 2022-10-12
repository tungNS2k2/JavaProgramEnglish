package exercise7;

public class Circle implements IGeometricObject{
	protected double radius = 1.0;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		double S = (3.14 * radius) * (3.14 * radius); 
		return S;
	}



	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double P = 2 * 3.14 * radius;
		return P;
	}
}
