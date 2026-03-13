package Assignments;

public class AccessSpecifiersOfVariables {
	public static int a=10;
	protected String name="Gowthami";
	char c='R';
	private double d=109.67;
	public static void main(String[] args) {
		AccessSpecifiersOfVariables s1= new AccessSpecifiersOfVariables();
		System.out.println(a);
		System.out.println(s1.name);
		System.out.println(s1.c);
		System.out.println(s1.d);
		

	}

}
