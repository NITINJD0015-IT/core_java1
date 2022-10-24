package test33;

import java.util.Scanner;

public class Test {
	
	
	
	/*
	 * public Test() { 
	 * super();
	 * this(); //Error constructor call must be the first statement in a call
	 * 
	 * System.out.println("hello nitin se"); }
	 */
	

	public static void main(String[] args) {
		
		int a=0,b=1,c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int number = sc.nextInt();
		
		for (int i = 0; i < number; ++i) {
			c = a + b;
			System.out.println("c "+a);
			a= b;
			b=c;
			
			
		}
		
	}

}
