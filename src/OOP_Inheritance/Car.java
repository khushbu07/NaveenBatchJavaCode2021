package OOP_Inheritance;

public class Car {
	
	//final class - can not be inherited
	//final : is used to prevent inheritnace/method overriding
	final int speed = 100;
	public void start() {
		System.out.println("Car---Start");
	}
	
	public void stop() {
		System.out.println("Car---stop");
	}
	
	public void refuel() {
		System.out.println("Car---refuel");
	}

	public static void getName() {
		System.out.println("Car---getName");
	}
}
