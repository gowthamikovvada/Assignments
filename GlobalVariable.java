package mathmethod;

public class GlobalVariable {
	static int a=50;  //static global variable
	int b=20;     //instance variable or non static global variable
	static int c;
	final static double e=3.5; //final variable

	public static void main(String[] args) {
		int f=100;  //local variable
		System.out.println(f);
		System.out.println(a);
		System.out.println(c);
		GlobalVariable g1=new GlobalVariable(); //calling a non static global variable
//		g1.b;
		System.out.println(g1.b);
		System.out.println(ForLoop.d);  //calling a global variable from different class
		System.out.println(e);
	}

}
