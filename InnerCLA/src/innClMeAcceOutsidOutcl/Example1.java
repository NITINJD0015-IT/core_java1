package innClMeAcceOutsidOutcl;

public class Example1 {
	
	  static { System.out.println("outer class is loded"); }
	 
	
	static class A{
		static { System.out.println("Inner class is loded"); }
		public static void main(String[] args) {
			System.out.println("Inner class main");
		}
		
	}// inner class close
	
		public static void main(String[] args) {
			System.out.println("outer class main");
		}
		
		
	}


