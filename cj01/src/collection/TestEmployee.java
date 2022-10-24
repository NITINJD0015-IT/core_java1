package collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;


public class TestEmployee {

	
	
	public static void main(String[] args) 
	{
	       ArrayList<Employee> list=new ArrayList<Employee>();
	       
	       list.add(new Employee(3424,"Nitin",64656.09));
	       list.add(new Employee(5653,"Hitesh",79756.868));
	       list.add(new Employee(9746,"Pradeep",903856.09));
	       list.add(new Employee(9886,"Manish",98739.09));
	       list.add(new Employee(8764,"Vineet",68745.09));
	       list.add(new Employee(6233,"Sunoy",543763.09));
	       
	        Collections.sort(list);
	        
	        System.out.println("\nSorting according to name:\n");
	       
	       Iterator<Employee> it=list.iterator();
	       
	       while(it.hasNext())
	    	   System.out.println(it.next());
	        	
	        	
	       System.out.println("\nSorting according to salary:\n");
	       
	       EmpComparator emp=new EmpComparator();
	       
	       Collections.sort(list,emp);
	        
	       Iterator<Employee> it1=list.iterator();
	       
	       while(it1.hasNext())
	    	   System.out.println(it1.next());
	        
	       
	       
	}

}
