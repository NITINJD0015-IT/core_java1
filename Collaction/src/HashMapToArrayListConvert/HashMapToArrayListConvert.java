package HashMapToArrayListConvert;
// How to convert HashMap to ArrayList in java?
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapToArrayListConvert {
	public static void main(String[] args) {
		HashMap<String, Integer> compMap = new HashMap<String, Integer>();
		compMap.put("Google", 10000);
		compMap.put("Amazon", 20000);
		compMap.put("Walmart", 30000);
		compMap.put("Facebook", 40000);
		compMap.put("Cisco", 50000);
		
		System.out.println("comp Map size: "+compMap.size());//size of HashMap=5
		
		Iterator it = compMap.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry pairs = (Map.Entry) it.next();
			System.out.println(pairs.getKey()+" "+pairs.getValue());
		}
		System.out.println("----------------------");
		//itrating through Lambda
		compMap.forEach((k,v)-> System.out.println("Key = "+k+" Value = "+v));
		
		System.out.println("----------------------");
		
		//convert HashMap key in to ArrayList
		List<String> compNameList = new ArrayList<String>(compMap.keySet());
		System.out.println("total company count = "+ compNameList.size());
		for(String t : compNameList){
			System.out.println(t);
		}
		System.out.println("----------------------");
      //convert Hashmap Value in to ArrayList
		List<Integer> empValueList = new ArrayList<Integer>(compMap.values());
		System.out.println("total emp value count = "+ empValueList.size());
		for(Integer e: empValueList) {
			System.out.println(e);
		}
	}
}
