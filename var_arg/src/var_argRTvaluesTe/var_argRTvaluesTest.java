package var_argRTvaluesTe;

import java.util.Scanner;

class A {
	void m1(int... ia) {
		System.out.println(ia.length + "values are passed");
		for (int i : ia) {
			System.out.println(" " + i);
		}
	}
}

public class var_argRTvaluesTest {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	
	System.out.println("Eneter numbers with space separator:");
	String input=scn.nextLine();
	int[] iNums = null;
	
	if(input.isEmpty()) {
		iNums=new int[0];
	}
	else {
		//Splitting given String into individual numbers
		String[] sNums=input.split(" ");
		
		//Creating array with sizeequal to given nums
		iNums = new int[sNums.length];
		
		if(sNums.length!=0) {
			//Coppy nums from sNums to iNums array
			//by converting numbers from String from to int form
			for(int i = 0;i<sNums.length;i++) {
				iNums[i]=Integer.parseInt(sNums[i]);
				
			}
		}
		
	}//if-else(empty)
	// invokeing var-arg method by passing array with '0-n' number of values
	A a1 = new A();
	a1.m1(iNums);
}
}
