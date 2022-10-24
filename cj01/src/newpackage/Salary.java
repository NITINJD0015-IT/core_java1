

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Salary extends JFrame {
	private JLabel lName,lBasic,lTotal,lGross;
	 JTextField tName,tBasic,tTotal,tGross;
	 JCheckBox cHra,cDa,cPf,cTax;
	 JButton bCalculate;
	 JPanel p1,p2,p3,p4,p5,p6;
	
	
	Salary()
	{
		lName=new JLabel("Name");
		lBasic=new JLabel("Basic Salary");
		lTotal=new JLabel("Total Salary");
		lGross=new JLabel("Gross");
		lGross=new JLabel("Salary in Hand");
		
		tName=new JTextField(10);
		tBasic=new JTextField(10);
		tTotal=new JTextField(10);
		tGross=new JTextField(10);
		
			
		cHra=new JCheckBox("HRA");
		cDa=new JCheckBox("DA");
		cPf=new JCheckBox("PF");
		cTax=new JCheckBox("I TAX");
			
		bCalculate =new JButton("Calculate");
			
		
		p1=new JPanel();
		p1.add(lName);
		p1.add(tName);
		
		
		p2=new JPanel();
		
		p2.add(lBasic);
		p2.add(tBasic);
		
	    p3=new JPanel();
	    
	    p3.add(cHra);
	    p3.add(cDa);
        p3.add(cPf);
	    p3.add(cTax);
	     
	    p4=new JPanel();
	    p4.add(lTotal);
	    p4.add(tTotal);
	    
	     p5 =new JPanel();
	  
	    p5.add(lGross);
	    p5.add(tGross);
	   
	  

	    FlowLayout layout=new FlowLayout();
	   // setLayout(layout);
	   
	    
	   //BorderLayout layout=new BorderLayout();
	   
	   setLayout(layout);
	   add(p1);
	   add(p2);
	   add(p3);
	   add(p4);
	   add(p5);
	   add(bCalculate);
	      
	    //add(bCalculate);
	    
	    setTitle("Salary_Details");
	    setVisible(true);
	    
	    setSize(300, 300);
	    setResizable(false);
	    
	    Handler h=new Handler(this);
	    bCalculate.addActionListener(h);
	    cDa.addActionListener(h);
	    cHra.addActionListener(h);
	    cPf.addActionListener(h);
	    cTax.addActionListener(h);
	    
	}

}
