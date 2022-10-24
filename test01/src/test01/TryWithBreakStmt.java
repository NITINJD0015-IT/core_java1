package test01;

public class TryWithBreakStmt {
	public static void main(String[] args) {

		System.out.println(m1());

	}

	static int m1() {
		try {
			System.out.println("in try");
			return 10;
		} finally {
			System.out.println("in finally");
			return 20;
		}
		//System.out.println("aftre try finally");
		

	}
}
