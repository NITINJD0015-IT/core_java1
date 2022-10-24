package anonymous_inner_class;
class Example1 {
	void m1(Runnable r) {
		r.run();
	}
}
public class Test {
	public static void main(String[] args) {
		
	
		Example1 e=new Example1();
		e.m1(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("run");
			}
		});

	}
}
