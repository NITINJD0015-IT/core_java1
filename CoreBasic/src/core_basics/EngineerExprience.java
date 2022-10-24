package core_basics;

public class EngineerExprience {

	// 0 - 2 year exp -----> Associate Engineer
	// 2 - 5 years exp -----> Software Engineer
	// 5 - 7 years exp -----> Sr. Software Engineer
	// 7 - 10 years exp ----> Manager

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int exp = 5;

		if (exp > 0 && exp <= 2) {
			System.out.println("Associate Engineer");
		} else if (exp > 2 && exp <= 5) {
			System.out.println("Software Engineer");

		} else if (exp > 5 && exp <= 7) {
			System.out.println("Sr. Software Engineer");
		} else if (exp > 7 && exp <= 10) {
			System.out.println("Manager");
		}

	}
}
