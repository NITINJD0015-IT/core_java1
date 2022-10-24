package com.seed;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class BallDemo extends JFrame implements Runnable
{
      Thread t1,t2,t3;
      int t1_x=10,t2_x=10,t3_x=10;
	
	  BallDemo()
	  {
		  t1=new Thread(this);
		  t2=new Thread(this);
		  t3=new Thread(this);
		  
		  t1.start();
		  t2.start();
		  t3.start();
		  
		  setVisible(true);
		  setSize(600,600);
	  }
	  
	  @Override
	public void paint(Graphics g)
	  {
		super.paint(g);
		g.setColor(Color.RED);
		g.fillOval(t1_x,50,50,50);

		g.setColor(Color.GREEN);
		g.fillOval(t2_x, 250,50,50);
		
		g.setColor(Color.BLUE);
		g.fillOval(t3_x, 450,50,50);
		
	}
	
	
	@Override
	public void run()
	{
		while(true)
		{
	    if(Thread.currentThread().equals(t1))
	    {
	    	t1_x++;
	    	
			synchronized (this)
			{
				
			
	    	if(t1_x==300)
				try {
					wait();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
	    	try 
	    	{
					Thread.sleep(10);
			}
	    	catch (InterruptedException e) 
			{
			e.printStackTrace();
			}
	    	
	    }
	    if(Thread.currentThread().equals(t2))
	    {
	    	t2_x++;
	    	
	    	synchronized(this)
	    	{
	    	if(t2_x==300)
	    		
				try 
	    		{
					wait();
				} 
	    		catch (InterruptedException e1)
				{
				
					e1.printStackTrace();
				}
	    	}
	    	try 
	    	{
					Thread.sleep(30);
			}
	    	catch (InterruptedException e) 
			{
			e.printStackTrace();
			}
	    }
	    if(Thread.currentThread().equals(t3))
	    {
	    	t3_x++;
	    	synchronized (this)
	    	{	
			
	    	if(t3_x==300)
				
	    		notifyAll();
	    	}
	    	
	    	
	    	try 
	    	{
					Thread.sleep(50);
			}
	    	catch (InterruptedException e) 
			{
			e.printStackTrace();
			}
	    }
	    repaint();
		}
		
	}
	
	public static void main(String[] args) {
		new BallDemo();
	}

}
