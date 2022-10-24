package com.seed;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class ReentrantDemo 
{
 
      private int cnt;
      
      Lock l=new ReentrantLock();
      
      private void todo()
      {
    	  Thread t1=new Thread(new Runnable()
    	  {
			@Override
			public void run()
			{
			  for(int i=1;i<=10000;i++)
			  {
				//  l.lock();
				  cnt++;
				 //l.unlock();
			  }
			}
		});
    	  
    	  
    	    	  
    	  Thread t2=new Thread(new Runnable()
    	  {
			@Override
			public void run()
			{
			  for(int i=1;i<=10000;i++)
			  {
				 // l.lock();
				  cnt++;
				 //l.unlock();
			  }
			}
		});
    	  
    	  
    	  t1.start();
    	  t2.start();
    	  
    	  try {
			t1.join();
			  t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	  
    	  System.out.println("cnt:"+cnt);
      }
	
	
	public static void main(String[] args)
	{
		ReentrantDemo r=new ReentrantDemo();
		r.todo();

	}

}
