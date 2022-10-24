package com.seed;

import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame
{
      JLabel lblUser,lblPwd;
      JTextField txtUser;
      JList list;
      JComboBox jc;
      JScrollPane jsp;
      
      JRadioButton rbFemale,rbMale;
      JCheckBox chk1,chk2,chk3;
      
      ButtonGroup grp;
      
      JPasswordField txtPwd;
      JButton btnCancel,btnSubmit;
      
      public MyFrame() 
      {
    	  lblUser=new JLabel("User Name");
    	  lblPwd=new JLabel("Password");
    	  
    	  txtUser=new JTextField(15);
    	  txtPwd=new JPasswordField(15);
    	  txtUser.setEditable(false);
    	  
    	  chk1=new JCheckBox("Reading");
    	  chk2=new JCheckBox("Sleeping");
    	  chk3=new JCheckBox("Missed calls");
    	  
    	  rbFemale=new JRadioButton("Female");
    	  rbMale=new JRadioButton("Male");
    	  grp=new ButtonGroup();
    	  
    	  Vector v=new Vector();
    	  v.add("C");
    	  v.add("C++");
    	  v.add("Core java");
    	  v.add("Adv. java");
    	  v.add("SQL");
    	  
    	  list=new JList(v);
    	  jsp=new JScrollPane(list,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    	  list.setVisibleRowCount(3);
    	  
    	  
    	  Vector v1=new Vector();
    	  v1.add("BCA");
    	  v1.add("BCS");
    	  v1.add("BE");
    	  v1.add("ME");
    	  v1.add("MCA");
    	  
    	  jc=new JComboBox(v1);
    	  
    	  btnCancel=new JButton("Cancel");
    	  btnSubmit=new JButton("Submit");
    	  
    	  
    	  this.add(lblUser);
    	  add(txtUser);
    	  add(lblPwd);
    	  add(txtPwd);
    	  add(chk1);
    	  add(chk2);
    	  add(chk3);
    	  add(jsp);
    	  add(jc);
    	  
    	  
    	  grp.add(rbFemale);
    	  grp.add(rbMale);
    	
    	  
    	  add(rbFemale);
    	  add(rbMale);
    	  add(btnSubmit);
    	  add(btnCancel);
    	  
    	  setVisible(true);
    	  setSize(300,200);
    	  setLayout(new FlowLayout());
    	  setTitle("MyFrame...");
    	  
      }
      
      public static void main(String[] args) {
		new MyFrame();
	}
      
      
      
	
	
	
}
