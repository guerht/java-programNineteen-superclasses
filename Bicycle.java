// Bicycle.java
// superclass
public class Bicycle {
	// Instance Variables
	private int gear;
	private int numGears;
	private double speed;
	// Constructors
	public Bicycle() {
		gear = 1;
		numGears = 18;
		speed = 0;
	}
	public Bicycle(int g, int nG, double s) {
		gear = g;
		numGears = nG;
		speed = s;
	}
	// Methods
	public void setGear(int g) {
		gear = g;
	}
	public void setNumGears(int nG) {
		numGears = nG;
	}
	public void setSpeed(int s) {
		speed = s;
	}
	public int getGear() {
		return gear;
	}
	public int getNumGears() {
		return numGears;
	}
	public double getSpeed() {
		return speed;
	}
	public void slowDown(double sp) {
		speed -= sp;
	}
	public void speedUp(double sp) {
		speed += sp;
	}
	
}