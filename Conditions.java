package mathmethod;
//import java.util.Scanner;
public class Conditions {
public static void main(String[] args) {
	/*	Scanner s1= new Scanner(System.in);
		System.out.println("Enter the age");
		int age=s1.nextInt();
		s1.close(); */  //We can write in this way also
		int age=18;
		if(age==18) 
		{
		int a=2;
		if(a<=age) 
			{
			short b=32;
			if(b>age)
				{
					System.out.println("He/she can vote");
				}
			}
			else 
			{
				System.out.println("It is a false");
			}
		}
		else if(age>18) 
		{
			System.out.println("He/she can also vote");
		}
		else 
		{
			System.out.println("He/she can not vote");
		}
	}

}
