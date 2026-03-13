package Assignments;
public class MultipleInheritance implements I1,I2 {
public static void main(String[] args) {
		MultipleInheritance s1= new MultipleInheritance();
		s1.add();
		s1.sub();
		System.out.println("Will print this");
		}
	public void sub() {
	System.out.println("addition method");
		}
public void add() {
		System.out.println("subtraction method");
		}
@Override
public void mul() {
	// TODO Auto-generated method stub
	
}
	}
