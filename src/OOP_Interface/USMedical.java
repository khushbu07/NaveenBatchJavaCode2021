package OOP_Interface;

public interface USMedical extends WHO {
	static final int min_fee = 10;

	// vars are static and final by default

	// we can not create the object of interface
	// abstract method -- a method which doesnt have any method body
	// prototype mehtod -- only decalaration - no method body
	//100 % abstraction

	public void physioservice();

	public void oncologyservice();

	public void dentalservice();

	public void dermaservice();

	public void emergencyservices();

}
