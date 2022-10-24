//java notepad


import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Handler extends MouseAdapter implements ActionListener{

	static String clipboard;
	Notepad note;
	Container contentPane;
    JFileChooser fc;
  //  JButton color;
	public Handler(Notepad n)
	{
		note=n;
		//color=new JButton("Color");
//		 contentPane =new Container();

		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	
//		if(e.equals(note.New))
		if(e.getSource()==note.New)
		{
			int i=JOptionPane.showConfirmDialog(note,"Do u want to save changes?");
			
			if(i==1)
			   note.text.setText("");
			
			if(i==0)
			{
				JFileChooser fc=new JFileChooser(".");
				int retVal=fc.showOpenDialog(note);
				
			}
			
			
		}
		if(e.getSource()==note.cut)
		{
			note.text.cut();
			
			//clipboard=note.text.getSelectedText();
			//note.text.replaceSelection("");
			//String str=note.text.getSelectedText().replace(note.text.getSelectedText(),"");
			
		}
		if(e.getSource()==note.copy)
		{
			//clipboard=note.text.getSelectedText();
			note.text.copy();			
		}
		if(e.getSource()==note.paste)
		{
					note.text.paste();
			//note.text.replaceSelection(clipboard);
		}
		if(e.getSource()==note.open)
		{
			fc=new JFileChooser(".");
			//fc.setControlButtonsAreShown(false);
			note.text.add(fc);
	        fc.showOpenDialog(note);
		}
		if(e.getSource()==note.save)
	     {
			
	     }
	
		if(e.getSource()==note.exit)
		{
			int i=JOptionPane.showConfirmDialog(note,"Do u want to exit?");
			System.out.println("i:"+i);
			
			if(i==0)
				System.exit(0);
			
			
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getButton()==3)
		{
			//note.add(color);
			 JColorChooser jc=new JColorChooser();
			 Color col=jc.showDialog(note,"Color Chooser",Color.red);
			  clipboard=note.text.getSelectedText();
		      note.text.setForeground(col); 	 
		}
	}
	

}
