package var_arg5;



public class AdditionWithArrayParam {
	static void add(int... a) {
		if (a.length == 0) {
			System.out.println("values are not passed");
		} else {
			int sum = 0;
			for (int i = 0; i < a.length; i++) {
				sum = sum + a[i];
			}
			System.out.println("Result:"+sum);
		}
	}

	

}
