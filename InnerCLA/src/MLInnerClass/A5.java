package MLInnerClass;

public class A5 {
 void m1() {
	 final int x=2;
	 class B{
		 void m2() {
			 System.out.println("In B m2 x:"+x);
			 int x=4;
			 System.out.println("In B m2 x:"+x);
		 }
	 }
	 B b=new B();
	 b.m2();
 }
 public static void main(String[] args) {
	A5 a = new A5();
	a.m1();
}
}
