
package demo2;


public class Example {
    static void foo(String s){
        System.out.println("string-param"+s);
    }
    void foo(A a){
        System.out.println("A-param"+a);
    }
    int go(){
        System.out.println("non-param go");
        return 5;
    }
    String read(){
        System.out.println("no-param read");
        return "cj";
    }
    A write(I1 i){
        System.out.println("I1-param write"+i);
        return new A();
    }
    static I1 sleep(){
        System.out.println("no-param sleep");
        return new D();
    }
    
}
