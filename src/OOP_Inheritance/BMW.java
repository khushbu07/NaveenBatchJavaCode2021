package OOP_Inheritance;

public class BMW extends Car {

	//Method Overriding: Poly+Morphism (Dynamic or Runtime)
		//when you have a method in the parent class and the same method in child class with:
		//1. the same method name
		//2. the same number of parameters + same type of parameter + with the same sequence of the parameters
		//3. the same return type
		
		//4. final methods can not be overriden
		//5. static methods can not be overriden
		//6. static methods can be inherited
	    //Static method can be overload
	    //Method hiding can be achieved at static level
	
	int speed = 200;
	
	@Override
	public void start() {
		System.out.println("BMW---Satrt");
	}

	public void autoParking() {
		System.out.println("BMW---autoParking");
	}

	//method hiding
	public static void getName() {
		System.out.println("BMW---getName");
	}
}
