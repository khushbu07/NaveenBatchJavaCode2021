package AccessModifiers;

public class Company {
	
	public String name;
	private int sharePrice;
	protected String hq;
	String address;
	
	
	// methods:
		void test() {
			System.out.println("default...");
		}

		protected void row() {
			System.out.println(" protected row...");
		}

		private void colm() {
			System.out.println("  private colm...");
		}

		public void table() {
			System.out.println(" public table....");
		}

	public static void main(String[] args) {
		
		Company c = new Company();
		c.name = "IBM";
		c.sharePrice = 100;
		c.address="address test";
		c.hq="NY";
		
		c.row();
		c.colm();
		c.table();
		c.test();
		


	}

}
