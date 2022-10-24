package inner_classes;
import java.io.File;
import java.io.IOException;


public class FileDemo {

	
	public static void main(String[] args) throws IOException 
	{
	         File f=new File("E:\\java\\Stud.txt");
	         
	         if(!f.exists())
	         {
	        	 System.out.println("File doesn't Exist");
	        	 f.createNewFile();    
	         
	         }
	         else        
	        	 System.out.println("File exists:"+f.exists());
	           
	         System.out.println(f.length());
	         System.out.println("can read:"+f.canRead());
	         f.delete();
	     
	}

}
