
package svsmcf;


public class B extends A {
    static int b = m2();

    static int m2() {
        System.out.println("BSV");
        return 20;
    }
    static{
        System.out.println("BSB");
    }

    public static void main(String[] args) {
        System.out.println("B Main");
        System.out.println("\nB main a:"+ a);
        System.out.println("\nB Main b"+ b);
    }
}
