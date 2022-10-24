package emp0;

//package collaction;

import java.util.Comparator;
import java.util.LinkedList;

public class SortUtil implements Comparator<Employee> {
	
	LinkedList<Employee> myobj;
	
	public SortUtil(LinkedList<Employee> myobj) {
		
		this.myobj = myobj;
	}

	void sort(){
		Collactions.sort(myobj);
	}
	
	void sortBySalary(){
		
	}

}
