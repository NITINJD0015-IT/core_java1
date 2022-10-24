package test01;

public class A {
	public static void main(String[] args) {

		try {
			 int a = Integer.parseInt(args[0]);
			 System.out.println("a: "+a);
			 try {
				 int[] x=new int[a];
				 System.out.println("array size: "+x.length);
				 
			 }catch (NegativeArraySizeException e) {
				int[] x=new int[3];
				 System.out.println("array size: "+x.length);
			}
			 int b=a+20;
			 System.out.println("b: "+b);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("pass one int value");
		}
		catch (NumberFormatException e) {
			System.out.println("pass only int value");
		}
	}
		
}
