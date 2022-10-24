package com.seed;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame
{
	       JButton b1,b2,b3,b4,b5;
	       
	       public BorderLayoutDemo() {
		
	    	   b1=new JButton("North");
	    	   b2=new JButton("South");
	    	   b3=new JButton("West");
	    	   b4=new JButton("East");
	    	   b5=new JButton("Center");
	    	   
	    	   add(b1,BorderLayout.NORTH);
	    	   add(b2,"South");
	    	   add(b3,BorderLayout.WEST);
	    	   add(b4,BorderLayout.EAST);
	    	   add(b5,BorderLayout.CENTER);
	    	   
	    	   
	    	   setVisible(true);
	    	   setSize(400,300);
	    	   
	    	   
	    	   
	    	   
	    	   
		}
	 
		
	public static void main(String[] args)
	{
	   new BorderLayoutDemo();	

	}

}
