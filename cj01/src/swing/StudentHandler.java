

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Character.Subset;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class StudentHandler implements ActionListener {

	Student s1;
	JDialog d1;
	public StudentHandler(Student student) {
		// TODO Auto-generated constructor stub
		s1=student;
		d1=new JDialog(s1, "Message Window");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getSource().equals(s1.bReset))
		{
			s1.tName.setText("");
			s1.cQualification.setSelectedIndex(0);
			
			
			s1.suboffervector.addAll(s1.subselectedvector);
			s1.subselectedvector.removeAll(s1.subselectedvector);
			s1.cSubjectOffered.setListData(s1.suboffervector);
			s1.cSubjectSelected.setListData(s1.subselectedvector);
			
		}
		
		if(e.getSource()==s1.bInsert)
		{
			List temp=s1.cSubjectOffered.getSelectedValuesList();
			s1.subselectedvector.addAll(temp);
			s1.suboffervector.removeAll(temp);
			
			s1.cSubjectOffered.setListData(s1.suboffervector);
			s1.cSubjectSelected.setListData(s1.subselectedvector);
				
			} 
		
		if(e.getSource().equals(s1.bExtract))
		{
			List temp=s1.cSubjectSelected.getSelectedValuesList();
			s1.suboffervector.addAll(temp);
			s1.subselectedvector.removeAll(temp);
			
			s1.cSubjectSelected.setListData(s1.subselectedvector);
			s1.cSubjectOffered.setListData(s1.suboffervector);
			
		}
	
		
		if(e.getSource().equals(s1.bRegister))
		{
			String str=s1.tName.getText();
			if(str.isEmpty())
			{
			
				
				JOptionPane.showMessageDialog(s1, "Name cannot be left blank.Please enter name.", "Validation problem", JOptionPane.ERROR_MESSAGE);
			}

			String s=s1.tName.getText();
			String s2=s.toUpperCase();
			
			if(!(s.equals(s2)))
			{
				//MyDialog md=new MyDialog(s1, "Message Window", true);
				//md.setSize(350, 100);
				//md.setVisible(true); 
			
				
			}
			
		}
		
		if(e.getSource()==s1.bCancel)
		{
			s1.dispose();
		}
		
	}

	
}
