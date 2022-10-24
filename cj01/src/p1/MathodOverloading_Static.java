
public class MathodOverloading_Static{   
	static int add(int a,int b){
		return a+b;
		}  
	static int add(int a,int b,int c){
		return a+b+c;
		}   

	public static void main(String args[]){  

		MathodOverloading_Static obj=new MathodOverloading_Static();  
		System.out.println(obj.add(10,10,10));  
		System.out.println(obj.add(20,20));  

	} 
}  
