package var_arg2;

public class Addition {
	static void add(int[] a) {
		System.out.println(a.length + "value array is passed");
		for (int i = 0; i < a.length; i++) {
			System.out.println("value" + (i + 1) + "is:" + a[i]);
		}
	}

}
