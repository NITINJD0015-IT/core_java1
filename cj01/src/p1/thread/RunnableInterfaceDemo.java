package thread;

public class RunnableInterfaceDemo implements Runnable {

	Thread t;
	public RunnableInterfaceDemo() {
		// TODO Auto-generated constructor stub
		t = new Thread(this);
		t.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("runnable interface method ");
	}
	
	public static void main(String[] args) {
		RunnableInterfaceDemo r = new RunnableInterfaceDemo();
	
	}
	
}
