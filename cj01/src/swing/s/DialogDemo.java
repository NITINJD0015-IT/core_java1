package com.seed;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogDemo extends JFrame implements ActionListener
{
      JButton btn1;
      
      public DialogDemo()
      {
	
    	  btn1=new JButton("Click ...");
    	  add(btn1);
    	  btn1.addActionListener(this);
    	  setVisible(true);
    	  setLayout(new FlowLayout());
    	  
    	  btn1.setToolTipText("Clik me....");
    	  
 	  }
	
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
	     JOptionPane jp=new JOptionPane();
	    // jp.showMessageDialog(this,"Hello");
	     //jp.showConfirmDialog(this,"Hello....");
	     JOptionPane.showMessageDialog(this,"Msg","Hello....",JOptionPane.ERROR_MESSAGE);
	     
	}
	
	
	
	public static void main(String[] args)
	{
	        new DialogDemo();
            
	}

	

}
