package Assignments;
public class ThisKeyword {
	int c;
	double f;
	void change(int d, double k) {
	this.c=d;
	this.f=k;
	}

	public static void main(String[] args) {
		
 ThisKeyword s1=new ThisKeyword();
 s1.change(20,30.3);
 System.out.println(s1.c);
 System.out.println(s1.f);
	}

}
