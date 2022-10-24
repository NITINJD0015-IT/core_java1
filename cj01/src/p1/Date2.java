package p1;


/*public class Date2 {
	
	int dd;
	int mm;
	int yy;
	
	Date2(int dd,int mm,int yy){
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public String toString(){
		//System.out.println(dd+"-"+mm+"-"+yy);
		return dd+"-"+mm+"-"+yy;
	}
	static void swep(Date2 t1, Date2 t2 ){
		Date2 temp;
		temp = t1;
		t1 = t2;
		t2 = temp;
	}
	public static void main(String []args){
		Date2 w = new Date2(6,8,1996);
		Date2 q = new Date2(4,9,1980);
		System.out.println(w);
		System.out.println(q);
		swep(w,q);
		System.out.println(w);
		System.out.println(q);
	}
}
*/


public class Date2 {
	
	int dd;
	int mm;
	int yy;
	
	Date2(int dd,int mm,int yy){
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	public String toString(){
		//System.out.println(dd+"-"+mm+"-"+yy);
		return dd+"-"+mm+"-"+yy;
	}
	static void swep(Date2 a[] ){
		Date2 temp;
		temp = a[0];
		a[0] = a[1];
		a[1] = temp;
	}
	public static void main(String []args){
		 Date2 w[] = new Date2 [2];
		 w[0] = new Date2(6,8,1996);
		 w[1] = new Date2(3,9,2015);
		System.out.println(w[0]);
		System.out.println(w[1]);
		swep(w);
		System.out.println(w[0]);
		System.out.println(w[1]);
	}
}
