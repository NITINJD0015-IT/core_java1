package collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class ArrayListDemo {

	
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
	     @SuppressWarnings("rawtypes")
		ArrayList al=new ArrayList();
	     
	     al.add(34);
	     al.add(24);
	    
	     al.add(5667);
	     al.add(1321);
	     al.add(2,5446);
	     al.add(3,67);
	     
	     
	     Iterator i=al.iterator();
	     
	     while(i.hasNext())
	     {
	         System.out.println(i.next());
	        
	     }
	     
	     
	     Collections.sort(al);
	     
	     
	     System.out.println("\nAfter Sorting:\n");
	     
           i=al.iterator();
	     
	     while(i.hasNext())
	     {
	         System.out.println(i.next());
	        
	     }
	     
	     
	     
/*	     for(int i=0;i<al.size();i++)
	    	 System.out.println(al.get(i));
*/
	     
	   /*  System.out.println(al);
	     
	     for(Object o:al)
	       System.out.println(o);*/
	     
	   /*  @SuppressWarnings("rawtypes")
		Iterator i=al.iterator();
	     
	     while(i.hasNext())
	     {
	         System.out.println(i.next());
	        
	     }*/
	     //i.remove();
	     
	    // System.out.println("Collection elements:"+al);
	     
	}

}
