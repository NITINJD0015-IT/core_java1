package exception;
import java.io.File;
import java.io.IOException;


public class CheckedExceptionDemo {

	
	public static void main(String[] args)  
	{
	         File f=new File("Abc.txt");
	         
	         if(!f.exists())
	         {
	        	// f.createNewFile();
	         }
		
	}

}
