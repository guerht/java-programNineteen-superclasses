// Circle.java
// superclass
public class Circle {
	// Instance Variables
	private double radius;
	// Constructors
	public Circle() {
		radius = 1.0;
	}
	// Methods
	public void setRadius(double r) {
		radius = r;
	}
	public double getRadius() {
		return radius;
	}
	public double findArea() {
		return Math.PI*Math.pow(radius, 2);
	}
}