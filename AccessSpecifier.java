package Assignments;
public class AccessSpecifier {
	public static void add() {
			System.out.println("Addition");
		}
		protected void sub() {
			System.out.println("Subtraction");
		}
		void mul() {
			System.out.println("Multiplication");
		}
		private static void div() {
			System.out.println("Division");
		}
	public static void main(String[] args) {
add();
		AccessSpecifier s1=new AccessSpecifier();
		s1.sub();
AccessSpecifiersOfVariables s2=new AccessSpecifiersOfVariables();
	System.out.println(AccessSpecifiersOfVariables.a);
	System.out.println(s2.name);
	System.out.println(s2.c);
	AccessSpecifiersOfClass.add();
	}
	}
