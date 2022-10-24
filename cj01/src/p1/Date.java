package p1;


public class Date {
	
	int dd;
	int mm;
	int yy;
	
	Date()
	{
		dd = 7;
		mm = 8;
		yy = 1990;
	}
	
	Date(int dd,int mm,int yy){
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public String toString(){
		//System.out.println(dd+"-"+mm+"-"+yy);
		return dd+"-"+mm+"-"+yy;
	}
	public static void main(String []args){
		Date q = new Date();
		//q.display();
		Date w = new Date(6,8,1996);
		System.out.println(w);
		//w.display();
	}
}
