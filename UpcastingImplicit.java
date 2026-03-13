package Assignments;
class Parent1{
	void addition() {
		int g=60;
		int h=50;
		int i=g+h;
		System.out.println(i);
	}
}
class Parent extends Parent1{
	void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
}
public class UpcastingImplicit extends Parent {
	void sub() {
		int d=30;
		int e=40;
		int f=d+e;
		System.out.println(f);
	}
	public static void main(String[] args) {
		Parent p1=new UpcastingImplicit();
		p1.add();
		UpcastingImplicit c1=(UpcastingImplicit)p1;
c1.sub();
p1.addition();
	}
}
