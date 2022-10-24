class Demo1 {
	int speedlimit=90;  
}  
class Honda3 extends Demo1{  
	int speedlimit=150;  

	public static void main(String args[]){  
		Demo1 obj=new Demo1();  
		System.out.println(obj.speedlimit);//90  
	}
}