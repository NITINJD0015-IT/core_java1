package com.nt;

class ThreadDemo3 {
	public static void main(String[] args) throws Exception {
		/*
		 * ====---====Lambda expression ======---====
		 * Runnable obj1 = () -> { for (int i = 0; i < 5; i++) {
		 * System.out.println("Hi"); try { Thread.sleep(1000); } catch (Exception e) {
		 * e.printStackTrace(); } } };
		 */

		
//when u r creating thread obj it takes only runnable obj or only name parameter or both 
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hi"+ Thread.currentThread().getPriority());
				try {Thread.sleep(1000);} catch (Exception e) {	e.printStackTrace();}
			}
		},"Hi Thread");//u can here also give th-name as a parameter
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello");
				try {Thread.sleep(1000);} catch (Exception e) {	e.printStackTrace();}
			}
		});
		
		
		//t1.setName("Hi Thread");//changing thread name
		t2.setName("Hello Thread");
		
		System.out.println(t1.getName());//geting thread name and printing
		System.out.println(t2.getName());
		
		t1.setPriority(1);//changeing priority 1 thread priority range between (1-10) bydefault is 5  
		t2.setPriority(Thread.MAX_PRIORITY); //is a good way to set priority.normal-5 min-1
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		//Thread.currentThread().getPriority();
		//Thread.currentThread().getPriority();
		
		t1.start();
		try { Thread.sleep(10);	} catch (Exception e) {	e.printStackTrace();	}
		t2.start();
		
		System.out.println(t1.isAlive());
		t1.join();
		t2.join(); 
		
		System.out.println("Bye");
	}
}

//====using ananumas class
/*
 * class ThreadDemo3 { public static void main(String[] args) {
 * 
 * Runnable obj1 = new Runnable() { public void run() { for (int i = 0; i < 5;
 * i++) { System.out.println("Hi"); try { Thread.sleep(1000); } catch (Exception
 * e) {
 * 
 * e.printStackTrace(); } } } };
 * 
 * Runnable obj2 = new Runnable() { public void run() { for (int i = 0; i < 5;
 * i++) { System.out.println("Hello"); try { Thread.sleep(1000); } catch
 * (Exception e) {
 * 
 * e.printStackTrace(); } } } };
 * 
 * Thread t1 = new Thread(obj1); Thread t2 = new Thread(obj2); t1.start(); try {
 * Thread.sleep(10); } catch (Exception e) {
 * 
 * e.printStackTrace(); } t2.start(); } }
 */

//-----------------------------------------------------------
/*
 * class Hi2 implements Runnable { public void run() { for (int i = 0; i < 5;
 * i++) { System.out.println("Hi"); try { Thread.sleep(1000); } catch (Exception
 * e) {
 * 
 * e.printStackTrace(); } } } }
 * 
 * class Hello2 implements Runnable { public void run() { for (int i = 0; i < 5;
 * i++) { System.out.println("Hello"); try { Thread.sleep(1000); } catch
 * (Exception e) {
 * 
 * e.printStackTrace(); } } } }
 */
