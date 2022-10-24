
public class Mydate {
	
		private int edate;
		private  int emonth;
		private  int eyear;
		Mydate(){
			 edate= emonth= eyear= 0;
		}
		Mydate(int date,int month,int year){
			edate= date;
			emonth= month;
			eyear= year;
		}
		void display(){
			System.out.println(edate+"/"+emonth+"/"+eyear);
		}
}

class Hello
{
	
	public static void main(String args[]){
		Mydate o1 = new Mydate();
		o1.display();
		Mydate o2 = new Mydate(6,7,1990);
		o2.display();
	}
}