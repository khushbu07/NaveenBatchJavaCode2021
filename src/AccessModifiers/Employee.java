package AccessModifiers;

public class Employee extends Company {
//public default and protected overrride within same package
	@Override
	public void table() {
		System.out.println("table....");
	}
	
	private void colm() {
		System.out.println("colm...");
	}
	
	@Override
	protected void row() {
		System.out.println("row...");
	}
	
	@Override
	void test() {
		System.out.println("default...");
	}
	
	
	
	public static void main(String[] args) {
		
		Employee e=new Employee();
		e.address="test address";
		e.hq="ny";
		e.name="IBM";

		e.row();
	//	e.colm();
		e.table();
		e.test();
		
	}

}
