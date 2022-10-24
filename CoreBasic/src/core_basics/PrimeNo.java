
//Write a java program to check given number is a prime number or not

package core_basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNo {
public static void main(String[] args) throws IOException {
	
	boolean flag = false;
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	String str  = br.readLine();
	int num = Integer.parseInt(str);
	int i=2;
	while (i <= num / 2) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }

	      ++i;
	    }

	    if (!flag)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	
	
}
}
