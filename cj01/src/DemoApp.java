class Test {

    static {
        System.out.println("Test: static block");
    }

    public Test() {
        System.out.println("Test: o param constructor");
    }
}



class Demo {
    static{
        System.out.println("Demo: static block");
    }

    public Demo() {
        System.out.println("Demo: 0 param constructor");
    }
    
}


public class DemoApp {

    static {
        System.out.println("Demoapp:static block");
    }

    public static void main(String[] args) throws Exception {
        System.out.println("DemoApp: main");
        Test t1 = new Test();
        Test t2 = new Test();
        Class.forName("Demo");
        Class.forName("Demo");

    }

}
