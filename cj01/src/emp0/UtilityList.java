package collaction;

import java.util.Iterator;
import java.util.LinkedList;

public class UtilityList {
	LinkedList<Employee> myobj;
	
	
	public UtilityList(LinkedList<Employee> myobj) {
		this.myobj = myobj;
	}


	void printList(){
		Iterator itr = myobj.iterator();
		System.out.println("UtilityList ");
		while(itr.hasNext()){
		System.out.println(itr.next());
		}
	}

}
