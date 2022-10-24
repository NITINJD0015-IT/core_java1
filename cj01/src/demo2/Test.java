
package demo2;

public class Test {
    public static void main(String[] args){
        Example.foo("Hk");
        Example e1= new Example();
        e1.foo(new C());
        int x= e1.go();
        System.out.println(e1.read());
        A a1 = e1.write(new D());
        I1 i = Example.sleep();
    }
}
