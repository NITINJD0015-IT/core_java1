package emp;

import java.util.*;
	
public class UtilityReport<k, v> {
	HashMap<k, v> mymap;

	public UtilityReport(HashMap<k, v> mymap) {

		this.mymap = mymap;
	}

	void showReport(){
		
		for(Map.Entry m:mymap.entrySet()){
			System.out.println(m.getKey() + "->" +m.getValue());
		}
		
	}

}
