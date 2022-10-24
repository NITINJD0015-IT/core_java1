package com.nt;

import java.util.Random;

public class ArrayJoinAssendingOrder {
	public static void main(String[] args) {

		Random rand = new Random();
		int a1[] = { 40, 20, 30, 50, 60, 80, 70, 10, 9 };
		int a2[] = { 11, 33, 22, 66, 44, 55, 88, 77, 99, 100 };

		/*
		 * System.out.println("First array "); for (int i = 0; i < a1.length; i++) {
		 * System.out.println(a1[i]);
		 * 
		 * }
		 * 
		 * System.out.println("Second array "); for (int i = 0; i < a2.length; i++) {
		 * System.out.println(a2[i]);
		 * 
		 * }
		 */

		int[] c = new int[a1.length + a2.length];
		int count = 0;
		System.arraycopy(a1, 0, c, 0, a1.length);

		for (int i = 0; i < a1.length; i++) {
			System.out.println(c[i]);
		}

		/*
		 * for(int i = 0; i<a1.length; i++) { c[i] = a1[i]; count++;
		 * 
		 * } for(int i = 0;i<a2.length;i++) { c[count++] = a2[i];
		 * 
		 * } System.out.println("Merging two array"); for(int i = 0;i<c.length;i++) {
		 * System.out.println((i+1)+"--"+c[i]+" "); }
		 * 
		 * System.out.println("Sorting the array"); int temp; for (int i = 0; i <
		 * c.length; i++) { for (int j = (i + 1); j < c.length; j++) { if (c[i] < c[j])
		 * //ascending order > // descending order < { temp = c[i]; c[i] = c[j]; c[j] =
		 * temp; }
		 * 
		 * } } System.out.print("Ascending Order:\n"); for (int i = 0; i < c.length ;
		 * i++) { System.out.println(c[i]);
		 * 
		 * }
		 */
	}
}
