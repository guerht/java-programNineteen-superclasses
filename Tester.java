/*
 * Project: Tester.java
 * Description: Tests our super and subclasses
 * Name: Seunghoon Park
 * Date 4th November, 2015
 */
public class Tester {
	public static void main(String args[]) {
		// object declaration
		Bicycle bike = new Bicycle();
		MountainBicycle mBike = new MountainBicycle();
		Circle circle = new Circle();
		Cylinder cylinder = new Cylinder(4, 10);
		// utilise
		bike.speedUp(24);
		mBike.speedUp(34);
		System.out.println("The bike is going " + bike.getSpeed() + " km/h.");
		System.out.println("The mountain bike is going " + mBike.getSpeed() + " km/h.");

		System.out.println("The area of the first circle is: " + circle.findArea());
		System.out.println("The area of the cylinder circle is: " + cylinder.findArea());
		System.out.println("The volume of the cylinder is: " + cylinder.findVolume());
		System.out.println("The volume of the new cylinder is: " + cylinder.findVolume(2, 1));
	}
}