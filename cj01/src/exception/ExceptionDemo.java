package exception;
import java.io.File;
import java.text.FieldPosition;


public class ExceptionDemo {

	
	public static void main(String[] args)
	{
	        
		
		     String s="30";
	         
		     try
		     {
		    	 System.out.println("Before exit..");
		    	return;
		    	 
		     }
		    catch(NumberFormatException e)
		    {
		    	System.out.println();	    			 
		    	
		    }
		     catch(NullPointerException e)
		     {
		    	 
		     }
		     catch(ArithmeticException e)
		     {
		    	 
		     }
		     catch(Exception e)
		     {
		    	 
		     }
		     
		     finally
		     {
		     
		     System.out.println("Some IMP code......");
		     
		     }
		     
		     

		/*String s="abc";
		s=null;
		System.out.println(""+s.equals("abc"));
		*/
		
		/*int a[]={1,2,3,4};
		
		for(int i=0;i<5;i++)
			System.out.println(a[i]);
		*/
		
		
	/*	int x=12;
		int y=0;
		
		System.out.println("x/y:"+(x/y));
		
		  System.out.println("Some IMP code......");
	*/
		
		
		
		
		
		
		
		
	}

}
