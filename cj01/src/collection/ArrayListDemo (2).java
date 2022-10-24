package collection;
import java.util.*;
public class ArrayListDemo {
	public static void main(String args[]){
		
		//Array list of String
		//ArrayList<String>list = new ArrayList<Strring>();
		
		//or 1.8+
		
		ArrayList<String> list = new ArrayList<>();
		
		//Add an element at last position
		
		list.add("D");
		list.add("A");
		list.add("E");
		list.add("B");
		
		System.out.println(list.size()); // 4
		System.out.println(list);//[D A E B]
		
		list.add(1,"x");// lets insert x in Loc 2
		System.out.println(list);//[D X A E B]
		
		list.remove(2);// lets remove 3rd ele
		System.out.println(list);//[D X E B]
		
		
	}

}
