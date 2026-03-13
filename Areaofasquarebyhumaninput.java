package mathmethod;

import java.util.Scanner;

public class Areaofasquarebyhumaninput {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the a value");
		int a=s1.nextInt();
		int areaofasquare = a*a;
		System.out.print("Area of a square is->");
		System.out.println(areaofasquare);
		int circumferenceofasquare= 4*a;
		System.out.print("Circumference of a square is->");
		System.out.println(circumferenceofasquare);
		s1.close();

	}

}
