package BuilderPattern;

public class Browser {

	public void launch() {
		checkRam();
	}

	public void checkRam() {
		checkOS();
	}

	public void checkOS() {
		System.out.println("Check OS");
	}
	
	
	public static void m1() {
		m2();
	}

	public static void m2() {
		m3();
	}

	public static void m3() {
		System.out.println("BYE");
	}

	public static void main(String args[]) {

		Browser br = new Browser();
		br.launch();
        m1();
	}
}
