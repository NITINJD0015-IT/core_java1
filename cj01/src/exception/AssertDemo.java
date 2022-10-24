package exception;

public class AssertDemo {

	   public void div(int n1,int n2) 
	   {
		      assert n2>1 :"num2 should be greater than 0";
		      
		      int res=n1/n2;
		      
		     System.out.println("division:"+res);
		   
	   }
	
	
	public static void main(String[] args) 
	{
	       AssertDemo a=new AssertDemo();
	       
	       
		
	       a.div(12,0);

	}

}
