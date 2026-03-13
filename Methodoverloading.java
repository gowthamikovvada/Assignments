package mathmethod;

public class Methodoverloading {
	
	static void add() {
		int c=5;
		System.out.println(c);
	}
	static void add(int a,int b) {
		int c=5+a+b;
		System.out.println(c);
	}

	static void add(int a,double b,int d,double r) {
		double c= 5+a+b+d+r;
		System.out.println(c);
	}
	static void mul(int a,long b) {
		long c=5*a*b;
		System.out.println(c);
	}
	void mul(long a,int b,int d) {
		long c=5*a*b*d;
		System.out.println(c);
	}
	public static void main(String[] args) {
		add();
		add(6,7);
		add(23,347.5,7,434.6);
		mul(2,35678);
		
		Methodoverloading t1=new Methodoverloading();
		t1.mul(4536, 3, 5);
		

	}

}
