// star print 
package core_basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StarPiramid {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str = br.readLine();
		int num = Integer.parseInt(str);

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" *");
				// System.out.print();
			}
			System.out.println("");
		}
	}
}
