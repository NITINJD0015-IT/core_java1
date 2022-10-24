package com.seed;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridDemo extends JFrame
{
	 JButton b1,b2,b3,b4,b5,b6;
	 
	 public GridDemo() {
		 b1=new JButton("b1");
  	   b2=new JButton("b2");
  	   b3=new JButton("b3");
  	   b4=new JButton("b4");
  	   b5=new JButton("b5");
  	   b6=new JButton("b6");
  	   
  	   add(b1);
  	   add(b2);
  	   add(b3);
  	   add(b4);
  	   add(b5);
  	   add(b6);
  	   
  	   setVisible(true);
  	   setSize(300,300);
  	   setLayout(new GridLayout(3,3));
  	   
  	   
  	   
  	   
	}
	
	

	public static void main(String[] args) {
	
        new GridDemo();
	}

}
