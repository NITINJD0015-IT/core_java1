import java.util.*;  
public class Sorttinf {  
	public static void main(String args[]){  

		ArrayList<String> al=new ArrayList<String>();  
		al.add("Saurav");  
		al.add("Mukesh");  
		al.add("Nitin");  
		al.add("Hitesh");
		Collections.sort(al);  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  

}
