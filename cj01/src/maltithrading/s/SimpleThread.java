package com.seed;

public class SimpleThread extends Thread
{
   
	public SimpleThread(String name) 
	{
	        super(name);	
	}




	@Override
	public void run() 
	{
		while(true)
		{
	     if(Thread.currentThread().getName().equals("t1"))
	    	 System.out.println("seed");
		
	     if(currentThread().getName().equals("t2"))
	    	 System.out.println("infotech");
		
	        	try 
	        	{
					Thread.sleep(500);
				}
	        	catch (InterruptedException e)
				{
					
					e.printStackTrace();
				}
			
		}
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		SimpleThread t1=new SimpleThread("t1");
		t1.start();
		SimpleThread t2=new SimpleThread("t2");
		t2.start();
		//System.out.println("In main...");
		
		
	}

}
