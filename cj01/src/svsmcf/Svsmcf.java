package svsmcf;

class A {

    static int a = m1();

    static int m1() {
        System.out.println("ASV");
        return 10;
    }
    static{
        System.out.println("ASB");
    }

    public static void main(String[] args) {
        System.out.println("A Main");
    }

}
