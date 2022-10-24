package inner_classes;
public class MethodInner
{
    private int p=40;
    
    void show()
    {
    	   final int q=10;
    	 
    	 class Inner
    	 {
    		 int r=20;    		 
    		 void display()
    		 {
    			 System.out.println("r:"+r);
    			 System.out.println("q:"+q);
    			 System.out.println("p"+p);
    		 }   		 
    	 }   
    	 
    	 Inner in=new Inner();
    	 in.display();
    }
	
    
    
    
	
	
	
	public static void main(String[] args) 
	{
		MethodInner m=new MethodInner();
		m.show();

		
		
		
	}

}
