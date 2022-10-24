package emp0;

//package collaction;

import java.util.LinkedList;

public class Test {
	public static void main(String[] args){
		
		Employee e = new Employee(303,"Manish",60000);
		Employee e1=new Employee(101,"nitin",50000);
		Employee e2=new Employee(202,"Hitesh",40000);
		
		LinkedList<Employee> l = new LinkedList<Employee>();
		l.add(e);
		l.add(e1);
		l.add(e2);
		
		
		UtilityList ul = new UtilityList(l);
		ul.printList();
		
		System.out.println("  \bAfter sort ");
		
		SortUtil su = new SortUtil(l);
		

	}
}
