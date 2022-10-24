package var_arg4;

public class Test {
	public static void main(String[] args) {
		AdditionWithArrayParam.add(new int[] {});
		AdditionWithArrayParam.add(new int[] { 5 });
		AdditionWithArrayParam.add(new int[] { 5, 6 });
		AdditionWithArrayParam.add(new int[] { 5, 6, 7 });
		AdditionWithArrayParam.add(new int[] { 5, 6, 7, 8 });
	}
}
