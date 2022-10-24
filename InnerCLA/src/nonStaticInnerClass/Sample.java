package nonStaticInnerClass;

public class Sample {

	class B {
		static int a = 10;//error: Illegal static declaration in inner class Sample.B
		int x = 20;
	}

	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
