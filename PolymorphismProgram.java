package Assignments;
class P1{
	public void add() {
		System.out.println("method6");
	}
	public void add(int a) {
		System.out.println("method7");
	}
}
public class PolymorphismProgram extends P1 {
public void add() {
	System.out.println("method1");
}
public void add(int a) {
	System.out.println("method2");
}
public void add(int a, double b) {
	System.out.println("method3");
}
public void add(int a, double b,String k) {
	System.out.println("method4");
}
public static void main(String[] args) {
		PolymorphismProgram k1=new PolymorphismProgram();
		k1.add();
		k1.add(20);
		k1.add(30,87.5);
		k1.add(45,987.6,"Gowthami");
	}

}
