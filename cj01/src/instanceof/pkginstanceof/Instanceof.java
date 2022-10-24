package pkginstanceof;

class A {
}

class B extends A {
}

class C extends B {
}

class D {
}

public class Instanceof {

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a instanceof Object);
        System.out.println(a instanceof A);
        System.out.println(a instanceof B);
        System.out.println(a instanceof C);
        //System.out.println(a instanceof D);
        
        B b = new B();
        System.out.println(b instanceof Object);
        System.out.println(b instanceof A);
        System.out.println(b instanceof B);
        System.out.println(b instanceof C);
        //System.out.println(b instanceof D);

    }

}
