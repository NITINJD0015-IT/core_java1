package cloneDemo;

class Mydate implements Cloneable{

	int edate;
	int emonth;
	int eyear;
	
	
	public Mydate() {
		
	}
	void setDate(int date, int month, int year)
	{
		edate =date;
		emonth = month;
		eyear= year;

	}
	void display()
	{
		System.out.println(edate+"/"+emonth+"/"+eyear);
	}
	public Object clone()throws CloneNotSupportedException{  
//		Mydate n = new Mydate(this.edate,this.emonth,this.eyear);
//		return n;
		return super.clone();  
	}  
	public Mydate(int edate, int emonth, int eyear) {
		super();
		this.edate = edate;
		this.emonth = emonth;
		this.eyear = eyear;
	}
	public static void main(String[] args)
	{
		try{
			Mydate a = new Mydate(7,8,2015);

			//a.setDate(7,8,2015);

			a.display();
			Mydate b =(Mydate)a.clone(); 
			b.display();
		}catch(Exception e){System.out.println(e);}
	}

}
