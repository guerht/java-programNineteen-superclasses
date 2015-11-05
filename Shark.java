// Shark.java
public class Shark implements Animal {
	private String name;
	public Shark() {
		name = "Sparky";
		System.out.println("Hello! My name is " + name);
	}
	public void eat() {
		System.out.println("I just ate a seal! Yummy!");
	}
	public void run() {
		System.out.println("By run, I suppose you mean, swim fast?");
	}
	public void hide() {
		System.out.println("Sharks don't hide!");
	}
	public void jump() {
		System.out.println("I jumped 5m in the air and did a flip!");
	}
	public void swim() {
		System.out.println("Oh yes this is the thing that I do everyday!");
	}
	public void hunt() {
		System.out.println("I shall smell for blood...");
	}
}