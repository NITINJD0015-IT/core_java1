package nonStaticInnerClass;

public class Test {
public static void main(String[] args) {
	A a=new A();
	a.m3();
	
	A.B b=new A().new B();
	b.m1();
	b.m2();
}

}
