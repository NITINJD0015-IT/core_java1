package com.seed;

class TestJoinMethod1 extends Thread{  
 public TestJoinMethod1(String string) {
	super(string);
	}

public void run(){  
  for(int i=1;i<=5;i++){  
    
	   if(Thread.currentThread().getName().equals("t1"))
	   {
		   System.out.println("t1");
	   }
	   if(Thread.currentThread().getName().equals("t2"))
	   {
		   System.out.println("t2");
	   }
	   if(Thread.currentThread().getName().equals("t3"))
	   {
		   System.out.println("t3");
	   }
	  
	  try{  
	     
	   
          Thread.sleep(500);  
        }catch(Exception e){System.out.println(e);
   }  
  //System.out.println(i);  
  }  
 }  
 
public static void main(String args[]){  
 TestJoinMethod1 t1=new TestJoinMethod1("t1");  
 TestJoinMethod1 t2=new TestJoinMethod1("t2");  
 TestJoinMethod1 t3=new TestJoinMethod1("t3");  
 t1.start();

 try{  
  t1.join();  
 }catch(Exception e){System.out.println(e);
 }  
 t2.start();  
 t3.start();  
 
 }  
}  