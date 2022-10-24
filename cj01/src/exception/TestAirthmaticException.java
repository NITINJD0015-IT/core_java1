package exception;

public class TestAirthmaticException {
	
	public static void main(String[] args) {
		
//		try{
//			check(0,10);
//			
//		}catch(ArithmeticException a){
//		System.out.println(a.getMessage());	
//		}
	
		try{
			//check(20,0);
			check(0,10);
		}catch(NumberFormatException e){
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void check(int n1, int n2) throws ArithmeticException {
			
	
			
			if( n1==0  ){
				throw new ArithmeticException("first val. shoud not be zero");
			}
			else{
				int x = n1/n2;
				System.out.println("division n1/n2 "+x);
			}
		
			
			
	
	}
}
