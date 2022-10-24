package notepad;

import java.awt.MenuBar;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class NotePad extends JFrame
{
    JMenuBar menubar;
    JMenu file,edit;
    JMenuItem open,save,create,copy,cut,paste,exit;
    JTextArea text;
    
   public NotePad() 
   {
	   	menubar=new JMenuBar();
	   	file=new JMenu("File");
	   	edit=new JMenu("Edit");
	   	
	   	open=new JMenuItem("Open");
	   	save=new JMenuItem("Save");
	   	create=new JMenuItem("New");
	   	copy=new JMenuItem("Copy");
	   	cut=new JMenuItem("Cut");
	   	paste=new JMenuItem("Paste");
	   	exit=new JMenuItem("Exit");
	   	text=new JTextArea();
	   	
	   	menubar.add(file);
	   	menubar.add(edit);
	   	
	   	file.add(create);
	   	file.add(open);
	   	file.add(save);
	   	file.add(exit);;;;;;;;;;
	   	
	   	edit.add(cut);
	   	edit.add(copy);
	   	edit.add(paste);
	   	
	   	
	   	NotpadHandler h=new NotpadHandler(this);
	   	cut.addActionListener(h);
	   	copy.addActionListener(h);
	   	open.addActionListener(h);
	   	save.addActionListener(h);
	   	create.addActionListener(h);
	   	paste.addActionListener(h);
	   	exit.addActionListener(h);
	   	
	   	
	   	setJMenuBar(menubar);
	   	add(text);
	   	
	   	setVisible(true);
	   	setSize(400,400);
	   	setTitle("My NotePad");
	   	setDefaultCloseOperation(EXIT_ON_CLOSE);
	   	
	   	
	   	
   }
    
   public static void main(String[] args) {
	new NotePad();
}
    
    
    
}
