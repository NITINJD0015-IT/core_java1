import java.util.Scanner;

public class CalculatorOperation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double first = sc.nextDouble();
		double second = sc.nextDouble();
		System.out.println("Enter any operator(+,-,*,/):");
		char ch = sc.next().charAt(0);
		double Result=0;
		switch (ch) {
		case '+':
			Result = first + second;
			break;
			
		case '-':
			Result = first + second;
			break;
			
		case '*':
			Result = first + second;
			break;
			
		case '/':
			Result = first + second;
			break;

		default:
			System.out.println("Incorrect oprator");
			break;
		}
		System.out.printf("%.1f %ch %.1f = %1f",first,ch,second,Result );
	}
}
