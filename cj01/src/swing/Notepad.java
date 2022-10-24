

import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class Notepad extends JFrame{
	
	JMenuBar menuBar;
	JMenu file,edit;
	
	JMenuItem New,open,save,exit,cut,copy,paste; 
	JTextArea text;
	
	public Notepad()
	{
		menuBar=new JMenuBar();
		setJMenuBar(menuBar);
		
		file=new JMenu("File");
		edit=new JMenu("Edit");
		
		menuBar.add(file);
		menuBar.add(edit);
		
		New=new JMenuItem("New");
		open=new JMenuItem("Open");
		save=new JMenuItem("Save");
		exit=new JMenuItem("Exit");
		cut=new JMenuItem("Cut");
		copy=new JMenuItem("Copy");
		paste=new JMenuItem("Paste");
		
		file.add(New);
		file.add(open);
		file.add(save);
		file.add(exit);
		file.setMnemonic('F');
	
		edit.add(cut);
		edit.add(copy);
		edit.add(paste);
		edit.setMnemonic('E');
		copy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,KeyEvent.CTRL_DOWN_MASK));
		cut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_DOWN_MASK));
		text=new JTextArea();
		
		  Handler h=new Handler(this);

	        New.addActionListener(h);
	        open.addActionListener(h);
	        save.addActionListener(h);
	        exit.addActionListener(h);
	        cut.addActionListener(h);
	        copy.addActionListener(h);
	        paste.addActionListener(h);
	        
	        text.addMouseListener(h);
	    setSize(500,500);
	    setVisible(true);
	    setTitle("Notepad");
        add(text);
	    
      
	}
	
	
}
