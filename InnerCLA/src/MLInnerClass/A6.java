package MLInnerClass;

public class A6 {
	int x =1;
	void m1() {
		 final int x=2;
		 class B{
			 int x=3;
			 void m2() {
				 System.out.println(" x:"+x);
				 int x=4;
				 System.out.println(" x:"+x);
				 System.out.println(" This.x:"+this.x);
				 System.out.println(" B.This.x:"+B.this.x);
				 System.out.println(" A.This.x:"+A.this.x);
			 }
		 }
		 // continuation to m2() method 
		 B b=new B();
		 b.m2();
		 System.out.println(" x:"+x);
		 System.out.println(" B.x:"+B.x);
		 System.out.println(" x:"+x);
		 System.out.println(" This.x:"+this.x);
	 }
	 public static void main(String[] args) {
		A5 a = new A5();
		a.m1();
	}
}
