class B extends A 
{
	static int b = m2();

	static int m2(){
	System.out.println("BSV");
	return 20;
	}

	static{ 
		System.out.println("BSB");
	} 

	public static void main(String[] args) 
	{
		System.out.println("B main");
	}
}
