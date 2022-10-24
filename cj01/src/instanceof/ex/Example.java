
package ex;


public class Example {
    void m1(){
        System.out.println("m1");
    }
}
 class Sample extends Example{
    void m2(){
        System.out.println("m2");
    }
}
 class Test {
    static void m3(Object obj){
        if(obj instanceof Sample){
      Example e = (Example)obj;
            e.m1();
        }
      if(obj instanceof Sample){
      Sample s =(Sample)obj;
      s.m2();  
    }
    }
    public static void main(String[] args) {
     Test.m3(new Sample());
     Test.m3(new Example());
     Test.m3(new Object());
    }
 }
