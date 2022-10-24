package com.seed;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Handler implements ActionListener
{
       EventDemo e1;
	
	public Handler(EventDemo eventDemo) 
	{
		e1=eventDemo;
	}

	   @Override
	  	public void actionPerformed(ActionEvent e)
	      {
		      if(e.getSource()==e1.btn1)
	  		   e1.txt1.setText("Enter U R Name...");
		      if(e.getSource()==e1.btn2)
		    	  e1.txt1.setText("");
	  		
	  	}
          
}
