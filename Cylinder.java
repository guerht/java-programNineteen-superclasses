// Cylinder.java
//subclass of Circle
public class Cylinder extends Circle {
	// Instance Variables
	// Constructors
	// Methods
	private double height;
	public Cylinder() {
		super();
		height = 1.0;
	}
	public Cylinder(double h, double r) {
		height = h;
		super.setRadius(r);
	}
	public void setHeight(double h) {
		height = h;
	}
	public double getHeight() {
		return height;
	}
	public double findVolume() {
		return super.findArea() * height;
	}
	public double findVolume(double h, double r) {
		return super.findArea(r) * h;
	}
}