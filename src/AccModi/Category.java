package AccModi;

import AccessModifiers.Company;

public class Category extends Company {

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
	
	//@Override
	void test() {
		System.out.println("default...");
	}
	
	
	
	public static void main(String[] args) {
		
		Category cg=new Category();
		cg.hq="Pune";
		cg.name="name1";
		
		cg.row();
		//cg.colm();
		cg.table();
		//cg.test();


	}

}
