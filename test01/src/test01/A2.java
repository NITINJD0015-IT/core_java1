package test01;

public class A2 {
	public static void main(String[] args) {
		try {
			m1();
		} catch (ArithmeticException e) {
			System.out.println("in main catch");
		}	
		
			System.out.println("main end");
	}
	
	static void m1(){
		int a=10/0;
	}
		
		/*try {
			
		}catch (ArithmeticException e) {
			a=30;
			//b=40;
			System.out.println(a);
			//System.out.println(b);
			return 10;
		}
		finally {
			//a=34;
			System.out.println(a);
			
		}
		System.out.println(a);*/
	
	}
