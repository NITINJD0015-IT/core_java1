package collection;
import java.util.*;
public class TreesetDemo {
	public static void main(String args[]){
		
		TreeSet<String> list = new TreeSet<>(); 
		
		list.add("M");
		list.add("D");
		list.add("N");
		list.add("L");
		list.add("D");
		list.add("N");
		list.add("L");
		
		System.out.println(list);//[D L M N]
	}

}
