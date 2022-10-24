package MLInnerClass;
interface Example{
	void m3();
}

public class A3 {
	
	Example m1() {
			class B implements Example {
				public void m3() {
					System.out.println("B m3");
				}
			}
			B b = new B();
			m2(b);
			return b;
		}

		void m2(Example b) {
			b.m3();
		}
	}
