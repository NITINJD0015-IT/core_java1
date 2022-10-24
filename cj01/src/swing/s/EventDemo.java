package com.seed;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class EventDemo extends JFrame 
{
      JButton btn1,btn2;
      
      JTextField txt1;
      
      public EventDemo() {
	
    	  btn1=new JButton("Click");
    	  btn2=new JButton("Cancel");
    	  txt1=new JTextField(15);
    	  
    	  
    	  add(txt1);
    	  add(btn1);
    	  add(btn2);
    	  
    	  Handler h=new Handler(this);
    	  
    	  btn1.addActionListener(h);
    	  btn2.addActionListener(h);
    	  
    	  setVisible(true);
    	  setLayout(new FlowLayout());
    	  setSize(200,200);
    	  
	}
	
   
	
	
	







	

}
