package rev_num;

public class First {

	public static void main(String[] args) {

		int n = 23456;
		int reverse = 0;
		int sum = 0;
		
		while (n != 0) {
			int remainder = n % 10;
			n =n/10;
						
			
			sum = sum+remainder;
			
		}
		System.out.println(sum);
		
	}
}
