package Assignments;

import java.util.Scanner;

public class UnCheckedExceptions {

	public static void main(String[] args) {
		try {
		int a=1/0;//Arithmetic exception
		
		System.out.println(a);
		}
		catch(ArithmeticException e) {
			System.out.println("Handled");
		}
		finally {
			System.out.println("Exception handling is done");
		}
/*String name="Gowthami";//StringIndexOutOfBoundsException
char c=name.charAt(9);
System.out.println(c);*/
		/*Scanner s1= new Scanner(System.in);
		int age=s1.nextInt();
		System.out.println(age);*/
	}

}
