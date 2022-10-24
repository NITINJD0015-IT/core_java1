
package returning_obj;


public class ReturningObject {
    public static void main(String[] args){
        Temp t1 = new Temp(2);
        Temp t2;
        System.out.println("Before calling increse method");
        System.out.println("t1.x = "+t1.x);
        t2 = t1.increse();
        System.out.println("After calling increse method");
        System.out.println("t2.x = "+t2.x);
    }
    
}
