package mathmethod;

import java.util.Scanner;

public class Areaofarectanglebyhumaninput {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the l value");
		short l=s1.nextShort();
		System.out.println("Enter the b value");
		short b=s1.nextShort();
		int areaofarectangle = (l*b);
		System.out.print("Area of a rectangle is->");
		System.out.println(areaofarectangle);
		int circumferenceofarectangle= 2*(l+b);
		System.out.print("Circumference of a rectangle is->");
		System.out.println(circumferenceofarectangle);
		s1.close();

	}

}
