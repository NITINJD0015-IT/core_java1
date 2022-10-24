package notepad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotpadHandler implements ActionListener
{
	
     NotePad note;	
     String str=null;

	public NotpadHandler(NotePad notePad)
	{
	      note=notePad;  	
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource()==note.cut)
		{
			 //str=note.text.getSelectedText();
			 //note.text.replaceSelection("");
			
			note.text.cut();
			
		}
		if(e.getSource()==note.paste)
		{
			//note.text.replaceSelection(str);
		    note.text.paste();
		
		}
		
		if(e.getSource()==note.exit)
			System.exit(0);
		
		
		
	}
   
}
