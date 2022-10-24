
package test;


public class A {
   int x = 10;
   {
       System.out.println("x :"+x);
       System.out.println("Y  :"+((B)this).y);
}
}