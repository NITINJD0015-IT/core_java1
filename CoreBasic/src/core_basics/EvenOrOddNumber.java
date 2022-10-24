//Write a program to read input from keybord and find given no is Even or Odd 
package core_basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EvenOrOddNumber {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str = br.readLine();
		int num = Integer.parseInt(str);
		
		if(num/2==0) {
			System.out.println("given number is Even number");
		}else {
			System.out.println("given number is Odd number");
		}
		
	}

}
