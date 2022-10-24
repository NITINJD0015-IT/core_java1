package StringSwitch;
import java.io.*; 
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		double z;	
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 1st val.");
		double x = sc.nextDouble(); 
		System.out.println(" 2nd val.");
		double y = sc.nextDouble();
		System.out.println("enter +,-,*,/ one of them");
		String operation = sc.next();
		switch( operation)
		{

		case "+":
			z=x+y;
			System.out.println(z);
		break;
		
		case "-":
			z=x-y;
			System.out.println(z);
		break;
		
		case "*":
			z=x*y;
			System.out.println(z);
		break;
		
		case "/":
			z=x/y;
			System.out.println(z);
		break;


		}
	}


}
