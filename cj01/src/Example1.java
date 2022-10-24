package snsvm_ef;

public class Example1 {

    static Example1 e1 = new Example1();

    static {
        System.out.println("SB");
    }

    {
        System.out.println("NSB");
    }

    Example1() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println("Main");
        Example1 e2 = new Example1();
    }
    static int a = 10;
    int x = 20;
}
