package annotation;
class MyDate
{
	private int day;
	private int month;
	private int year;
	private static int cnt;
	

	void init(int d,int m,int y)
	{
		day=d;
		month=m;
		year=y;
	}  

	MyDate()
	{
		cnt++;
		this.day=1;
		this.month=1;
		this.year=2000;	
	} 

	MyDate(int day,int month,int year)
	{
		cnt++;
		this.day=day;
		this.month=month;
		this.year=year;
	}  

	void setDay(int d)
	{
		this.day=d;
	}
	void display()
	{
		System.out.println(day+"/" +month+"/"+year);
	}
	
	int getMonth()
	{
		return month;
	}

	static int getCnt()
	{
		return cnt;
	}
	
	public String toString()
	{
		return day+"/"+month+"/"+year; 
	}

	@Override
	public boolean equals(Object obj) 
	{
		 MyDate d=(MyDate)obj;
		
		if(this.day==d.day && this.month==d.month && this.year==d.year)
			return true;
		else
			return false;
		
	}

}