package snsvm_ef;

public class Example2 {

    static Example2 e1 = new Example2();

    static {
        System.out.println("SB start");
        Example2 e2 = new Example2();
        System.out.println("SB end");
    }

    public Example2() {
        System.out.println("NPC start");
        Example2 e3 = new Example2(5);
        System.out.println("NPC end");
    }

    Example2(int x) {
        System.out.println("IPC executed");
    }

    static int a = m1();

    static int m1() {
        System.out.println("SV a is init");
        return 10;
    }

    int x = m2();

    int m2() {
        System.out.println("NSV x is init");
        return 30;
    }

    static {
        System.out.println("SB2 is executed");
    }

    {
        System.out.println("NSB is executed");
    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        Example2 e3 = new Example2();
        m3();
        e3.m4();
        System.out.println("Main end");
    }

    static void m3() {
        System.out.println("M3 start");
        Example2 e5 = new Example2();
        System.out.println("M3 end");
    }

    void m4() {
        System.out.println("M4 start");
        Example2 e6 = new Example2();
        System.out.println("M4 end");
    }

    static void m5() {
        System.out.println("M5 start");
        Example2 e7 = new Example2();
        System.out.println("M5 end");
    }
    static int b = 20;
    int y = 30;

    static {
        System.out.println("SB3 executed");
    }

    {
        System.out.println("NSB2 executed");
    }
    static Example2 e8 = new Example2(5);
}
