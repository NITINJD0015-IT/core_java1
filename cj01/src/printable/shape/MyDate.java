package printable.shape;

public class MyDate implements Printable {
	
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
		
		public void print(){
			System.out.println(dd+"-"+mm+"-"+yy);
		}
}
