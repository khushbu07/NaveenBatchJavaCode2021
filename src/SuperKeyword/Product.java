package SuperKeyword;

public class Product {
	int finalPrice;
	int maxPrice = 10;
	
	public Product() {
		System.out.println("defalt const...");
	}
	
	public Product(String name) {
		System.out.println("1 param const..." + name);
	}

	public Product(int price) {
		System.out.println("1 param const..." );
		this.finalPrice = price + 10;
	}

	public void delivery() {
		System.out.println("deliver the product to the given delivery address....");

	}

	public static void main(String[] args) {
		Product p = new Product();
		System.out.println(p.maxPrice);

	}

}
