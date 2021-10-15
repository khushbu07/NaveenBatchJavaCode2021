package BuilderPattern;

public class TestShop {

	public static void main(String[] args) {

		Shopping shop = new Shopping();

		shop.login("Naveen", "Naveen@123").doSearch("Macbook pro").addToCart("Macbook pro").doPayment("1233333", 2345)
				.checkOrder("Macbook pro").logout();

		System.out.println("--------");

		shop.login(98987898, 1234).checkOrder("macbook pro").logout();

		System.out.println("--------");
		shop.doSearch("Tshirt", "Black").logout();

		System.out.println("--------");
		
		shop.logout();
		
		System.out.println("--------");

		shop.login(98987898, 1234)
			.doPayment("1212 3333 2222 1111", 3456)
				.logout();
		
		Employee e1=new Employee();
		String name=e1.getEmpInfo().getName();
		System.out.println(name);
		
		Browser.m1();

		
		
	}
}