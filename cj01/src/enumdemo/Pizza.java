package enumdemo;
public enum Pizza 
{
         SMALL,MEDIUM(10.0f,350.0f),LARGE(15.0f,750.0f);
         float price,dia;
         
         private Pizza() 
         {
		      dia=5.0f;
		      price=150.0f;
		}
         
         Pizza(float dia,float price)
         {
        	 this.dia=dia;
        	 this.price=price;        	 
         }
         
         void display()
         {
        	 System.out.println("In method....");
         }
         
         public static void main(String[] args) 
         {
		          Pizza p=Pizza.SMALL;
		          Pizza p1=Pizza.LARGE;
		         // System.out.println(p.price);
		          //System.out.println("MEDIUM price:"+MEDIUM.price);
		          
		         
		          
		          //System.out.println(LARGE.ordinal());
		          
		          Pizza v[]=Pizza.values();
		          
		          for(Pizza x:v)
		          {
		        	  System.out.println(x);
		        	  System.out.println(x.ordinal());
		          }
		          
		       
		          System.out.println("p compareTo p1:   "+p.compareTo(p1));
		          
		}
         
         
         
}
