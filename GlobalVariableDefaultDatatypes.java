package mathmethod;

public class GlobalVariableDefaultDatatypes {
	static byte a;
	static short b;
	int c;
	final static long d=657837l;
	static double e;
	final static float f=234.8f;
	  static boolean g;
	static String h;
	 char i;  //not defined in java
	
	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		GlobalVariableDefaultDatatypes k1=new GlobalVariableDefaultDatatypes();	
	System.out.println(k1.c);
	
	System.out.println(d);
	System.out.println(e);
	System.out.println(f);
	System.out.println(g);
	System.out.println(h);
	System.out.println(k1.i);  //so it is not executing

}
}
