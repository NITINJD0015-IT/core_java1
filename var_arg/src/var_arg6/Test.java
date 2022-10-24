package var_arg6;

import java.util.Scanner;

public class Test {
	public static void main(String... args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("how many values you want input:");
		int noOfValues = scn.nextInt();
		int[] inputValues = new int[noOfValues];
		for(int i=0;i<noOfValues;i++) {
			System.out.println("Enter num"+(i+1)+":");
			inputValues[i]=scn.nextInt();
		}
		PassingDynamicValues.add(inputValues);
	}
	
}
