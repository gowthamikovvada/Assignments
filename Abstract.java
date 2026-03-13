package Assignments;
import java.util.Date;
abstract class Ab1 implements I1{
	abstract void method1();
	{
		}
}
abstract class Ab2 extends Ab1{
	abstract void method2();
	{
	}
	void method3() {
		System.out.println("method3 logic");
		}
	void method4() {
		System.out.println("method4 logic");
		}
}
public class Abstract extends Ab2 {
public static void main(String[] args) {
		Abstract s1=new Abstract();
s1.method1();
 s1.method2();
 s1.method3();
 s1.method4();
 s1.add();
 s1.mul();
	}
void method1() {
		System.out.println("method1 logic");
		}
void method2() {
		System.out.println("method2 logic");
	}

public void add() {
	System.out.println("method5 logic");
}

public void mul() {
	System.out.println("method6 logic");
	
}
@Override
public void sub() {
	// TODO Auto-generated method stub
	
}
}
