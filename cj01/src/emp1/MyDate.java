
public class MyDate {
	
		private int dd;
		private int mm;
		private int yy;
		
		MyDate(){
			dd= mm= yy= 0;
		}
		
		MyDate(int dd,int mm,int yy){
			this.dd= dd;
			this.mm= mm;
			this.yy= yy;
		}
		
//		void display(){
//			System.out.println(dd+"/"+mm+"/"+yy);
//		}
		public String toString(){
			return dd+"/"+mm+"/"+yy;
		}
}
