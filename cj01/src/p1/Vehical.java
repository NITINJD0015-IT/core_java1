class Vehicle{  
	int speed=50;

	public Vehicle() {
		System.out.println("Vehicle is created");
	}
	void display(){ 

		System.out.println("VVVVVVVVV");//will print speed of Bike   
	} 

}  
class Bike3 extends Vehicle{  
	
	int speed=100;
	void display(){ 
		super.display();
		System.out.println(speed);//will print speed of Bike   
		
	}
	{speed=400;}
	public static void main(String args[]){  
		Bike3 b=new Bike3();  
		b.display();  
	}  
}  