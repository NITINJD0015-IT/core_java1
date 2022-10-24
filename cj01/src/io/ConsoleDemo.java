package io;

import java.io.Console;
import java.io.PrintWriter;
import java.util.Scanner;
 
public class ConsoleDemo
{
	public static void main (String[] args)
	{
		Console console = System.console ();//create console 
		if(console != null)
		{
        			
//accept name from console
			String name =			
console.readLine ("[Please Provide Your Name]: ");
//accept password from console 
			char[] passdata = console.readPassword ("[Please Input Your Password]: ");
			console.printf ("Hello"+" "+"Mr."+name);
		
String s=null;
	

for(char ch:passdata)
{
   s=s+ch;

}
console.printf(s);
			 
		}
			
	}
}
