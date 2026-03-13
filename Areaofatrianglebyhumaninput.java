package mathmethod;

import java.util.Scanner;

public class Areaofatrianglebyhumaninput {
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
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
		sc.close();
		
	}

}
