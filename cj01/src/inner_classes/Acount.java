package innerClass;

public class Acount {
	int AId;
	String AName;
	double balance;

	public Acount(int aId, String aName, double balance) {

		AId = aId;
		AName = aName;
		this.balance = balance;
		l.disp();
	}

	class Locker{
		int LockId;
		
		public Locker(int lockId) {
			
			LockId = lockId;
		}

		void disp()
		{
			System.out.println(AId+"\n"+AName+"\n"+balance);
		}
	}
	Locker l = new Locker(101);
	
	public static void main(String[] args) {
		Acount a = new Acount(1234,"hitesh",20000); 
	}
}
