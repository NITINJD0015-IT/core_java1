package com.seed;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PaintDemo extends JFrame implements ActionListener
{
       JButton btn1;
       JColorChooser jc;
       JLabel lbl1;
       public PaintDemo()
       { 
    	 btn1=new JButton("Click");
    	 lbl1=new JLabel("Color me.....");
    	 jc=new JColorChooser();	
    	 
    	 add(btn1);
    	 add(lbl1);
    	 add(jc);
    	 btn1.addActionListener(this);
    	 setVisible(true);
		 setSize(600,600);
		 
		 setLayout(new FlowLayout());
		 
       }
	
	
	
	/*@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		
		g.setColor(Color.BLUE);
		g.fillOval(40,100,50,50);
		
		g.setColor(new Color(145,155,109));
		g.fillRect(50,300,100,100);
		g.setColor(Color.RED);
		
		Font f=new Font("Monotype corsiva",Font.BOLD,25);
		g.setFont(f);
		g.drawString("Seed Infotech",100,150);
		
		
	}
	*/
	
	
	public static void main(String[] args) 
	{
		 PaintDemo p=new PaintDemo();
		 
	}



	@Override
	public void actionPerformed(ActionEvent arg0)
	{
	    
	    lbl1.setForeground(jc.getColor());
	    
		
	}

}
