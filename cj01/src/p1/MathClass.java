
public class MathClass {
	int a;
	float b;
	String c;
	void add(int i, float j){
		a = i;
		b = j;
		b = a + b;
		System.out.println(b);
	}
	
	void add(int i, String k){
		a = i;
		c = k;
		c = c + a;
		System.out.println(c+4+5);
	}
	
	void add(String k , int i){
		a = i;
		c = k;
		c = c + a;
		System.out.println(c);
	}
	void test(int...i ){
		for(int a : i){
			a = a+a;
			System.out.println();
			System.out.println(a);
		}
	}
	public static void main(String args[]){
		MathClass q = new MathClass(); 
		q.add(10, 15.5f);
		q.add(10, "XCV");
		q.add("XCV" ,12);
		q.test(1,2,3,4,5,6,7,8,8,8,8,8);
	}

}
