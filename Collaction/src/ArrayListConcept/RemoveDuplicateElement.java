package ArrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElement {
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList < Integer > (Arrays.asList(1, 2, 3, 2, 2, 3, 4, 1, 4, 5, 6, 7, 8, 9, 7));

		//1. LinkedHashset
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(number);
		
		ArrayList<Integer> number1 = new ArrayList < Integer > (linkedHashSet);
	    System.out.println(number1);
	
	
	//JDK-8 - stream
	ArrayList<Integer> marksList = new ArrayList < Integer > (Arrays.asList(1, 2, 3, 2, 2, 3, 4, 1, 4, 5, 6, 7, 8, 9, 7));
	List<Integer> marksListUnique = marksList.stream().distinct().collect(Collectors.toList());
	System.out.println(marksListUnique);
}
	
}
