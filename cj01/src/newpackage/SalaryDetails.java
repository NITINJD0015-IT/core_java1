import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class SalaryDetails extends JFrame implements ActionListener {
	
	JLabel lblname,lblbasicsalary,lbltotalsalary,lblsalaryinhand;
	JTextField txtname,txtsalary,txttotalsalary,txtsalaryinhand;
	JCheckBox chkhra,chkda,chkpf,chktax;
	JButton btncalc,btnrigth,btnleft;
	JPanel p1,p2,p3,p4,p5,p6;
	double hra=10,gross,inhand;
	JList leftlist,rigthlist;
	JScrollPane skillsetleft,skillsetrigth;
	Vector<String>  skillleft,skillrigth;
	
	public SalaryDetails(){
		
		lblname = new JLabel("Name");
		lblbasicsalary = new JLabel("Basic Salary");
		lbltotalsalary = new JLabel("Total Salary");
		lblsalaryinhand = new JLabel("Salary in Hand");
		txtname = new JTextField(15);
		txtsalary = new JTextField(15);
		txttotalsalary = new JTextField(10);
		txtsalaryinhand = new JTextField(10);
		chkhra = new JCheckBox("HRA");
		chkda = new JCheckBox("DA");
		chkpf = new JCheckBox("PF");
		chktax = new JCheckBox("Tax");
		btncalc = new JButton("Calculate");
		btnrigth = new JButton(">>");
		btnleft = new JButton(">>");
		
		txttotalsalary.setEditable(false);
		txtsalaryinhand.setEditable(false);
		
		skillleft = new Vector<String>();
		skillleft.add("C");
		skillleft.add("C++");
		skillleft.add("Java");
		skillleft.add("Unix");
		skillleft.add("SQL");
		skillleft.add("JS");
		skillleft.add("XML");
		
		leftlist = new JList(skillleft);
		leftlist.setVisibleRowCount(4);
		
		skillsetleft = new JScrollPane(leftlist,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		skillrigth = new Vector<String>();
		rigthlist = new JList(skillrigth);
		rigthlist.setVisibleRowCount(4);
		skillsetrigth = new JScrollPane(rigthlist,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		skillsetrigth.setSize(20,10);
		
		p1= new JPanel();
		p2= new JPanel();
		p3= new JPanel();
		p4= new JPanel();
		p5= new JPanel();
		p6= new JPanel();
		
		p1.add(lblname);
		p1.add(txtname);
		p5.add(lblbasicsalary);
		p5.add(txtsalary);
		
		p2.add(chkhra);
		p2.add(chkda);
		p2.add(chkpf);
		p2.add(chktax);
		
		p6.add(skillsetleft);
		p6.add(btnrigth);
		p6.add(skillsetrigth);
		
		
		p3.add(lbltotalsalary);
		p3.add(txttotalsalary);
		p3.add(lblsalaryinhand);
		p3.add(txtsalaryinhand);
		
		p4.add(btncalc);
		
		add(p1);
		add(p5);
		add(p2);
		add(p6);
		add(p3);
		add(p4);
		
		p1.setBackground(Color.GRAY);
		p2.setBackground(Color.GRAY);
		p3.setBackground(Color.GRAY);
		p4.setBackground(Color.GRAY);
		p5.setBackground(Color.GRAY);
		
		//setResizable(false);
		setVisible(true);
        setSize(450,250);
        setLayout(new FlowLayout());
        setTitle("Salary Details");
        
        btncalc.addActionListener(this);
        chkhra.addActionListener(this);
        btnrigth.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getSource()==btnrigth){
	        java.util.List temp = leftlist.getSelectedValuesList();
			skillrigth.addAll(temp);
			skillleft.removeAll(temp);
			
			leftlist.setListData(skillleft);
			rigthlist.setListData(skillrigth);
			
			/*for(int i=0; i< skillleft.size();i++){
				if(leftlist.isSelectedIndex(i)==true){
					System.out.println(skillleft.get(i));
					skillrigth.add(skillleft.get(i));
					skillleft.remove(i);
					rigthlist.setListData(skillrigth);
					leftlist.setListData(skillleft);
				}
			}*/
			
		}
		
		
		
		/*double bsal = Double.parseDouble(txtsalary.getText());
		if(e.getSource()==chkhra){
			if(chkda.isSelected()){
				hra = bsal*0.1;
			}
		}
		if(e.getSource()==btncalc){
			gross = bsal+hra;
			inhand= bsal - hra;
			txtsalaryinhand.setText(""+bsal);
			txttotalsalary.setText(""+inhand);
		}*/
		
		
		
	}
	public static void main(String[] args) {
		new SalaryDetails();
	}
	

}
