package anonymous_inner_class;

interface Example2 {
	void m1();
}

public class Test2 {

	public static void main(String[] args) {
		Example2 e = new Example2() {
			public void m1() {
				System.out.println("Anonymous overriding method m1");
				m2();
			}
			public void m2() {
				System.out.println("Anonymous Own method m2 ");
			}
		};
		e.m1();
		//e.m2();
	}
}
