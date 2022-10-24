
public class MathodOverriding_Static {
	 int add(int a,int b){
		return a+b;
		}  
}

 class BB extends MathodOverriding_Static{
	 int add(int a,int b){
		return a+b;
		}   
}

class Test {
	public static void main(String[] args){
		MathodOverriding_Static obj=new MathodOverriding_Static();  
		System.out.println(obj.add(10,10));  
		System.out.println(obj.add(20,20));
	}
}