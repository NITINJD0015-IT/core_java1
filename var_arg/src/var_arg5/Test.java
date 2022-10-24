package var_arg5;



public class Test {
	public static void main(String[] args) {
		AdditionWithArrayParam.add();
		AdditionWithArrayParam.add(5);
		AdditionWithArrayParam.add(5,6);
		AdditionWithArrayParam.add(5,6,7);
		AdditionWithArrayParam.add(new int[] {5,6,7,8,9});
	}
}
