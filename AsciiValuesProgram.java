package Assignments;

public class AsciiValuesProgram {
	public static void main() {
		System.out.println("This is the first main method");
	}
	public static void main(int a,String name) {
		System.out.println("It will print the int and String values");
	}
	public void main(double a,String name2) {
		System.out.println("It will print the double and String values");
	}

	public static void main(String[] args) {
		main();
		main(1,"Gowthami");
		AsciiValuesProgram a1=new AsciiValuesProgram();
		a1.main(3.7,"Amruth");

	}

}
