class NSIC 
{
	static int a=10;
	int x=20;
	private int y=30;
	class B
	{
		//static int a = 10;//error: Illegal static declaration in inner class Sample.B
		//int x= 20;
		void m1(){
			System.out.print(a);
			System.out.print(x);
			System.out.print(y);
	}
	
}

public static void main(String []args){
System.out.print("main outer class");
}
}
