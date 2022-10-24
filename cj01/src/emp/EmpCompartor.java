package emp;

import java.util.Comparator;
import java.util.List;

public class EmpCompartor implements Comparator<Employee>{
//	List<Employee> myObj;
//	
//	 public EmpCompartor(List<Employee> myObj) {
//		this.myObj = myObj;
//	}

	public int compare(Employee e1, Employee e2){
		 Double x = e1.getBasic_salary();
		 Double y = e2.getBasic_salary();
		if(x>y){
			return 1;
		}
		if(x<y){
			return -1;
		}
		
		 return 0;
	 }
}
