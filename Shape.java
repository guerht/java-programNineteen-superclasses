// Abstract Shape.java
public abstract class Shape {
	private String name;
	public Shape(String n) {
		name = n;
	}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public abstract double findArea(double l, double w);

}