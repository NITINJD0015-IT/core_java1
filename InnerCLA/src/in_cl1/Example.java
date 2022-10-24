package in_cl1;

public class Example {
	static int a=10;
	int x=20;
	private int y = 30;
	
	static class A{
		public static void main(String[] args) {
			System.out.println(a);
			//System.out.println(x);//Cannot make a static reference to the non-static field x
			//System.out.println(y);//Cannot make a static reference to the non-static field y
			
			//Example e = new Example();
			A e = new A();
			System.out.println(a);
			System.out.println(e.x);
			System.out.println(e.y);
		}
		
	}

}
