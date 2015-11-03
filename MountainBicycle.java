// MountainBicycle.java
// subclass of Bicycle
public class MountainBicycle extends Bicycle {
	// Instance Variables
	private double tireWidth;
	private int seatHeight;
	// Constructors
	public MountainBicycle() {
		super();
		tireWidth = 3.0;
		seatHeight = 10;
	}
	public MountainBicycle(double tw, int sh) {
		super();
		tireWidth = tw;
		seatHeight = sh;
	}
	public MountainBicycle(int g, int nG, double s, double tw, int sh) {
		super(g, nG, s);
		tireWidth = tw;
		seatHeight = sh;
	}
	// Methods
	public void setGear(int g) {
		super.setGear(g);
		System.out.println("Feeling rekt, aye?");
	}
}