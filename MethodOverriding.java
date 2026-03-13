package Assignments;
class t1{
void add(int b) {
	System.out.println("It is an addition method");
}
}
public class MethodOverriding extends t1 {
	void add() {
		System.out.println("It is a subtraction method");
		
	}
	
	public static void main(String[] args) {
		MethodOverriding s1=new MethodOverriding();
		s1.add();
     
	}

}
