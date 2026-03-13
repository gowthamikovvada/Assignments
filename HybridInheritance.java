package Assignments;

class Hyb1{
	static void min() {
		System.out.println("It will show the minimum value");
	}
}
class Hyb2 extends Hyb1{
	static void max() {
		System.out.println("It will show the maximum value");
	}
}

public class HybridInheritance extends Hyb2 {

	public static void main(String[] args) {
		min();
		max();

	}

}


