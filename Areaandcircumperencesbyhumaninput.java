package mathmethod;

import java.util.Scanner;

public class Areaandcircumperencesbyhumaninput {
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		//circle
		System.out.println("Enter the r value");
		double r=sc.nextInt();
		double areaofacircle = Math.PI*r*r;
		System.out.println("Area of a circle is->"+areaofacircle);
		//System.out.println(areaofacircle);
		double circumferenceofacircle= 2*Math.PI*r;
		System.out.print("Circumference of a circle is->");
		System.out.println(circumferenceofacircle);
		
		//Triangle
		System.out.println("Enter the base value");
		int base=sc.nextInt();
		System.out.println("Enter the height value");
		int height=sc.nextInt();
		double Areaofatriangel= 0.5*base*height;
		System.out.print("Area of a Triangle is->");
		System.out.println(Areaofatriangel);
		System.out.println("Enter the a value");
		int a=sc.nextInt();
		System.out.println("Enter the b value");
		int b=sc.nextInt();
		System.out.println("Enter the c value");
		int c=sc.nextInt();
		int Circumferenceofatriange=a+b+c;
		System.out.print("Circumference of a Triangle is->");
		System.out.println(Circumferenceofatriange);
		
		//Rectangle
		System.out.println("Enter the l value");
		short length=sc.nextShort();
		System.out.println("Enter the b value");
		short breadth=sc.nextShort();
		int areaofarectangle = (length*breadth);
		System.out.print("Area of a rectangle is->");
		System.out.println(areaofarectangle);
		int circumferenceofarectangle= 2*(length+breadth);
		System.out.print("Circumference of a rectangle is->");
		System.out.println(circumferenceofarectangle);
		
		//Square
		System.out.println("Enter the a value");
		int side=sc.nextInt();
		int areaofasquare = side*side;
		System.out.print("Area of a square is->");
		System.out.println(areaofasquare);
		int circumferenceofasquare= 4*side;
		System.out.print("Circumference of a square is->");
		System.out.println(circumferenceofasquare);
		sc.close();
		
	}

}
