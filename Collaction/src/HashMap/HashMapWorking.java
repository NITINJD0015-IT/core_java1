package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapWorking {
	public static void main(String[] args) {
		Map<String, Integer> marks = new HashMap<String, Integer>();
		marks.put("Naveen", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Robby", 600);
		
		marks.put(null, 500); 
		
		Iterator it = marks.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//using lambda
		marks.forEach((k,v)-> System.out.println("key = "+k +"   value = "+v));
		
	}
}
