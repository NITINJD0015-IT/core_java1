import javax.swing.*;  
public class MyTable extends JFrame
{  
    
    JTable jt;

    MyTable()
    {  
    
      
    String data[][]={ {"101","Amit","670000"}, {"102","Jai","780000"},{"101","Sachin","700000"}};  
    String column[]={"ID","NAME","SALARY"};  
      
    JTable jt=new JTable(data,column);  
    jt.setBounds(30,40,200,300);  
      
    JScrollPane sp=new JScrollPane(jt);  
    
  
    add(sp);  
      
    setSize(300,400);  
    setVisible(true);  
}  
public static void main(String[] args) {  
    new MyTable();  
}  
}  