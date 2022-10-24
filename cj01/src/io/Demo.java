package io;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.stream.FileImageInputStream;


public class Demo {

	
	public static void main(String[] args)
	{
		File f=new File("stud.txt");
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		DataInputStream dis=null;
		
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		DataOutputStream dos=null;
		
		
		
	   try 
	   {
		 fis=new FileInputStream(f);
		 bis=new BufferedInputStream(fis);
		 dis=new DataInputStream(bis);
		 
		 
		 fos=new FileOutputStream("studcopy.txt");
		 bos=new BufferedOutputStream(fos);
		 dos=new DataOutputStream(bos);
		 
		 int ch;
		 String str;
		 try 
		 {
			while((str=dis.readLine())!=null)
			  dos.writeBytes(str);
		}
		 catch (IOException e) 
		 {
			
			e.printStackTrace();
		}
		 
		
		 
	   } 
	   catch (FileNotFoundException e) 
	   {
		e.printStackTrace();
	}
		
		try {
			dos.close();
			bos.close();
			fos.close();
			
			fis.close();
			bis.close();
			dis.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
