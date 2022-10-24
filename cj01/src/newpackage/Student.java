

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;

public class Student extends JFrame {
	
	JLabel lName,lQualification;
	JTextField tName;
	
	JButton bInsert,bExtract,bRegister,bCancel,bReset;
	JComboBox cQualification;
	
	JList cSubjectOffered,cSubjectSelected;
    JSplitPane sp;
    
    Vector<String> suboffervector,subselectedvector;
    JPanel parent,p1,p2,p3,p4,p5;
    
	Student()
	{
		
		StudentHandler h1=new StudentHandler(this);
	   
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();
		p4=new JPanel();
	
		
		
		lName=new JLabel("Name:");
		tName=new JTextField(10);
		
		lQualification=new JLabel("Qualification");
		String []quali={"B.E.(Comp)","BCS","BCA","MCA","MCS"};
		cQualification = new JComboBox(quali);
		
		 suboffervector=new Vector<String>();
         
			suboffervector.add("C");
			suboffervector.add("C++");
			suboffervector.add("Core Java");
			suboffervector.add("WCD");
			suboffervector.add("C#");
			suboffervector.add("Asp.net");
			
			cSubjectOffered=new JList(suboffervector);
			cSubjectOffered.setVisibleRowCount(3);
			JScrollPane jsp=new JScrollPane(cSubjectOffered, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

			subselectedvector=new Vector<String>();
			cSubjectSelected=new JList();
			cSubjectSelected.setVisibleRowCount(3);
			JScrollPane js=new JScrollPane(cSubjectSelected,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			
			bInsert=new JButton(">>");
			bExtract=new JButton("<<");
			
			bRegister=new JButton("Register");
			bCancel=new JButton("Cancel");
			bReset=new JButton("Reset");
		   
			
		p1.add(lName);
		p1.add(tName);
		p2.add(jsp);
		p2.add(js);
		p2.add(bInsert);
		p2.add(bExtract);
		p3.add(bRegister);
		p3.add(bCancel);
		p3.add(bReset);
	   	p4.add(lQualification);
		p4.add(cQualification);
		
       	
		bInsert.addActionListener(h1);
		bExtract.addActionListener(h1);
		
		bRegister.addActionListener(h1); 
		bReset.addActionListener(h1);
		
        bCancel.addActionListener(h1); 

       
        this.setLayout(new FlowLayout(FlowLayout.CENTER,400,10));
		add(p1);add(p4);add(p2);add(new JPanel()); add(p3);
		
		
		setSize(600,400);
		setResizable(false);
		setVisible(true);
	
	}
}
