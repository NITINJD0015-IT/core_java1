package emp;

import java.util.*;

public class Test {
	public static void main(String[] args){

		//Employee m = new Employee(301,"hitesh",60000, "c" , "java", "c++" );
		//MyDate md = new MyDate(28,6,1984);

		//m.print();
		//md.print();
		
		Employee e =(new Employee(15, "hitesh", 80000, "c,vb,php"));
		Employee e1 =(new Employee(13, "pradeep", 60000, "c,java,php"));
		Employee e2 =(new Employee(14, "vinay",45000, "c,vb,java,dotnet"));
		
		ArrayList<Employee> l= new ArrayList<Employee>();
		
		l.add(e);
		l.add(e1);
		l.add(e2);
		
		EmpCompartor em = new EmpCompartor() ;
		//Utility u = new Utility(l);
		//u.printList();
		
		/*
		HashMap<String, Double> hm = new HashMap<String,Double>();
		hm.put("Manish",e.basic_salary);
		hm.put("hitesh",e1.basic_salary);
		hm.put("nitin", e2.basic_salary);
		
		UtilityReport ur = new UtilityReport(hm);
		ur.showReport();
		*/
		
		SortUtil su = new SortUtil(l);
		
		su.sort();
		
//		Collections.sort(l, em);
//		System.out.println(l);
//		
	}
}
