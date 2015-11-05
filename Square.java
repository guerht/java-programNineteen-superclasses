// Square.java
public class Square extends Shape {
	private double length;
	private double width;
	private String name;
	public Square() {
		super("Square");
		length = 2;
		width = 3;
	}
	public double findArea(double l, double w) {
		return l*w;
	}
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
}