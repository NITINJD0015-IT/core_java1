
package returning_obj;


public class Temp {
    int x;
   Temp(int a){
        x = a;
   } 
   
   Temp increse(){
       Temp tempobj = new Temp(x+10);
       return tempobj;
   }
}
