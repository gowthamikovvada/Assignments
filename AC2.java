package Assignments;
import java.util.Arrays;
import java.util.Scanner;
public class AC2 {

	public static void main(String[] args) 
	{
		
		int number[]= {546,8675,987,456};
		for(int i=0;i<number.length;i++) 
		{
			System.out.println("at index"+i);
			if(number[i]%2==0) 
			{
				System.out.println("It is an even number");
			}
			else 
			{
				System.out.println("It is an odd number");
			}
		}
		
		
}
}