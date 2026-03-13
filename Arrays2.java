package Assignments;
import java.util.Arrays;
import java.util.Scanner;
public class Arrays2 {
public static void main(String[] args) 
{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter size of an array1");
		int rollno1[]=new int[s1.nextInt()];
		for(int i=0;i<rollno1.length;i++) 
		{
			System.out.println("Enter the value at index" +i);	
	rollno1[i]=s1.nextInt();
		}
		System.out.println("Array1 is");
		System.out.println(Arrays.toString(rollno1));
		
		System.out.println("Enter size of an array2");
		int rollno2[]=new int[s1.nextInt()];
		for(int i=0;i<rollno2.length;i++) 
		{
			System.out.println("Enter the value at index" +i);	
	rollno2[i]=s1.nextInt();
		}
		System.out.println("Array2 is");
		System.out.println(Arrays.toString(rollno2));
		
	boolean result=	Arrays.equals(rollno1, rollno2);
		
	if(result==true) {
		System.out.println("Both are equal");
	}
	else {
		System.out.println("Both are not equal");
	}
		}

}
