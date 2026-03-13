package mathmethod;
class SingleInheritance {
	void addition() {
		System.out.println("Addition of the below add method is ");
	}
static void add() {
	int a=20;
	int b=30;
	int c= a+b;
	System.out.println(c);
	}
}
class MultiInheritance extends SingleInheritance {
	void div() {
		System.out.println("Division need to be done by this method");
	}
}
public class ChildClass extends MultiInheritance{
	void subtraction() {
		System.out.println("Subtraction of the below sub method is ");
	}
static void sub() {
	int d=40;
	int e=30;
	int f= e-d;
	System.out.println(f);
	}
public static void main(String[] args) {
		ChildClass s1= new ChildClass();
		s1.addition();
		SingleInheritance.add();
		s1.div();
		s1.subtraction();
		ChildClass.sub();
		}
}


