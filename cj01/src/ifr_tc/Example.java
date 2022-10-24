
package ifr_tc;


public class Example {
static int a = 10;
    static {
        System.out.println("From SB");
        System.out.println("a :"+a);
        System.out.println("b :"+Example.b);
       // System.out.println("b :"+b);
       b = 50;
       System.out.println("b :"+Example.b);
    }
    public static void main(String[] args) {
        System.out.println("From MM");
        System.out.println("a :"+a);
        System.out.println("b :"+b);
    }
    //
    static int b = 20;
   // static int b;
}
