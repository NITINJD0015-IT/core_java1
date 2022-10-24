package exception;
import java.io.*;

public class FileException   {

	public static void main(String[] args) {
		try{
			checkfile("stud.txt");
		}catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}

	}	


	public static void checkfile(String file)throws FileNotFoundException {
		File f = new File("std.txt");
		try{
			if(!f.exists()){
				throw new FileNotFoundException("Filenot found"+ f); 
			}
		}
		finally{
			f=null;
		}
	}



}
