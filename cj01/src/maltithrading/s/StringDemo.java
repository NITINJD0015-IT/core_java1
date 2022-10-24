package com.seed;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class StringDemo extends JFrame implements Runnable
{
	int x1=10,x2=550;
    Thread thread1;
    Thread thread2;
	
     public StringDemo() 
     {
    	 thread1=new Thread(this,"t1");
    	 thread2=new Thread(this,"t2");
	        
    	 thread1.start();
	        thread2.start();
	        
	        setVisible(true);
	        setSize(600,300);
     }
	
     @Override
    public void paint(Graphics g)
     {
       	super.paint(g);
       	
       	Font f=new Font("Times New Roman",Font.BOLD,25);
       	g.setColor(Color.BLUE);
       	g.drawString("Seed",x1,150);
       	g.drawString("Infotech",x2,150);
       	
       	
    }

	@Override
	public void run() 
	{
		while(true)
		{
		if(Thread.currentThread().getName().equals("t1"))
			x1++;
		if(Thread.currentThread().getName().equals("t2"))
			x2--;
		   repaint();  
		
		        try {
					Thread.sleep(10);
				}
		        catch (InterruptedException e)
				{
					
					e.printStackTrace();
				}
		   
		}
		
		
	
		
		
	}
	 
     public static void main(String[] args) {
		new StringDemo();
	}
     
     
}
