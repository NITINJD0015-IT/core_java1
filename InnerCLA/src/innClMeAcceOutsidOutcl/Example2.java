package innClMeAcceOutsidOutcl;

public class Example2 {

	static {
		System.out.println("outer class is loded");
	}

	public Example2() {
		System.out.println("outer class constructor");
	}

	static class A {
		static {
			System.out.println("Inner class is loded");
		}

		public A() {
			System.out.println("Inner class constructor");
		}

		static void m1() {
			System.out.println("inner class SM");
		}

		void m2() {
			System.out.println("inner class NSM");
		}

		public static void main(String[] args) {
			System.out.println("Inner class main");
			// Example.m1();
			Example e = new Example();
			// e.m2();
		}

	}// inner class close

	static void m3() {
		System.out.println("outer class SM");
	}

	void m4() {
		System.out.println("outer class NSM");
	}

	public static void main(String[] args) {
		System.out.println("outer class main");
		// A.m3();
		A a = new A();
		// a.m4();

	}

}
