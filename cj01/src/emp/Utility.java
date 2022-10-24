package emp;
import java.util.*;
public class Utility {
	List<Employee> myObj;
	public Utility(List<Employee> obj) {
		myObj = obj;		
	}
	
	void printList(){
		Iterator<Employee> it = myObj.iterator();
		Employee e;
		while(it.hasNext()){
			e = it.next();
			System.out.println(e);
			
		}
	}

}
