package MLInnerClass;

public class A {
static void m1()
{
	//B b1 = new B();
	class B{
		int x = 10;
	}
B b2 = new B();
System.out.println(b2.x);
}
static void m2() {
	//B b=new B();
	
}
public static void main(String[] args) {
	m1();
}
}
