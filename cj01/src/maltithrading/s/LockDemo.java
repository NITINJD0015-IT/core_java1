package com.seed;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo
{
       int cnt;
     
      
      void incrementCnt() {
			
    	  cnt++;
    	 
		}
       
       void todo()
       {
    	   
    	   Thread t1=new Thread(new  Runnable() {
			
			@Override
			public void run()
			{
			       for(int i=1;i<=10000;i++)
			       {
			    	 incrementCnt();
			       }
				
			}
		});
    	   
    	   Thread t2=new Thread(new  Runnable() {
   			
   			@Override
   			public void run() 
   			{
   				for(int i=1;i<=10000;i++)
			       {
   					   incrementCnt();
   					
			       }
   				
   			}

			
   		});
    	   
    	   t1.start();
    	   
    	   try {
			t1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	   
    	   t2.start();
       	   
    	   
    	   try {
    		  
			t2.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  
    	   
    	   
    	 System.out.println("cnt:"+cnt); 
    	   
       }
       
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		LockDemo l=new LockDemo();
		l.todo();
	}

}
