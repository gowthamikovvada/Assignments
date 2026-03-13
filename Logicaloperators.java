package mathmethod;

import java.util.Scanner;

public class Logicaloperators {

	public static void main(String[] args) {
		//Divisible by 3 and 5 but not by 15
		Scanner s1=new Scanner(System.in);
		System.out.println("enter num value");
		int num=s1.nextInt();
		
		if((num%3==0) && (num/5==0)||(!(num/5==0)) && ((num/15!=0))) {
			System.out.println("It is divisible by 3 and 5 but not by 15");
		}
		else
		
		{
			System.out.println("It is a wrong calculation");	
		}
	}

}
