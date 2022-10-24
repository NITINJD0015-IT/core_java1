package anonymous_inner_class;

public class Test01 {
public static void main(String[] args) {
	new Thread() {
		void m1() {
			System.out.println("Hi..");
		}
		
	};
	System.out.println("Hello");
	
}
}
