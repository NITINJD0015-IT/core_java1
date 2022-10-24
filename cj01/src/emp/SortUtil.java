package emp;

import java.util.*;

public class SortUtil implements Comparator<Employee> {


	List<Employee> myObj;

	public SortUtil(List<Employee> myObj) {
		this.myObj = myObj;
	}
	
	void sort(){
		//Collections.sort(myObj);
		Iterator itr=myObj.iterator();
		System.out.println("after Sort :-");
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}
	void sortBySalary(){

	}

}
