package BuilderPattern;

public class LoginPageTest {

	public static void main(String[] args) {
		
		LoginPage lp=new LoginPage("admin","admin@123");
		lp.doLogin(lp);


	}

}
