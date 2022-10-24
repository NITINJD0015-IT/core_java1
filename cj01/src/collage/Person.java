
package collage;

public class Person {                       //super class
    
    //static fields/properties
    static final int eyes = 2;
    static final int ears = 2;
    static final int hand = 2;
    static final int legs = 2;
    
    //instance fields / properties
    String name;
    double height;
    double weight;
    
    void eat(){
        System.out.println(name+"is eating VEG");
    }
    void sleep(){
        System.out.println(name+"is eating sleeping");
    }
    void listen(){
        System.out.println(name+"is eating listening");
    }
}
