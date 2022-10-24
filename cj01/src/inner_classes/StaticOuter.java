package inner_classes;
public class StaticOuter
{
	static private int p=10;
    
   static class Inner
    {
 	  public int val=20;
 	   
 	    void show()
 	   {
 		   System.out.println("p:"+p);
 		   System.out.println("val:"+val);
 	   }    	   
    }
   
		
	
	public static void main(String[] args) 
	{
			StaticOuter.Inner in=new StaticOuter.Inner();
              in.show();
              System.out.println(in.val);
	}

}
